
/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView, JetApp } from "webix-jet";
import { KBEntities } from "core/kb";


/***********************************************************************************
 * Application
 ***********************************************************************************/
export class ApplicationCache {
	public viewTypes: webix.DataCollection = null;
	public frames: webix.DataCollection = null;

	public lookupFrame(name: string): any {
		var id = this.frames.getFirstId();
		var frame = this.frames.getItem(id);
		while (frame != null) {

			// found
			if (frame.name == name)
				break;

			id = this.frames.getNextId(id, 1);
			frame = this.frames.getItem(id);
		}

		return frame;
	}
}

/***********************************************************************************
 * Actions
 ***********************************************************************************/
export abstract class ActionProvider {

	public check(action: string): boolean {

		if (this[action] != null)
			return true;

		return false;
	}

	public exec(action: string, params: any[]) {
		this[action].apply(null, params);
	}
}

export class ActionUtils {

	public static lookupAction(app: JetApp, frameName: string, action: string, callback: any): ActionProvider {

		var actionProvider: ActionProvider = app.getService(frameName + "Actions");

		if (actionProvider != null && actionProvider.check(action)) {
			callback(actionProvider);
			return;
		}

		const frame = KBEntities.lookupFrame(frameName, () => {

			var superNames: string[] = frame.getValues().superNames;
			if (superNames != null) {
				for (var superName of superNames) {
					actionProvider = app.getService(superName + "Actions");
					if (actionProvider == null)
						continue;

					if (!actionProvider.check(action)) {
						actionProvider = null;
						continue;
					}

					break;
				}
			}

			if (actionProvider == null) {
				alert("Action not found: " + frameName + "(" + action + ")");
				return;
			}

			callback(actionProvider);
		});
	}
}

/***********************************************************************************
 * Entry
 ***********************************************************************************/
export interface Entry {
}

export interface EntryFramed extends Entry {
	frame: string;
}
export interface EntryNamed extends EntryFramed {
	name: string;
}

/***********************************************************************************
 * Events
 ***********************************************************************************/
export function Subscribe(event: EventType) {

	return function(prototype: Widget<Entry, WidgetConfig<Entry>, webix.ui.baseview>, key: string, descriptor: PropertyDescriptor) {

		if (!prototype.subscriptions)
			prototype.subscriptions = new Array<Subscription>();

		var subscription: Subscription = descriptor as Subscription;
		subscription.event = event;
		subscription.method = key;

		prototype.subscriptions.push(subscription);
	};
}

export interface Subscription extends PropertyDescriptor {
	event: EventType;
	method: string;
}

export enum EventType {
	//	INIT = "mm-init",
	//	READY = "mm-ready",
	SELECT = "mm-select"
}

export class Event {

	public type: EventType;
	public source?: any;
	public entry?: any;

	constructor(type: EventType, source?: any, entry?: any) {
		this.type = type;
		this.source = source;
		this.entry = entry;
	}
}

/***********************************************************************************
 * Widgets
 ***********************************************************************************/
export class WidgetSetup {
	public name: string;
	public $cssName?: string;
	public defaults?: any;
}

export interface WidgetConfig<E extends Entry> extends webix.ui.viewConfig {
	localId?: string;
	entry?: E;
}

export abstract class Widget<E extends Entry, C extends WidgetConfig<E>, W extends webix.ui.baseview> {

	private view: W = null;
	private jetApp: JetApp = null;

	public subscriptions: Array<Subscription> = null;

	public getEntry(): E {
		return this.getConfig().entry;
	}

	public getConfig(): C {
		return this.view.config as C;
	}

	public getView(): W {
		return this.view;
	}

	public getApplication(): JetApp {
		return this.jetApp;
	}

	public abstract setup(setup: WidgetSetup): void;
	public abstract config(config: C): void;
	public abstract init(entry: E): void;
	public abstract ready(entry: E): void;

	// promise|string|array|object
	// public abstract load(data: any, type: string): void;

	public static _prototype<E extends Entry, W extends Widget<E, WidgetConfig<E>, webix.ui.baseview>>(jetApp_param: JetApp, prototype_param: W): any {

		const jetApp: JetApp = jetApp_param;
		const prototype: W = prototype_param;

		var target: WidgetSetup = {
			name: ""
		};

		// setup
		prototype.setup(target);

		target["$init"] = function(config: WidgetConfig<E>) {

			const widget: W = Object.create(prototype);
			widget.jetApp = jetApp;
			widget.config(config);

			// ready
			this.$ready.push(function() {

				//				alert("widget ready: " + prototype.constructor.name);

				widget.view = this;
				this["widget"] = widget;

				// events
				if (prototype.subscriptions) {

					for (const subscription of prototype.subscriptions) {
						this.attachEvent(subscription.event, (ev: Event) => {

							//                            alert( subscription.event + " -> " + widget.getView().name + "(" + JSON.stringify( widget.getConfig().entry ) + ")" );

							// TODO filter
							widget[subscription.method](ev);
						});
					}
				}
			});
		};

		return target;
	}
}

export interface WidgetContainerConfig<E extends Entry> extends WidgetConfig<E> {
}

export abstract class WidgetContainer<E extends Entry, C extends WidgetContainerConfig<E>, W extends webix.ui.baseview> extends Widget<E, C, W> {

	public static queryContainers(view: webix.ui.view): WidgetContainer<any, any, any>[] {

		var containers: WidgetContainer<any, any, any>[] = [];

		for (let child of view.getChildViews()) {

			if (child.widget instanceof WidgetContainer) {
				containers.push(child.widget);
			}
			else {
				var childContainers: WidgetContainer<any, any, any>[] = WidgetContainer.queryContainers(child);
				containers = containers.concat(childContainers);
			}
		}

		return containers;
	}

	public abstract notify(event: Event): void;

	public static notifyInit(entry: Entry, view: webix.ui.baseview): void {

		for (let child of view.getChildViews()) {
			//			alert("child " + child.name);

			if (child.widget instanceof Widget) {
				//				alert("child widget " + child.name);
				child.widget.init(entry);
			}

			WidgetContainer.notifyInit(entry, child);
		}
	}

	public static notifyReady(entry: Entry, view: webix.ui.baseview): void {

		for (let child of view.getChildViews()) {

			WidgetContainer.notifyReady(entry, child);

			if (child.widget instanceof Widget)
				child.widget.ready(entry);
		}
	}

	public static notifyEvent(event: Event, view: webix.ui.baseview, deep: boolean): void {

		if (view == event.source) {
			//            alert( 'exclude view: ' + view.config.id );
			return;
		}

		var proto = view as webix.ui.proto;

		if (proto.hasEvent && proto.hasEvent(event.type)) {
			var widget: Widget<any, any, any> = view["widget"];
			if (widget) {
				if (event.entry) {
					//                    alert( JSON.stringify( setup.parameters ) );
				}
			}
			//			alert("notify " + event.type + " to " + view.name)
			proto.callEvent(event.type, [event]);
		}

		// notify children
		if (deep)
			WidgetContainer.notifyEvents(event, proto.getChildViews());
	}

	public static notifyEvents(event: Event, views: any[]): void {

		for (let view of views) {
			if (view.widget instanceof WidgetContainer) {
				var container = view.widget;
				container.notify(event);
			}
			else {
				WidgetContainer.notifyEvent(event, view, true);
			}
		}
	}
}

/***********************************************************************************
 * Views
 ***********************************************************************************/
export class ViewType {
}

export abstract class View extends JetView {

	protected abstract doConfig(): any;

	protected getContainer(): WidgetContainer<any, any, any> {
		return this.getRoot()["widget"];
	}

	public config(): any {

		//		alert('config ' + this.constructor.name);

		var config = webix.extend({
			view: "mm-layout"
		}, this.doConfig(), false);

		return config;
	}

	public init(view: any, urls: any) {
		alert("view init: " + view.name);

		var entry: Entry = this.buildEntry(urls);
		this.getContainer().init(entry);
	}

	public ready(view: any, urls: any) {
		alert("view ready: " + view.name);

		var entry: Entry = this.buildEntry(urls);
		this.getContainer().ready(entry);
	}

	public urlChange(view: any, url: any) {
		alert("view urlChange: " + view.name);
		super.urlChange(view, url)
	}

	private buildEntry(urls): Entry {
		var entry: Entry = {};
		for (let i = 0; i < urls.length; i++) {
			var url = urls[i];
			for (const key in url.params) {
				entry[key] = url.params[key];
			}
		}

		return entry;
	}
}

export abstract class ViewFramed extends View {

	public getFrame(): any {
		return this.getParam("frame", false);
	}
}

export class ViewUtils {

	public static findView(app: JetApp, viewType: string, frameId: string): NodeRequire {

		// frame in role
		try {
			return require("jet-views/" + viewType + "/" + frameId);
		}
		catch (e) {
		}

		// search frame
		var cache: ApplicationCache = app.getService(ApplicationCache.name);
		var frame = cache.lookupFrame(frameId);
		if (frame == null) {
			alert("Frame not found: " + frameId);
			return;
		}

		// super frames
		for (let superName of frame.superNames) {

			try {
				return require("jet-views/" + viewType + "/" + superName);
			}
			catch (e) {
				//                    alert( e );
			}
		}

		return null;
	}
}

export abstract class WidgetWindow extends JetView {

	private body: View = null;

	constructor(app: any, name: any, body: View) {
		super(app, name);
		this.body = body;
	}

	public getBodyView(): View {
		return this.body;
	}

	config() {

		return {
			view: "window",
			move: true,
			position: "center",
			modal: true,
			head: {
				view: "layout",
				type: "head",
				padding: 8,
				rows: [
					{
						view: "toolbar",
						elements: [
							{
								view: "icon", icon: "mdi mdi-chevron-down",
								click: () => this.setFullScreen(false)
							},
							{
								view: "icon", icon: "mdi mdi-chevron-up",
								click: () => this.setFullScreen(true)
							},
							{
								view: "icon", icon: "mdi mdi-close",
								click: () => this.closeWindow()
							}
						]
					}
				]
			},
			fullscreen: false,
			resize: true,
			width: 1200,
			height: 600,
			body: this.getBodyView()
		}
	}

	public isFullScreen(): boolean {
		return this.getWindow()["fullscreen"] == true;
	}

	public getWindow(): webix.ui.window {
		return this.getRoot() as webix.ui.window;
	}

	public setFullScreen(fullScreen: boolean): void {
		var window = this.getWindow();
		window.define("fullscreen", fullScreen);
		window.resize();
	}

	public showWindow() {
		var window = this.getWindow();
		window.show();
	}

	public closeWindow() {
		var window = this.getWindow();
		window.destructor();
	}
}
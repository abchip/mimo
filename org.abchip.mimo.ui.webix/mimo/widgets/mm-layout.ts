/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";

import { WidgetSetup, WidgetConfig, WidgetContainerConfig, Widget, WidgetContainer, Subscribe, Event, EventType, Entry } from "core/ui";

export interface LayoutEntry extends Entry {
}

export interface LayoutConfig extends WidgetContainerConfig<LayoutEntry>, webix.ui.layoutConfig {
	toolbars?: any;
	widgets?: any;
	events?: any;
}

export class WidgetLayout extends WidgetContainer<LayoutEntry, LayoutConfig, webix.ui.layout> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-layout";
		setup.$cssName = "layout";
		setup.defaults = {
			rows: []
		}
	}

	public config(config: LayoutConfig): void {

		if (!config.widgets)
			return;

		var rows: any[] = [];

		for (let localId of Object.getOwnPropertyNames(config.widgets)) {

			var widgetConfig: WidgetConfig<Entry> = config.widgets[localId];
			widgetConfig.localId = localId;

			// widget prefix
			if (!widgetConfig.view.startsWith("mm-"))
				widgetConfig.view = "mm-" + widgetConfig.view;

			rows.push(widgetConfig);
		}

		config.rows = rows;
		config.widgets = null;
	}

	public init(entry: LayoutEntry): void {
		WidgetContainer.notifyInit(entry, this.getView());
	}

	public ready(entry: LayoutEntry): void {

		WidgetContainer.notifyReady(entry, this.getView());

		var config = this.getConfig();
		if (!config.events)
			return;

		for (let localId of Object.getOwnPropertyNames(config.events)) {

			const source = this.getView().queryView({ localId: localId });
			if (!source)
				continue;

			const event = config.events[localId];

			// event prefix
			if (!event.when.startsWith("mm-"))
				event.when = "mm-" + event.when;
			if (!event.then.startsWith("mm-"))
				event.then = "mm-" + event.then;

			// attach event
			alert("attach " + event.type + " to " + source.name);
			source.attachEvent(event.when, (ev: Event) => {
				this.notify(new Event(event.then, source, ev.entry));
			});
		}
	}

	public notify(event: Event): void {
		WidgetContainer.notifyEvent(event, this.getView(), true);
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetLayout.prototype), webix.ui.layout);
	}
}
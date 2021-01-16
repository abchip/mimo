/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetApp } from "webix-jet";
import { KBEntities } from "core/kb";
import { Widget, WidgetSetup, WidgetConfig, Subscribe, Event, EventType, EntryFramed } from "core/ui";
import { ActionProvider, ActionUtils } from "core/ui";
import { MenuUtils } from "widgets/mm-menu";

export interface ToolbarEntry extends EntryFramed {
}

export interface ToolbarConfig extends WidgetConfig<ToolbarEntry>, webix.ui.toolbarConfig {
	showFrame?: boolean;
	showEntity?: boolean;
}

export class WidgetToolbar extends Widget<ToolbarEntry, ToolbarConfig, webix.ui.toolbar> {

	private LABEL_IDX: number;
	private ENTITY_IDX: number;
	private FRAME_IDX: number;

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-toolbar";
		setup.$cssName = "toolbar";
		setup.defaults = {
			elements: []
		};
	}

	public config(config: ToolbarConfig): void {

		this.LABEL_IDX = 0;
		this.FRAME_IDX = 0;
		this.ENTITY_IDX = 0;

		var elements: any[] = [];

		// label
		var toolbarLabelConfig: webix.ui.labelConfig = {
			view: "label",
			align: "left",
			label: "xxx"
		};
		elements.push(toolbarLabelConfig);

		// spacer
		elements.push({});

		// entity
		if (config.showEntity) {
			var toolbarEntityConfig: webix.ui.toolbarConfig = {
				view: "toolbar",
				elements: []
			};
			this.ENTITY_IDX = elements.length;
			elements.push(toolbarEntityConfig);
		}

		// frame
		if (config.showFrame) {
			var toolbarFrameConfig: webix.ui.toolbarConfig = {
				view: "toolbar",
				elements: []
			};
			this.FRAME_IDX = elements.length;
			elements.push(toolbarFrameConfig);
		}

		config.elements = elements;
	}

	public init(entry: ToolbarEntry): void {

		// label
		if (this.getToolbarLabel()) {
			this.getToolbarLabel().setValue("pippo");
		}

		// frame
		if (this.getConfig().showFrame) {
			this.reloadFrameToolbar();
		}

		// entity
		if (this.getConfig().showEntity) {
			this.reloadEntityToolbar();
		}
	}

	public ready(entry: ToolbarEntry): void {
	}

	public getToolbarLabel(): webix.ui.label {
		var toolbar = this.getView();
		if (toolbar == null)
			return null;

		return toolbar.getChildViews()[this.LABEL_IDX];
	}

	public getToolbarFrame(): webix.ui.toolbar {
		var toolbar = this.getView();
		if (toolbar == null)
			return null;
		try {
			return toolbar.getChildViews()[this.FRAME_IDX];
		}
		catch (exc) {
			return null;
		}
	}

	public getToolbarEntity(): webix.ui.toolbar {
		var toolbar = this.getView();
		if (toolbar == null)
			return null;

		try {
			return toolbar.getChildViews()[this.ENTITY_IDX];
		}
		catch (exc) {
			return null;
		}
	}

	private reloadFrameToolbar() {

		const toolbar = this.getToolbarFrame();
		toolbar.reconstruct();

		const toolbarConfig: webix.DataRecord = this.lookupToolbar(this.getConfig().entry.frame, () => {

			toolbar.disable();

			if (toolbarConfig.getValues().elements == null)
				return;


			for (let viewConfig of toolbarConfig.getValues().elements) {

				var viewId = toolbar.addView(viewConfig);
				var view = toolbar.queryView({ "id": viewId });

				// onClick
                /*                view.attachEvent( 'onItemClick', ( id ) => {
                
                                    var selectedView = toolbar.queryView( { "id": id } );
                                    var action = selectedView.config.action;
                
                                    ActionUtils.lookupServiceByAction( this.app, this.getContainer().getFrame(), action, ( service: ActionProvider ) => {
                                        try {
                                            service.exec( action, [this.getContainer()] );
                                        }
                                        catch ( exc ) {
                                            alert( exc );
                                        }
                                    } );
                                } );*/
			}

			toolbar.enable();
			toolbar.refresh();
		});
	}

	private reloadEntityToolbar() {

		var toolbar = this.getToolbarEntity();
		toolbar.reconstruct();

		const contextMenuConfig: webix.DataRecord = MenuUtils.lookupContextMenu(this.getConfig().entry.frame, () => {

			toolbar.disable();

			if (contextMenuConfig.getValues().elements == null) {
				toolbar.refresh();
				return;
			}

			for (let actionConfig of contextMenuConfig.getValues().elements) {

				if (actionConfig.eClass == "http://www.abchip.org/mimo/ui#//menu/MenuAction")
					actionConfig["view"] = "icon";
				else if (actionConfig.eClass == "http://www.abchip.org/mimo/ui#//menu/MenuGroup")
					continue;

				var viewId = toolbar.addView(actionConfig);
				var view = toolbar.queryView({ "id": viewId });

				// onClick
				view.attachEvent('onItemClick', (id) => {

					var selectedView = toolbar.queryView({ "id": id });
					var action = selectedView.config.action;

					ActionUtils.lookupAction(this.getApplication(), this.getConfig().entry.frame, action, (service: ActionProvider) => {
                        /*                        try {
                                                    var entityName = this.getContainer().getSelectedName();
                                                    service.exec( action, [this.getView(), this.getConfig().entry.frame, entityName] );
                                                }
                                                catch ( exc ) {
                                                    alert( exc );
                                                }*/
					});
				});
			}
		});
	}

	private lookupToolbar(frame: string, callback): webix.DataRecord {

		var data = new webix.DataRecord({});
		if (callback != null)
			data.attachEvent("onAfterLoad", callback);

		data.parse(KBEntities.sendBizRequest("lookupToolbar", { frame: frame }), null);

		return data;
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetToolbar.prototype), webix.ui.toolbar);
	}
}
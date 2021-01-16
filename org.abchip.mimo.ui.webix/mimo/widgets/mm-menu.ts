/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { KBEntities } from "core/kb";
import { Widget, WidgetSetup, WidgetConfig, EntryFramed } from "core/ui";

export interface MenuEntry extends EntryFramed {
}

export interface MenuConfig extends WidgetConfig<MenuEntry>, webix.ui.layoutConfig {
}

export class WidgetMenu extends Widget<MenuEntry, MenuConfig, webix.ui.layout> {

	private static LOCAL_ID: string = "sidebar";

	private eventSelect: any = null;

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-menu";
		setup.$cssName = "layout";
	}

	public config(config: MenuConfig): void {
		config.rows = [
			{
				view: "toolbar",
				borderless: false,
				padding: 0,
				margin: 0,
				elements: [
					{
						view: "icon",
						icon: "mdi mdi-menu",
						align: "left",
						gravity: 0.05,
						click: () => {
							var sidebar = this.getSidebar();
							var resizer = this.getView().queryView("resizer") as webix.ui.resizer;
							var label = this.getView().queryView("toolbar_title") as webix.ui.label;
							var refresh = this.getView().queryView("toolbar_refresh") as webix.ui.icon;
							if (sidebar.getState().collapsed) {
								//                                            resizer.show();
								label.show();
								refresh.show();
							}
							else {
								//                                            resizer.hide();
								label.hide();
								refresh.hide();
							}
							sidebar.toggle();
						}
					},
					{
						view: "label",
						localId: "toolbar_title",
						align: "left",
						gravity: 0.1,
						label: "Application"
					},
					{
						view: "icon",
						localId: "toolbar_refresh",
						icon: "mdi mdi-refresh"
						//                        click: () => this.buildMenu( this.getUrl() )
					}

				]
			},
			{
				view: "sidebar",
				localId: WidgetMenu.LOCAL_ID,
				collapsed: false,
				multipleOpen: true,
				scroll: "auto"
			}
		];
	}

	public init(entry: MenuEntry): void {
	}

	public ready(entry: MenuEntry): void {
	}

	public getSidebar(): webix.ui.sidebar {
		var sidebar = this.getView().queryView(WidgetMenu.LOCAL_ID) as webix.ui.sidebar;
		return sidebar;
	}

	private buildMenu(urls: any[]) {

		if (this.eventSelect != null)
			this.getSidebar().detachEvent(this.eventSelect);

		this.getSidebar().clearAll();

		const menu: webix.DataRecord = MenuUtils.lookupMenu("", () => {
			if (menu.getValues() == null)
				return;

			this.getSidebar().parse(menu.getValues().elements, null);

			//            var url = this.getUrlString().slice( urls[0].page.length + 1 );
			//            this.selectItemSidebar( url, true );

			this.eventSelect = this.getSidebar().attachEvent("onItemClick", (id) => {
				var item = this.getSidebar().getItem(id);
				if (item.eClass == "http://www.abchip.org/mimo/ui#//menu/MenuAction") {
                    /*                    if ( item.filter != null ) {
                                            this.getView().show( item.action + "&filter=" + item.filter );
                                        }
                                        else
                                            this.getView().show( item.action );*/
				}
			});
		});
	}

	private openFirstSidebar() {

		var elementId = this.getSidebar().getFirstId();
		while (elementId != null) {
			var elementOld = elementId;
			elementId = this.getSidebar().getNextId(elementId, null);
			this.getSidebar().open(elementOld);
			break;
		}
	}

	private selectItemSidebar(url: string, all: boolean) {

		var elementId = this.getSidebar().getFirstId();
		while (elementId != null) {
			var menu = this.getSidebar().getItem(elementId);
			if (this.selectItemMenuSidebar(menu, url))
				if (!all)
					break;
			elementId = this.getSidebar().getNextId(elementId, null);
		}
	}

	private selectItemMenuSidebar(menu, url: string): boolean {

		var found: boolean = false;

		var elementId = this.getSidebar().getFirstChildId(menu.id);
		while (elementId != null) {
			var dataNode = this.getSidebar().getItem(elementId);
			if (dataNode.eClass == "http://www.abchip.org/mimo/ui#//menu/MenuAction") {
				var menuAction = dataNode;

				// TODO                + "&filter=" + item.filter
				if (menuAction.action == url && !menuAction.filter) {
					this.getSidebar().select(elementId, true);

					var parent = menuAction.$parent;
					while (parent != null) {
						try {
							this.getSidebar().open(parent);
							var parentItem = this.getSidebar().getItem(parent);
							parent = parentItem.$parent;
						}
						catch (exc) {
							parent = null;
						}
					}

					found = true;
				}
			}
			else if (dataNode.eClass == "http://www.abchip.org/mimo/ui#//menu/MenuGroup") {
				var menuGroup = dataNode;
				found = this.selectItemMenuSidebar(menuGroup, url);
			}
			else
				alert("Unexpected condition: wiertyfbaswei8dfdsfa");

			if (found)
				break;

			elementId = this.getSidebar().getNextSiblingId(elementId) as string;
		}

		return found;
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetMenu.prototype), webix.ui.layout);
	}
}

export class MenuUtils {

	public static lookupContextMenu(frame: string, callback): webix.DataRecord {

		var data = new webix.DataRecord({});
		if (callback != null)
			data.attachEvent("onAfterLoad", callback);

		data.parse(KBEntities.sendBizRequest("lookupContextMenu", { frame: frame }), null);

		return data;
	}

	public static lookupMenu(name, callback): webix.DataRecord {

		var data = new webix.DataRecord({});
		if (callback != null)
			data.attachEvent("onAfterLoad", callback);

		data.parse(KBEntities.sendBizRequest("lookupMenu", { name: name }), null);

		return data;
	}

	public static reloadContextMenu(contextMenu: webix.ui.contextmenu, frame: string) {

		contextMenu.clearAll();
		const contextMenuConfig: webix.DataRecord = MenuUtils.lookupContextMenu(frame, () => {

			if (contextMenuConfig.getValues().elements == null) {
				contextMenu.disable();
				return;
			}

			for (let actionConfig of contextMenuConfig.getValues().elements)
				contextMenu.add(actionConfig);

			contextMenu.enable();
		});
	}
}

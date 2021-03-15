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
import { Widget, WidgetSetup, WidgetConfig, Subscribe, Event, EventType, EntryFramed } from "core/ui";
import { ActionProvider, ActionUtils } from "core/ui";
import { MenuUtils } from "widgets/mm-menu";

export interface TableEntry extends EntryFramed {
    fields?: string;    
	filter?: string;
	keys?: string;
}

export interface TableConfig extends WidgetConfig<TableEntry>, webix.ui.layoutConfig {
	limit?: number;
}

export class WidgetTable extends Widget<TableEntry, TableConfig, webix.ui.layout> {

	private static LOCAL_ID: string = "entities_datatable";
	private static LIMIT: number = 2000;

	private contextMenu: webix.ui.contextmenu = null;

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-table";
		setup.$cssName = "layout";
	}

	public config(config: TableConfig): void {

		config.rows = [
			{
				view: "toolbar",
				elements: [
					{},
					{
						view: "icon", icon: "mdi mdi-wan"
					},
					{
						view: "icon", icon: "mdi mdi-download",
						click: () => this.download()
					},
					{
						view: "icon", icon: "mdi mdi-filter-outline",
						click: () => this.showFilter()
					},
					{
						view: "icon", icon: "mdi mdi-format-columns"
					},
					{
						view: "icon", icon: "mdi mdi-refresh",
						click: () => this.reloadData(null)
					}
				]
			},
			{
				view: "datatable",
				localId: WidgetTable.LOCAL_ID,
				autoConfig: false,
				dragColumn: true,
				resizeColumn: true,
				select: true,
				onClick: {
					"mdi-information-outline": (event, item) => {
						var entity = this.getDatatable().getItem(item);
						if (entity == null)
							return;

						ActionUtils.lookupAction(this.getApplication(), this.getConfig().entry.frame, "info", (service: ActionProvider) => {
							try {
								service.exec("info", [this, this.getConfig().entry.frame, this.getEntityName(entity)]);
							}
							catch (exc) {
								alert(exc);
							}
						});
					}
				}
			}
		];
	}

	private getDatatable(): webix.ui.datatable {
		return this.getView().queryView({ localId: WidgetTable.LOCAL_ID }) as webix.ui.datatable;
	}

	private getEntityName(entity: any) {

		var entityName = null;

		for (var i = 0; i < this.getDatatable().config.leftSplit; i++) {
			if (entityName == null)
				entityName = entity[this.getDatatable().columnId(i)];
			else
				entityName = entityName + "/" + entity[this.getDatatable().columnId(i)];
		}

		return entityName;
	}

	public init(entry: TableEntry): void {
		this.reloadTableColumns(entry);
	}

	public ready(entry: TableEntry): void {
		this.reloadData(entry);
	}

	private reload(entry: TableEntry) {

		this.reloadTableColumns(entry);
		this.reloadData(entry);

		// contextMenu
		//		MenuUtils.reloadContextMenu(this.contextMenu, this.getConfig().entry.frame);

	}

	private reloadData(entry: TableEntry) {

	    var fields = entry.fields;
		var keys = entry.keys;
		var filter = entry.filter;

		const datatable = this.getDatatable();
		datatable.clearAll();

		datatable.parse(KBEntities.findEntities(entry.frame, fields, keys, filter, WidgetTable.LIMIT), null);
	}

	private reloadTableColumns(entry: TableEntry) {

		const schema = this.lookupSchema(entry.frame, true, () => {

			this.getDatatable().config.columns = [];

			if (schema.getValues().columns != null) {

				var keysLength: number = 0;
				var indexColumn: number = 0;
				for (const columnConfig of schema.getValues().columns) {

					if (columnConfig.leftSplit == true) {
						keysLength++;
					}
					if (columnConfig.icon != null) {
						columnConfig.header = columnConfig.header + " <span class='webix_icon " + columnConfig.icon + "'></span> ";
					}

					switch (columnConfig.view) {
						case "checkbox":
							columnConfig.template = "{common.checkbox()}";
							break;
						default:
							break;
					}

					// TODO Verify me 
					switch (columnConfig.sort) {
						case "raw":
							if (columnConfig.view != "checkbox") {
								columnConfig.format = webix.Date.dateToStr(webix.i18n.fullDateFormat, false);
								//                              columnConfig.format = webix.i18n.dateFormatStr;
							}
							break;
						case "int":
							var numberFormat =
								function(value) {
									return webix.i18n.numberFormat(value)
								}
								;
							columnConfig.format = numberFormat;
							break;
						default:
							break;
					}

					if (columnConfig.group == "info") {
						columnConfig.hidden = true;
					}

					this.getDatatable().config.columns[indexColumn] = columnConfig;
					indexColumn = indexColumn + 1;
				}

				this.getDatatable().config.leftSplit = keysLength;

				// append info icon
				this.getDatatable().config.columns[indexColumn] = {
					id: "info",
					header: "Info",
					template: data => {
						return "<span class='webix_icon mdi mdi-information-outline'></span>";
					}
				};
			}

			this.getDatatable().refreshColumns(null, true);
		});
	}

	private attachContextMenu(): webix.ui.contextmenu {

		const contextMenu: webix.ui.contextmenu = webix.ui({
			view: "contextmenu"
			//          autowidth: true,
			//            autoheight: true,
			//            autofocus: true,
			//            height: 200,
			//            modal: true,
			//            openAction:"click"  
			//            master: datatable.$view.id
		}) as webix.ui.contextmenu;


		contextMenu.attachEvent('onShow', () => {
			//            contextMenu.resize();
			//            contextMenu.disable();
			//            contextMenu.enable();

			//            contextMenu.callEvent( "onFocus", null );
		});

		this.getDatatable().attachEvent('onFocus', () => {
			contextMenu.hide();
		});

		contextMenu.attachEvent('onBlur', () => {
			//            contextMenu.hide();
		});

		contextMenu.attachEvent('onMenuItemClick', (id) => {

			var frameName = null;
			var entityName = null;

			var context = contextMenu.getContext();
			var itemMenu = contextMenu.getMenuItem(id);

			var entity = this.getDatatable().getItem(context.id);

			frameName = entity["isa"];
			var index = frameName.lastIndexOf("/");
			frameName = frameName.substring(index + 1);

			entityName = this.getEntityName(entity);

			var action = itemMenu.action;
			ActionUtils.lookupAction(this.getApplication(), frameName, action, (service: ActionProvider) => {
				try {
					service.exec(action, [this, frameName, entityName]);
				}
				catch (exc) {
					alert(exc);
				}
			});
		});

		contextMenu.attachTo(this.getDatatable());

		return contextMenu;
	}

	private showFilter() {
		//        var win = webix.ui( QueryBuilderWindow ) as QueryBuilderWindow;
		//        win.showWindow();
	}

	private download() {
		webix.toExcel(this.getDatatable());
	}

	private lookupSchema(name, prototype, callback): webix.DataRecord {

		var data = new webix.DataRecord({});
		if (callback != null)
			data.attachEvent("onAfterLoad", callback);

		data.parse(KBEntities.sendBizRequest("lookupSchema", { frame: name, name: name, prototype: prototype }), null);

		return data;
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetTable.prototype), webix.ui.layout);
	}
}
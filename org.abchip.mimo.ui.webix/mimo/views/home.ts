/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";
import { ApplicationToolbar } from "views/application";

export default class HomeView extends JetView {

	config() {

		return {
			view: "layout",
			rows: [
				ApplicationToolbar,
				{
					cols: [
						CustomMenu,
						{ view: "resizer", localId: "resizer" },
						{ $subview: true }
					]
				}
			]
		};
	}
}

class CustomMenu extends JetView {

	private eventSelect: any = null;

	config() {

		return {
			rows: [
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
								var sidebar = this.$$("sidebar") as webix.ui.sidebar;
								var resizer = this.$$("resizer") as webix.ui.resizer;
								var label = this.$$("toolbar_title") as webix.ui.label;
								var refresh = this.$$("toolbar_refresh") as webix.ui.icon;
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
						}

					]
				},
				{
					localId: "sidebar",
					view: "sidebar",
					collapsed: false,
					multipleOpen: true,
					scroll: "auto",
					data: [
						{
							icon: "mdi mdi-login",
							value: "Login",
							action: "/login"
						},
						{
							icon: "mdi mdi-package",
							value: "Catalog",
							action: "search?frame=Product"
						},
						{
							icon: "mdi mdi-file-document",
							value: "Quotes",
							action: "search?frame=Quote"
						},
						{
							icon: "mdi mdi-file-document",
							value: "Invoices",
							action: "search?frame=Invoice"
						},
						{
							value: "Applications",
							data: [
								{
									value: "Biz Tenant",
									action: "/biz"
								}
							]
						},
						{
							value: "Test",
							data: [
								{
									value: "View",
									action: "testViews"
								},
								{
									value: "Widgets",
									action: "testWidgets"
								},
								{
									value: "Fields",
									action: "testFields"
								}
							]
						}
					]
				}
			]
		};
	}

	public ready(view: any, urls: any[]) {
		var sidebar = this.$$("sidebar") as webix.ui.sidebar;

		if (this.eventSelect != null)
			sidebar.detachEvent(this.eventSelect);
		this.eventSelect = sidebar.attachEvent("onAfterSelect", (id) => {
			var item = sidebar.getItem(id);
			if (item.filter != null) {
				this.show(item.action + "&filter=" + item.filter);
			}
			else {
				this.show(item.action);
			}
		});
	}
}
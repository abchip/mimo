/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { KBEntities } from "core/kb";
import { Widget, WidgetSetup, WidgetConfig, Event, EventType, Subscribe, EntryNamed } from "core/ui";
import { ActionProvider, ActionUtils } from "core/ui";
import { MenuUtils } from "widgets/mm-menu";


export interface ComboEntry extends EntryNamed {
	filter?: string;
}

export interface ComboConfig extends WidgetConfig<ComboEntry>, webix.ui.comboConfig {
}


export class WidgetCombo extends Widget<ComboEntry, ComboConfig, webix.ui.combo> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-combo";
		setup.$cssName = "combo";
		setup.defaults = {
			labelWidth: 250,
			//            maxWidth: 500,
			icon: "mdi mdi-menu-down",
			options: []
		};
	}

	public config(config: ComboConfig): void {

	}

	public init(entry: ComboEntry): void {

		var list = this.getView().getList() as webix.ui.list;
		list.parse(KBEntities.findNames(entry.frame, null), null);

		//        const contextMenu = UIFormUtils.attachContextMenu( this.jetApp, this.config.domain.frame, view );
		//        MenuUtils.reloadContextMenu( contextMenu, this.config.domain.frame );
	}

	public ready(entry_p: ComboEntry): void {

		const entry = entry_p;

		this.getView().attachEvent("onChange", (name) => {

			var ev = new Event(EventType.SELECT, this.getView(), {
				frame: entry_p.frame,
				name: name
			});

			this.getView().callEvent(ev.type, [ev]);
		});
	}

	private attachContextMenu(frame: string): webix.ui.contextmenu {

		const contextMenu: webix.ui.contextmenu = webix.ui({
			view: "contextmenu",
			autofocus: true,
			master: this.getView().getInputNode().id
		}) as webix.ui.contextmenu;


		contextMenu.attachEvent('onShow', () => {

			//            contextMenu.adjust();
			//            contextMenu.enable();
			//            contextMenu.callEvent( "onFocus", null );

			if (this.getView().getValue() == "")
				contextMenu.hide();
		});

		this.getView().attachEvent('onBlur', () => {
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

			var action = itemMenu.action;
			ActionUtils.lookupAction(this.getApplication(), frame, action, (service: ActionProvider) => {
				try {
					service.exec(action, [this, frame, this.getView().getValue()]);
				}
				catch (exc) {
					alert(exc);
				}
			});
		});

		return contextMenu;
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetCombo.prototype), webix.ui.combo);
	}
}
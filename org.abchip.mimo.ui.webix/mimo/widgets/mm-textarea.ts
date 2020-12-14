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
import { Widget, WidgetSetup, WidgetConfig, Entry } from "core/ui";

export interface TextAreaEntry extends Entry {
}

export interface TextAreaConfig extends WidgetConfig<TextAreaEntry>, webix.ui.layoutConfig {
}

export class WidgetTextArea extends Widget<TextAreaEntry, TextAreaConfig, webix.ui.layout> {

	private static LOCAL_ID: string = "textarea";

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-textarea";
		setup.$cssName = "layout";
		setup.defaults = {
			labelWidth: 250
		};
	}


	public config(config: TextAreaConfig): void {

		config.rows = [
			{
				view: "toolbar",
				elements: [
					{
						view: "icon", icon: "mdi mdi-eraser"
						//                        click: () => this.clearTextArea()
					},
					{
						view: "icon", icon: "mdi mdi-refresh"
					},
					{
						view: "icon", icon: "mdi mdi-content-save",
						click: () => {
							alert(KBEntities.stringify(this.getView().queryView(WidgetTextArea.LOCAL_ID).getValue()));
							//                        KBEntities.saveEntity( this.getFrame(), this.getForm().getValues() );
						}
					}
				]
			},
			{
				view: "textarea",
				localId: WidgetTextArea.LOCAL_ID
			}
		];
	}

	public init(entry: TextAreaEntry): void {
	}

	public ready(entry: TextAreaEntry): void {
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetTextArea.prototype), webix.ui.layout);
	}
}
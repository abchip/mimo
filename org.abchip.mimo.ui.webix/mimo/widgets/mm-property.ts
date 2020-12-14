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
import { Widget, WidgetSetup, WidgetConfig, Subscribe, Event, EventType, EntryNamed } from "core/ui";

export interface PropertyEntry extends EntryNamed {
}

export interface PropertyConfig extends WidgetConfig<PropertyEntry>, webix.ui.layoutConfig {
}

export class WidgetProperty extends Widget<PropertyEntry, PropertyConfig, webix.ui.layout> {

	private static LOCAL_ID: string = "entity_properties";

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-property";
		setup.$cssName = "layout";
	}

	private getProperty(): webix.ui.property {
		return this.getView().queryView(WidgetProperty.LOCAL_ID) as webix.ui.property;
	}

	public config(config: PropertyConfig): void {

		config.rows = [
			{
				view: "toolbar",
				elements: [
					{
						view: "icon", icon: "mdi mdi-refresh"
					}
				]
			},
			{
				view: "property",
				elements: []
			}
		];
	}

	public init(entry: PropertyEntry): void {

		const entity = KBEntities.lookupEntity(entry.frame, entry.name, () => {
			const frame = KBEntities.lookupFrame(entry.frame, () => {
				var index: number = 0;
				for (const slot of frame.getValues().slots) {
					if (slot.group != "info")
						continue;

					//                    alert( KBEntities.stringify( slot ) );
					this.getProperty().config.elements[index] = {
						id: slot.name,
						label: slot.text,
						type: "text",
						value: entity.getValues()[slot.name]
					}
					index = index + 1;
				}

				this.getProperty().config["labelWidth"] = 500;
				this.getProperty().refresh();
				//  properties.setValues( entity.getValues() );
			});
		});
	}

	public ready(entry: PropertyEntry): void {
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetProperty.prototype), webix.ui.layout);
	}
}
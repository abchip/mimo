/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { Widget, WidgetSetup, WidgetConfig, Entry } from "core/ui";

export interface SwitchEntry extends Entry {
}

export interface SwitchConfig extends WidgetConfig<SwitchEntry>, webix.ui.switchButtonConfig {
}

export class WidgetSwitch extends Widget<SwitchEntry, SwitchConfig, webix.ui.switchButton> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-switch";
		setup.$cssName = "switch";
		setup.defaults = {
			labelWidth: 250,
			uncheckValue: "0",
			checkValue: "1",
			value: "1",
			customCheckbox: true
		};
	}

	public config(config: SwitchConfig): void {
	}

	public init(entry: SwitchEntry): void {
	}

	public ready(entry: SwitchEntry): void {
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetSwitch.prototype), webix.ui.switchButton);
	}
}
/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { Widget, WidgetSetup, WidgetConfig, Entry } from "core/ui";

export interface TextEntry extends Entry {
}

export interface TextConfig extends WidgetConfig<TextEntry>, webix.ui.textConfig {
}

export class WidgetText extends Widget<TextEntry, TextConfig, webix.ui.text> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-text";
		setup.$cssName = "text";
		setup.defaults = {
			labelWidth: 250
		};
	}

	public config(config: TextConfig): void {
	}

	public init(entry: TextEntry): void {
	}

	public ready(entry: TextEntry): void {
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetText.prototype), webix.ui.text);
	}
}
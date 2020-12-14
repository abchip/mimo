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

export interface ImageEntry extends Entry {
}

export interface ImageConfig extends WidgetConfig<ImageEntry>, webix.ui.layoutConfig {
	label?: string;
	name?: string;
}

export class WidgetImage extends Widget<ImageEntry, ImageConfig, webix.ui.layout> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-image";
		setup.$cssName = "icon";
	}

	public config(config: ImageConfig): void {
		config.cols = [
			{
				view: "label",
				label: config.label
			},
			{
				view: "layout",
				rows: [
					{
						view: "text",
						name: config.name,
						on: {
							onChange(newVal, oldVal) {
								const label = this.getParentView().getChildViews()[1];
								//                                        label.define( "template", "<img src='" + newVal + "'>" );
								label.define("template", "<img src='/images/Product/default.jpg'>");
								label.refresh();
							}
						}
					},
					{
						view: "label",
						width: 512,
						height: 396,
						template: "<img src='images/" + "Product" + "/default.jpg'>"
					}
				]
			},
			{}
		];
	}

	public init(entry: ImageEntry): void {
	}

	public ready(entry: ImageEntry): void {
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetImage.prototype), webix.ui.layout);
	}
}
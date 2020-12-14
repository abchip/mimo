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

export interface ReviewEntry extends Entry {
}

export interface ReviewConfig extends WidgetConfig<ReviewEntry>, webix.ui.layoutConfig {
	label?: string;
}

export class WidgetReview extends Widget<ReviewEntry, ReviewConfig, webix.ui.layout> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-review";
		setup.$cssName = "icon";
	}

	public config(config: ReviewConfig): void {
		config.cols = [
			{
				view: "label",
				label: config.label
			},
			{
				view: "layout",
				cols: [
					{
						view: "icon",
						icon: "mdi mdi-star-circle-outline",
						align: "left"
					},
					{
						view: "icon",
						icon: "mdi mdi-star-circle-outline",
						align: "left"
					},
					{
						view: "icon",
						icon: "mdi mdi-star-circle-outline",
						align: "left"
					},
					{
						view: "icon",
						icon: "mdi mdi-star-circle",
						align: "left"
					},
					{
						view: "icon",
						icon: "mdi mdi-star-circle-outline",
						align: "left"
					}
				]
			},
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{}
		];
	}

	public init(entry: ReviewEntry): void {
	}

	public ready(entry: ReviewEntry): void {
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetReview.prototype), webix.ui.layout);
	}
}
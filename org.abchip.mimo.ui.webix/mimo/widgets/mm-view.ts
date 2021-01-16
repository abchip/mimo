/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { WidgetSetup, WidgetContainerConfig, Widget, WidgetContainer, Subscribe, EventType, Event, EntryFramed } from "core/ui";

export interface ViewEntry extends EntryFramed {
}

export interface ViewConfig extends WidgetContainerConfig<ViewEntry>, webix.ui.layoutConfig {
	type: string;
}

export class WidgetView extends WidgetContainer<ViewEntry, ViewConfig, webix.ui.layout> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-view";
		setup.$cssName = "layout";
	}

	public config(config: ViewConfig): void {
	}

	public init(entry: ViewEntry): void {
		WidgetContainer.notifyInit(entry, this.getView());
	}

	public ready(entry: ViewEntry): void {
		WidgetContainer.notifyReady(entry, this.getView());
	}

	public notify(event: Event): void {
		WidgetContainer.notifyEvent(event, this.getView(), true);
	}

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetView.prototype), webix.ui.layout);
	}
}
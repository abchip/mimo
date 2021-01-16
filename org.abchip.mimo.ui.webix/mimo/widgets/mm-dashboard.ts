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

export interface DashboardEntry extends EntryFramed {
}

export interface DashboardConfig extends WidgetContainerConfig<DashboardEntry>, webix.ui.layoutConfig {
	connectedFilter?: boolean
}

export class WidgetDashboard extends WidgetContainer<DashboardEntry, DashboardConfig, webix.ui.layout> {
	public setup(setup: WidgetSetup): void {
		setup.name = "mm-dashboard";
		setup.$cssName = "layout";
	}

	public notify(event: Event): void {
		WidgetContainer.notifyEvent(event, this.getView(), true);
	}

	public config(config: DashboardConfig): void {
	}

	public init(entry: DashboardEntry): void {
		WidgetContainer.notifyInit(entry, this.getView());
	}

	public ready(entry: DashboardEntry): void {
		WidgetContainer.notifyReady(entry, this.getView());
	}


	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetDashboard.prototype), webix.ui.layout);
	}
}
/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { WidgetSetup, WidgetContainerConfig, Widget, WidgetContainer, Subscribe, EventType, Event } from "core/ui";

export interface DashboardConfig extends WidgetContainerConfig, webix.ui.layoutConfig {
    connectedFilter?: boolean
}

export class WidgetDashboard extends WidgetContainer<DashboardConfig, webix.ui.layout> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-dashboard";
        setup.$cssName = "layout";
    }

    public notify( event: Event ): void {
        WidgetContainer.notifyEvent( event, this.getView(), true );
    }

    public config( config: DashboardConfig ): void {
        
    }
    
    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetDashboard.prototype ), webix.ui.layout );
    }
}
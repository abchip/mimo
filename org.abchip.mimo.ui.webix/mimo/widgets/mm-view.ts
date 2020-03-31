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

export interface ViewConfig extends WidgetContainerConfig, webix.ui.layoutConfig {
    type: string;
    frame: string;
}

export class WidgetView extends WidgetContainer<ViewConfig, webix.ui.layout> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-view";
        setup.$cssName = "layout";
    }

    public config( config: ViewConfig ): void {
        
    }
    
    public notify( event: Event ): void {
        WidgetContainer.notifyEvent( event, this.getView(), true );
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetView.prototype ), webix.ui.layout );
    }
}
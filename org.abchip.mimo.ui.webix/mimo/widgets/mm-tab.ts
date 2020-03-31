/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { Widget, WidgetSetup, WidgetConfig } from "core/ui";


export interface TabConfig extends WidgetConfig, webix.ui.tabviewConfig {
}

export class WidgetTab extends Widget<TabConfig, webix.ui.tabview> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-tab";
        setup.$cssName = "tabview";
    }

    public config( config: TabConfig ): void {
        
    }

    private addOption( id: string, value: string, close: boolean, config: webix.ui.baselayoutConfig ) {

        var view: webix.ui.layout = this.getView().queryView( { "id": id } );
        if ( view != null )
            this.getView().getMultiview().removeView( id );

        this.getView().getTabbar().addOption( { id: id, value: value, close: close } );

        if ( config != null )
            this.getView().getMultiview().addView( config );
        // proxy view
        else {
            var viewConfig = {
                id: id,
                view: "layout",
                rows: [
                    {
                        gravity: 0.1
                    }
                ]
            };
            this.getView().getMultiview().addView( viewConfig );
        }

    }

    private removeOption( id: string | number ): void {
        try {
            ( this.getView().getTabbar() as webix.ui.tabbar ).removeOption( id );
            var view: webix.ui.baseview = this.getView().queryView( { "id": id } );
            if ( view != null )
                view.destructor();
        }
        catch ( e ) {
        }
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetTab.prototype ), webix.ui.tabview );
    }
}
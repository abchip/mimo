/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View } from "core/ui";

export default class SearchProduct extends View {

    protected doConfig(): any {

        return {
            "view": "mm-layout",
            "rows": [
                {
                    "view": "mm-checkbox",
                    "mode": "edit",
                    "label": "CheckBox"
                },
                {
                    "cols": [
                        {
                            "view": "label",
                            "label": "Toolbar"
                        },
                        {
                            "view": "mm-toolbar",
                            "showFrame": true,
                            "showEntity": true,
                            "entry": {
                                "frame": "Product"
                            }
                        }
                    ]
                }
            ]
        };
    }

    /*
    public init( view: any, urls: any[] ) {
        super.init( view, urls );

        this.app.attachEvent( "entities:filter", ( filter ) => {
            this.setParam( "filter", filter, true );
        } );


        // onClick
        var routes = this.$$( "routes_list" ) as webix.ui.list;
        routes.attachEvent( 'onItemClick', ( id ) => {
            var slot = routes.getItem( id );
            var filter = slot.domain.route + "= '" + this.getSelectedName() + "'";
            filter = encodeURIComponent( filter );
            this.show( "table?frame=" + slot.domain.frame + "&filter=" + filter );
        } );

        // context menu
        this.contextMenu = this.attachContextMenu();
    }

    public ready( view: any, urls: any[] ) {
        super.ready( view, urls );

        // dynamic toolbar entity
        const toolbar = this.getToolbarView().getToolbarEntity();
        this.getDatatable().attachEvent( "onSelectChange", () => {
            var selectedId = this.getDatatable().getSelectedId( false, true );
            if ( selectedId ) {
                toolbar.enable();
            }
            else
                toolbar.disable();
        } );
    }*/

    public urlChange( view: any, url: any ) {
        super.urlChange( view, url )
        /*        if ( !this.getFrame() )
                    return;
        
                this.reload();
        
                const frame = KBEntities.lookupFrame( this.getParam( "frame", true ), () => {
                    this.buildRoutes( frame.getValues() );
                } );
        
                var dashboard = this.$$( "dashboard" ) as webix.ui.accordion;
                if ( this.getParam( "frame", true ) == "Party" || this.getParam( "frame", true ) == "Product" ) {
                    //            dashboard.reconstruct();
                    dashboard.show();
                }
                else
                    dashboard.hide();*/
    }

    private buildRoutes( frame: object ) {

        var routes = this.$$( "routes_list" ) as webix.ui.list;
        routes.clearAll();

        ( this.$$( "routes_accordion" ) as webix.ui.accordion ).hide();

        var slots: any[] = frame["slots"];
        for ( var slot of slots ) {

            if ( slot.derived != true )
                continue;

            if ( !slot.route )
                continue;

            var item = webix.extend( slot, { id: slot.name } );
            routes.add( item );

            ( this.$$( "routes_accordion" ) as webix.ui.accordion ).show();
        }
    }
}
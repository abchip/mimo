/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";
import { KBEntities, KBService, KBServices } from "base/kb";
import { UIToolbarView, UITableView, UIMenuUtils } from "base/ui";
import { QueryBuilderWindow } from "views/query";
import { FrameDashboard } from "views/dashboard";
import { EntityInfoWindow } from "views/info";

export class EntitiesTable extends UITableView {

    private static DATATABLE: string = "entities_datatable";
    private static DATATABLE_NRELEM: number = 2000;

    private contextMenu: webix.ui.contextmenu = null;

    public getComponentConfig(): webix.ui.toolbarConfig {

        var toolbarComponentConfig: webix.ui.toolbarConfig = {
            view: "toolbar",
            elements: [
                {
                    view: "icon", icon: "mdi mdi-wan"
                },
                {
                    view: "icon", icon: "mdi mdi-download",
                    click: () => this.download()
                },
                {
                    view: "icon", icon: "mdi mdi-filter-outline",
                    click: () => this.showFilter()
                },
                {
                    view: "icon", icon: "mdi mdi-format-columns"
                },
                {
                    view: "icon", icon: "mdi mdi-refresh",
                    click: () => this.reloadData()
                }
            ]
        };

        return toolbarComponentConfig;
    }

    public getDatatable(): webix.ui.datatable {
        return this.$$( EntitiesTable.DATATABLE ) as webix.ui.datatable;
    }

    protected doConfig(): any {

        return {
            cols: [
                {
                    rows: [
                        {
                            view: "datatable",
                            localId: EntitiesTable.DATATABLE,
                            autoConfig: false,
                            dragColumn: true,
                            resizeColumn: true,
                            select: true,
                            onClick: {
                                "mdi-information-outline": ( event, item ) => {
                                    var entity = this.getDatatable().getItem( item );
                                    if ( entity == null )
                                        return;

                                    KBServices.lookupServiceByAction( this.app, this.getFrame(), "info", ( service: KBService ) => {
                                        try {
                                            service.exec( "info", [this, this.getFrame(), this.getEntityName( entity )] );
                                        }
                                        catch ( exc ) {
                                            alert( exc );
                                        }
                                    } );
                                }
                            }
                        },
                        {
                            view: "accordion",
                            multi: true,
                            localId: "dashboard",
                            collapsed: true,
                            rows: [
                                {
                                    header: "Sales",
                                    body: FrameDashboard
                                }
                            ]
                        }
                    ]
                },
                {
                    view: "accordion",
                    localId: "routes_accordion",
                    type: "wide",
                    multi: true,
                    collapsed: true,
                    cols: [
                        {
                            header: "Routes",
                            width: 200,
                            body: {
                                view: "list",
                                localId: "routes_list",
                                select: true,
                                template: "#text#",
                                data: []
                            }
                        }
                    ]
                }
            ]
        }
    }

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
    }

    public urlChange() {
        super.urlChange();

        if ( !this.getFrame() )
            return;

        this.reload();

        var dashboard = this.$$( "dashboard" ) as webix.ui.accordion;
        if ( this.getFrame() == "Party" || this.getFrame() == "Product" ) {
            //            dashboard.reconstruct();
            dashboard.show();
        }
        else
            dashboard.hide();
    }

    public reload() {

        this.reloadTableColumns( true, () => {
            this.reloadData();    
        });

        // contextMenu
        UIMenuUtils.reloadContextMenu( this.contextMenu, this.getFrame() );

        const frame = KBEntities.lookupFrame( this.getFrame(), () => {
            this.buildRoutes( frame.getValues() );
        } );
    }

    private showFilter() {
        var win = this.ui( QueryBuilderWindow ) as QueryBuilderWindow;
        win.showWindow();
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

    private reloadData() {

        var fields = this.getFields();
        var keys = this.getKeys();
        var filter = this.getFilter();

        const datatable = this.getDatatable();
        datatable.clearAll();

        datatable.eachColumn(
            function( columnId ) {

                var columnConfig: any = datatable.getColumnConfig( columnId );
                if ( fields )
                    fields = fields + "," + columnConfig.id;
                else
                    fields = columnConfig.id;
            }
        )

        datatable.parse( KBEntities.findEntities( this.getFrame(), fields, keys, filter, EntitiesTable.DATATABLE_NRELEM ), null );
    }

    private download() {
        webix.toExcel( this.getDatatable() );
    }
}

export default class EntitiesTableDefault extends EntitiesTable {
}

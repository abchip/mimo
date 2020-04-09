/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { KBEntities } from "core/kb";
import { Widget, WidgetSetup, WidgetConfig, Subscribe, Event, EventType } from "core/ui";

export interface QueryConfig extends WidgetConfig, webix.ui.layoutConfig {
}

export class WidgetQuery extends Widget<QueryConfig, webix.ui.layout> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-query";
        setup.$cssName = "layout";
    }

    public config( config: QueryConfig ): void {

        config.rows = [
            {
                view: "toolbar",
                elements: [
                    {
                        view: "icon", icon: "mdi mdi-eraser"
                    },
                    {
                        view: "icon", icon: "mdi mdi-refresh"
                    },
                    {
                        view: "icon", icon: "mdi mdi-content-save",
                        click: () => {
                            var queryBuilder = this.getView().queryView( "query_builder" ) as webix.ui.querybuilder;
                            var sql: string = queryBuilder.toSQL().sql;
                            this.getView().callEvent( "entities:filter", [sql] );
                        }
                    }
                ]
            },
            {
                view: "querybuilder",
                localId: "query_builder",
                scroll: "auto",
                fields: []

            }
        ];
    }

    @Subscribe( EventType.INIT )
    public init_( event: Event ): void {

        const queryConfig: webix.DataRecord = this.lookupQuery( event.entry.frame, true, () => {

            // reconstruct
            var queryBuilder = this.getView().queryView( "query_builder" ) as webix.ui.querybuilder;
            queryBuilder.config.fields = fields;

            // chek empty
            if ( queryConfig.getValues().fields == null ) {
                // TODO 
                return;
            }

            // load fields
            var fields: any[] = [];
            for ( let fieldConfig of queryConfig.getValues().fields ) {
                fields.push( fieldConfig );
            }
            queryBuilder.config.fields = fields;

            // size calculation
            var calculatedHeight: number = queryConfig.getValues().fields.length * 50;
            if ( calculatedHeight > 300 )
                queryBuilder.define( "height", 300 );
            else
                queryBuilder.define( "height", calculatedHeight );
            queryBuilder.define( "width", 800 );

            queryBuilder.resize();
        } )
    }

    private lookupQuery( frame: string, prototype: boolean, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupQuery", { frame: frame, name: frame, prototype: prototype } ), null );

        return data;
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetQuery.prototype ), webix.ui.layout );
    }
}
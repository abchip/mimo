/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { UIWindowView, UIQueryView, UIQueryUtils } from "base/ui";

export class QueryBuilder extends UIQueryView {

    public getComponentConfig(): webix.ui.toolbarConfig {

        var toolbarComponentConfig: webix.ui.toolbarConfig = {
            view: "toolbar",
            elements: [
                {
                    view: "icon", icon: "mdi mdi-eraser"
                },
                {
                    view: "icon", icon: "mdi mdi-refresh",
                    click: () => this.buildQuery()
                },
                {
                    view: "icon", icon: "mdi mdi-content-save",
                    click: () => {
                        var queryBuilder = this.$$( "query_builder" ) as webix.ui.querybuilder;
                        var sql: string = queryBuilder.toSQL().sql;
                        this.app.callEvent( "entities:filter", [sql] );
                    }
                }
            ]
        }

        return toolbarComponentConfig;
    }

    protected doConfig(): any {

        return {
            view: "querybuilder",
            localId: "query_builder",
            scroll: "auto",
            fields: []
        }
    }

    public urlChange() {
        super.urlChange();

        this.buildQuery();
    }

    private buildQuery() {

        const queryConfig: webix.DataRecord = UIQueryUtils.lookupQuery( this.getParam( "frame", true ), true, () => {

            // reconstruct
            var queryBuilder = this.$$( "query_builder" ) as webix.ui.querybuilder;
            queryBuilder.config.fields = fields;

            // chek empty
            if ( queryConfig.getValues().fields == null ) {
                // TODO 
                return;
            }

            // load fields
            var fields =  [] ;
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
}

export class QueryBuilderWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new QueryBuilder( app, name, null ) );
    }
}

export default class QueryBuilderDefault extends QueryBuilder {
}

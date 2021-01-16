/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { getBizServicePath } from "config/host";

export class KBEntities {

    public static getContext(): any {
        var context = webix.storage.local.get( "context" );
        return context;
    }

    static ajax: webix.Ajax = null;

    public static stringify( object ): string {
        var cache = [];
        var str = JSON.stringify( object,
            // custom replacer fxn - gets around "TypeError: Converting circular
            // structure to JSON"
            function( key, value ) {
                if ( typeof value === 'object' && value !== null ) {
                    if ( cache.indexOf( value ) !== -1 ) {
                        // Circular reference found, discard key
                        return;
                    }
                    // Store value in our collection
                    cache.push( value );
                }
                return value;
            }, 4 );
        cache = null; // enable garbage collection

        return str;
    }

    public static sendBizRequest( path: string, params?: any, callback?: any ): Promise<any> {

        var url: string = getBizServicePath() + "/" + path;

        // append jsessionid
        var context = this.getContext();
        if ( context != null && context.id != null )
            url = url + ";jsessionid=" + context.id

        if ( KBEntities.ajax == null ) {
            /*            webix.attachEvent( "onBeforeAjax",
                            function( mode, url, data, request, headers, files, promise ) {
                                headers["xhrFields"] = { withCredentials: true };
                                headers["crossDomain"] = true;
                            }
                        );*/

            //            alert( "ecchilo!! " + path );
            KBEntities.ajax = webix.ajax() as webix.Ajax;
        }

        //return webix.ajax( url, params ) as Promise<any>;
        //return KBEntities.ajax.post( url, params );
        //return (webix.ajax() as webix.Ajax).post( url, params, callback );
        return KBEntities.ajax.post( url, params, callback );
    }

    public static lookupFrame( id, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );
        
        data.parse( KBEntities.sendBizRequest( "lookup", { frame: "Frame", id: id } ), null );

        return data;
    }

    public static findFrames( callback?): webix.DataCollection {

        var data = new webix.DataCollection( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "find", { frame: "Frame" } ), null );

        return data;
    }
    
    public static lookupEntity( frame, id, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookup", { frame: frame, id: id } ), null );

        return data;
    }
    
    public static findEntities( frame: string, keys: string | string[], filter: string, limit?: number, callback?): webix.DataCollection {

        var data = new webix.DataCollection( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        var params = { frame: frame };
        if ( keys )
            params = webix.extend( params, { keys: keys } );
        if ( filter )
            params = webix.extend( params, { filter: filter } );
        if ( limit )
            params = webix.extend( params, { limit: limit } );

        data.parse( KBEntities.sendBizRequest( "find", params ), null );

        return data;
    }

    public static findNames( frame: string, filter: string, callback?): webix.DataCollection {

        var data = new webix.DataCollection( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        var params = { frame: frame };
        if ( filter )
            params = webix.extend( params, { filter: filter } );

        data.parse( KBEntities.sendBizRequest( "findNames", params ), null );

        return data;
    }
    
    public static saveEntity( frame: string, values: any ) {
        var jsonValues = KBEntities.stringify( values );

        KBEntities.sendBizRequest( "save", { frame: frame, json: values } );
    }

    public static deleteEntity( frame: string, id: string ) {
        KBEntities.sendBizRequest( "delete", { frame: frame, id: id } );
    }
}
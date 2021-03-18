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


export class KBService {

    public checkAction( name: string ): boolean {

        if ( this[name] != null )
            return true;

        return false;
    }

    public exec( action: string, params: any[] ) {
        this[action].apply( null, params );
    }

    /*
        try {
            var m = require( "models/" + this.getParam( "frame", null ) );
            if ( m[action] == null ) {
                alert( 'Service not found: ' + action );
                return;
            }
    
            m[action]( this );
        }
        catch ( exc ) {
            alert( exc );
        }
    */

}

export class KBEntities {

    public static getContext(): any {
        var context = webix.storage.local.get( "context" );
        return context;
    }


    static ajax: webix.Ajax = null;

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

            KBEntities.ajax = webix.ajax() as webix.Ajax;
        }

        //return webix.ajax( url, params ) as Promise<any>;
        //return KBEntities.ajax.post( url, params );
        //return (webix.ajax() as webix.Ajax).post( url, params, callback );

        return KBEntities.ajax.post( url, params, callback );
    }

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

    public static lookupFrame( name, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookup", { frame: "Frame", id: name } ), null );

        return data;
    }

    public static findEntities( frame: string, fields: string | string[], keys: string | string[], filter: string, nrElem?: number, callback?): webix.DataCollection {

        var data = new webix.DataCollection( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        var params = { frame: frame };
        if ( fields )
            params = webix.extend( params, { fields: fields } );
        if ( keys )
            params = webix.extend( params, { keys: keys } );
        if ( filter )
            params = webix.extend( params, { filter: filter } );
        if ( nrElem )
            params = webix.extend( params, { nrElem: nrElem } );

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

    public static lookupEntity( frame, name, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        if ( frame == "BizEntityNoteData" ) {
            alert( "Unexpected condition: 968bgn450e9w86t'" );
            return data;
        }

        data.parse( KBEntities.sendBizRequest( "lookup", { frame: frame, id: name } ), null );

        return data;
    }

    public static saveEntity( frame: string, values: any ) {
        var jsonValues = KBEntities.stringify( values );

        KBEntities.sendBizRequest( "save", { frame: frame, json: values , replace: true} );
    }

    public static deleteEntity( frame: string, name: string ) {
        KBEntities.sendBizRequest( "delete", { frame: frame, id: name } );
    }
}

export class KBServices {

    public static lookupServiceByAction( app: any, frameName: string, action: string, callback ) {

        var serviceName: string = frameName + "Services";
        var service: KBService = KBServices.getServiceByName( app, serviceName );

        if ( service == null || !service.checkAction( action ) ) {
            const frame = KBEntities.lookupFrame( frameName, () => {

                var superNames: string[] = frame.getValues().superNames;
                if ( superNames != null ) {
                    for ( var superName of superNames ) {
                        serviceName = superName + "Services";
                        service = KBServices.getServiceByName( app, serviceName );
                        if ( service == null )
                            continue;
                        if ( !service.checkAction( action ) ) {
                            service = null;
                            continue;
                        }

                        break;
                    }
                }

                if ( service == null ) {
                    alert( "Action not found: " + frameName + "(" + action + ")" );
                    return;
                }

                callback( service );
            } )
        }
        else
            callback( service );
    }

    public static getServiceByClass<S extends KBService>( app: any, klass: typeof KBService ): S {
        return KBServices.getServiceByName( app, klass.name ) as S;
    }

    public static getServiceByName( app: any, name: string ): KBService {
        return app.getService( name ) as KBService;
    }

    public static setService( app: any, service: KBService ) {
        app.setService( service.constructor.name, service );
    }
}
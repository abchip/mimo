/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp, EmptyRouter, HashRouter, UrlRouter, plugins } from "webix-jet";

import { KBEntities } from "base/kb";
import session from "base/ctx";
import "config/styles/app.css";

import { EntityServices } from "services/Entity";
import { EntityIdentifiableServices } from "services/EntityIdentifiable";
import { PartyServices } from "services/Party";
import { FrameServices } from "services/Frame";
import { ProductCategoryServices } from "services/ProductCategory";
import { BizEntityNoteServices } from "services/BizEntityNote";

declare var APPNAME;
declare var VERSION;
declare var PRODUCTION;
declare var BUILD_AS_MODULE;

export default class App extends JetApp {


    constructor() {

        super( {
            id: APPNAME,
            version: VERSION,
            start: "/home",
            //            router: BUILD_AS_MODULE ? EmptyRouter : UrlRouter,
            //            routerPrefix: "mimo",
            router: HashRouter,
            debug: !PRODUCTION,
            views: ( name ) => {
                if ( name === '_xyz_' ) {
                    alert( name );
                    return import( "views/query" );
                }
                return name;
            },
            theme: webix.storage.local.get( "theme_color" ) || ""
        } );

        this.use( plugins.Locale, null );

        this.use(( app: JetApp ) => {
            app.setService( "EntityServices", new EntityServices() );
            app.setService( "EntityIdentifiableServices", new EntityIdentifiableServices() );
            app.setService( "FrameServices", new FrameServices() );
            app.setService( "PartyServices", new PartyServices() );
            app.setService( "ProductCategoryServices", new ProductCategoryServices() );
            app.setService( "BizEntityNoteServices", new BizEntityNoteServices() );
        }, null );

        this.attachEvent( "app:error", function( err ) {
            alert( "Error" );
        } );

        this.attachEvent( "app:error:resolve", function( err, url ) {
            alert( "Delay" ); // webix.delay(() => app.show("/some"));
        } );


        this.use( plugins.User, {
            model: session,
            ping: 60000,
            afterLogin: "biz",
            public: path => {
                return ( path.indexOf( "out-of-service" ) > -1 || path.indexOf( "loginTenant" ) > -1 );
            }
        } );
    }

    _loadViewDynamic( url ) {

        /*        if ( url.startsWith( "jsessionId#" ) ) {
                    
                    alert( url );
                    
                    var n = url.indexOf( "jsessionId#" );
                    var id: string = url.substr( n - 1 + 12 );
        
                    webix.storage.local.remove( "context" )
                    webix.storage.local.put( "context", {
                        "eClass": "http://www.abchip.org/mimo#//context/ContextDescription",
                        "id": id
                    } );
        
                    url = "home";
                }*/

        try {
            return require( "jet-views/" + url );
        }
        catch ( e ) {
            //            alert( e );
            return require( "mimo-views/" + url );
        }
    }

}

if ( !BUILD_AS_MODULE ) {
    webix.ready(() => new App().render() );
}
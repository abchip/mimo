import * as webix from "@xbs/webix-pro";

import { KBEntities } from "base/kb";

function status() {

    return KBEntities.sendBizRequest( "status", null, {
        
        error: function( text, data, xhr ) {
//            alert( "error: " + xhr.getAllResponseHeaders() );
        },
        success: function( text, data, xhr ) {
//            alert( "success: " + xhr.getAllResponseHeaders() );
        }
    } ).then( function( value ) {

//        alert( 'status then: ' + KBEntities.stringify( value.json() ) );

        webix.storage.local.remove( "context" )
        webix.storage.local.put( "context", value.json() );

        return value.json();
    } ).catch( function( value ) {

        webix.storage.local.remove( "context" )
        alert( "status catch: " + KBEntities.stringify( value.json() ) );

        return value.json();
    } );
}

function login( user, password, tenant ) {

    return KBEntities.sendBizRequest( "login", {
        user: user,
        password: password,
        tenant: tenant
    } ).then( function( value ) {

//        alert( 'login then: ' + KBEntities.stringify( value.json() ) );

        webix.storage.local.remove( "context" )
        webix.storage.local.put( "context", value.json() );

        return value.json();
    } ).catch( function( value ) {

        webix.storage.local.remove( "context" );
        alert( "login catch: " + KBEntities.stringify( value.json() ) );

        return value.json();
    } );
}

function logout() {

    return KBEntities.sendBizRequest( "logout" ).then( function( value ) {
        webix.storage.local.remove( "context" );
        return value.json();
    } ).catch( function( value ) {

        webix.storage.local.remove( "context" );
        alert( "logout catch: " + KBEntities.stringify( value.json() ) );

        return value.json();
    } );
}

export default {
    status, login, logout
}
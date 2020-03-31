/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";
import { KBEntities } from "core/kb";
import { ApplicationToolbar } from "views/application";

export default class LoginView extends JetView {
    config() {

        const login_form = {
            view: "form",
            localId: "form",
            width: 400, borderless: false, margin: 10,
            rows: [
                { view: "text", name: "login", label: "User Name", labelPosition: "top" },
                { view: "text", type: "password", name: "pass", label: "Password", labelPosition: "top" },
                { view: "text", name: "tenant", label: "Tenant", labelPosition: "top" },
                { view: "button", value: "Login", click: () => this.do_login(), hotkey: "enter" }
            ],
            rules: {
                login: webix.rules.isNotEmpty,
                pass: webix.rules.isNotEmpty
            }
        };
        
        const login_third = {
            cols: [
                {
                    view: "button",
                    type: "image",
                    align: "left",
                    image: "images/github.png",
                    click: () => this.thirdLogin( "GitHub" ),
                    width: 50
                },
                {
                    view: "button",
                    type: "image",
                    align: "left",
                    image: "images/google.png",
                    click: () => this.thirdLogin( "Google" ),
                    width: 50
                },
                {
                    view: "button",
                    type: "image",
                    align: "left",
                    image: "images/linkedin.png",
                    click: () => this.thirdLogin( "LinkedIn" ),
                    width: 50
                }
            ]
        };

        return {
            view: "layout",
            rows: [
                ApplicationToolbar,
                {},
                {
                    cols: [
                        {},
                        login_form,
                        {}
                    ]
                },
                {
                    cols: [
                        {},
                        login_third,
                        {}
                    ]
                },
                {}
            ]
        };
    }

    init( view ) {
        view.$view.querySelector( "input" ).focus();
    }

    do_login() {
        const user = this.app.getService( "user" );
        const form = this.$$( "form" ) as webix.ui.form;

        if ( form.validate() ) {
            const data = form.getValues();
            const userLogin = data.tenant + "/" + data.login;
            user.login( userLogin, data.pass ).catch( function() {
                webix.html.removeCss( form.$view, "invalid_login" );
                form.elements.pass.focus();
                webix.delay( function() {
                    alert( "Invalid login" );
                    webix.html.addCss( form.$view, "invalid_login" );
                } );
            } );
        }
    }

    thirdLogin( provider: string ) {

        KBEntities.sendBizRequest( "login", { provider: provider }, {
            success: function( text, data, xhr ) {
                var location = xhr.getResponseHeader( "Location" );
                if ( location )
                    window.location = location;
            }
        } ).then( function( value ) {

            alert()
            
            webix.storage.local.remove( "context" )
            webix.storage.local.put( "context", value.json() );
        } ).catch( function( value ) {

            webix.storage.local.remove( "context" )
            alert( "status catch: " + KBEntities.stringify( value.json() ) );
        } );;
    }
}
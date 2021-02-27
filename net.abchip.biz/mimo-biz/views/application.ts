/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";
import { KBEntities } from "base/kb";
import { UIMenuView } from "base/ui";

export class ApplicationToolbar extends JetView {

    config() {

        var srcPicture = "images/account-circle.png";
        if ( KBEntities.getContext().picture ) {
            srcPicture = KBEntities.getContext().picture;
        }

        return {
            view: "toolbar",
            elements: [
                {
                    rows: [
                        {
                            height: 70,
                            cols: [
                                {
                                    view: "template",
                                    gravity: 0.33,
                                    borderless: true,
                                    data: { src: "images/abchip_small.png" },
                                    template: function( obj ) {
                                        return "<img class='image' src='" + obj.src + "'/>"
                                    },
                                    onClick: {
                                        "image": function() {
                                            // go to home
                                            this.$scope.app.show();
                                        }
                                    }
                                },
                                {
                                    view: "icon",
                                    icon: "mdi mdi-microphone",
                                    align: "left",
                                    click: () => {
                                    }
                                },
                                {
                                    view: "form",
                                    borderless: true,
                                    label: "?",
                                    elements: [
                                        {
                                            view: "text",
                                            id: "my_input",
                                            placeholder: "Insert a command or ? to help"
                                        }
                                    ]
                                },
                                {},
                                {
                                    view: "label",
                                    template: "<img class='image' style='width:63px; height:63px;' src='" + srcPicture + "'>",
                                    gravity: 0.1,
                                    borderless: true,
                                    popup: {
                                        view: "popup",
                                        head: "Submenu",
                                        width: 400,
                                        body: {
                                            view: "layout",
                                            rows: [
                                                {
                                                    view: "label",
                                                    label: "Tenant: " + KBEntities.getContext().tenant,
                                                },
                                                {
                                                    view: "label",
                                                    label: "User: " + KBEntities.getContext().user,
                                                },
                                                {
                                                    view: "label",
                                                    label: "ContextId: " + KBEntities.getContext().id,
                                                },
                                                {
                                                    view: "label",
                                                    label: "Anonymous: " + KBEntities.getContext().anonymous,
                                                },
                                                {
                                                    view: "label",
                                                    label: "<span class='webix_icon mdi mdi-settings'></span> Profile settings",
                                                    click: () => {
                                                        this.show( "profileSettings" );
                                                    }
                                                },
                                                {
                                                    view: "label",
                                                    label: "<span class='webix_icon mdi mdi-logout'></span> Logout",
                                                    click: () => {
                                                        this.show( "/logout" );
                                                    }
                                                }
                                            ],
                                            autowidth: true,
                                            autoheight: true,
                                            select: true
                                        }
                                    }
                                }
                            ]
                        }
                    ]
                }
            ]
        };
    }

    ready( view: any, urls: any[] ) {
        super.ready( view, urls );

        var input = $$( "my_input" ) as webix.ui.text;
        input.attachEvent( "onEnter", ( ev ) => {

            //            alert( KBEntities.stringify( input.getValue() ) );

            if ( input.getValue().trim() == "?" )
                alert( "Ma un giorno il vitello dai piedi di balsa si reco' dal vitello coi piedi di cobalto. Gli disse C'e' il vitello coi piedi tonnati che parla molto male di te: sostiene che i tuoi piedi non sono di vero cobalto ma sono soltanto quattro piedi di pane ricoperti da un sottile strato di cobalto. " );
            else {

                var splitted = input.getValue().trim().split( " ", 2 );

                if ( splitted.length <= 1 )
                    this.show( "table?frame=" + splitted[0] );
                else {
                    if ( splitted[0] == "Frame" )
                        this.show( "modifyFrame?frame=" + splitted[0] + "&name=" + splitted[1] + "&mode=save" );
                    else
                        this.show( "editor?frame=" + splitted[0] + "&name=" + splitted[1] + "&mode=save" );
                }
            }
        } );
    }
}

export class ApplicationMenu extends UIMenuView {

    protected getComponentConfig(): webix.ui.toolbarConfig {
        return null;
    }

    config() {

        return {
            rows: [
                {
                    view: "toolbar",
                    borderless: false,
                    padding: 0,
                    margin: 0,
                    elements: [
                        {
                            view: "icon",
                            icon: "mdi mdi-menu",
                            align: "left",
                            gravity: 0.05,
                            click: () => {
                                var sidebar = this.$$( "sidebar" ) as webix.ui.sidebar;
                                var resizer = this.$$( "resizer" ) as webix.ui.resizer;
                                var label = this.$$( "toolbar_title" ) as webix.ui.label;
                                var refresh = this.$$( "toolbar_refresh" ) as webix.ui.icon;
                                if ( sidebar.getState().collapsed ) {
                                    //                                            resizer.show();
                                    label.show();
                                    refresh.show();
                                }
                                else {
                                    //                                            resizer.hide();
                                    label.hide();
                                    refresh.hide();
                                }
                                sidebar.toggle();
                            }
                        },
                        {
                            view: "label",
                            localId: "toolbar_title",
                            align: "left",
                            gravity: 0.1,
                            label: "Application"
                        },
                        {
                            view: "icon",
                            localId: "toolbar_refresh",
                            icon: "mdi mdi-refresh",
                            click: () => this.buildMenu( this.getUrl() )
                        }

                    ]
                },
                {
                    localId: "sidebar",
                    view: "sidebar",
                    collapsed: false,
                    multipleOpen: true,
                    scroll: "auto"
                }
            ]
        };
    }

    public getSidebar(): webix.ui.sidebar {
        var sidebar = this.$$( "sidebar" ) as webix.ui.sidebar;
        return sidebar;
    }
}
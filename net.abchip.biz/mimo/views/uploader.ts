/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { KBEntities } from "base/kb";
import { UIUploaderView, UIWindowView } from "base/ui";

export class EntitiesUpload extends UIUploaderView {

    public getComponentConfig(): webix.ui.toolbarConfig {

        var toolbarComponentConfig: webix.ui.toolbarConfig = {
            view: "toolbar",
            elements: [
                {
                    view: "icon", icon: "mdi mdi-eraser",
                    click: () => this.clear()
                }
            ]

        }

        return toolbarComponentConfig;
    }

    protected doConfig(): any {

        return {
            view: "form",
            localId: "form_import",
            elementsConfig: { labelAlign: "right" },
            rows: [
                {
                    view: "uploader",
                    localId: "entities_upl1",
                    autosend: false,
                    value: "Select files",
                    link: "entities_upl1_files",
                    upload: ""
                },
                {
                    view: "list",
                    id: "entities_upl1_files",
                    type: "uploader",
                    borderless: true,
                    scroll: "auto"
                },
                {
                    type: "head",
                    cols: [
                        {
                            view: "button",
                            label: "Send",
                            click: () => this.send()
                        }
                    ]
                }
            ]
        };
    }

    public getList(): webix.ui.list {
        return this.$$( "entities_upl1_files" ) as webix.ui.list;
    }

    public init( view: any, config: any ) {
        super.init( view, config );

        var entities_upl1 = this.$$( "entities_upl1" ) as webix.ui.uploader;

        var uploadUri = this.getUpload();
        var context = KBEntities.getContext();
        if ( context != null && context.id != null )
            uploadUri = uploadUri + ";jsessionid=" + context.id
        entities_upl1.config.upload = uploadUri;

        entities_upl1.attachEvent( "onUploadComplete", function( response ) {
            webix.message( "Done" );
        } );

        entities_upl1.attachEvent( "onFileUpload", function( file, response ) {
            if ( response.warning == "" ) {
                webix.message( {
                    type: "success",
                    text: response.info
                } );
            }
            else {
                webix.message( {
                    type: "success",
                    text: response.info
                } );
                webix.message( {
                    type: "debug",
                    text: response.info + "<br/>" + response.warning,
                    expire: 20000
                    //                  expire: -1
                } );
            }
        } );

        entities_upl1.attachEvent( "onFileUploadError", function( file, response ) {
            webix.message( {
                type: "error",
                text: response.info + "<br/>" + response.error,
                expire: -1
            } );

            if ( response.warning != "" ) {
                webix.message( {
                    type: "debug",
                    text: response.info + "<br/>" + response.warning,
                    expire: 20000
                    //                  expire: -1
                } );
            };
        } );
    }

    send() {
        var entities_upl1 = this.$$( "entities_upl1" ) as webix.ui.uploader;
        entities_upl1.send( null );
    }

    clear() {
        this.getList().clearAll();
    }
}

export class EntitiesUploadWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new EntitiesUpload( app, name, null ) );
    }
}

export default class EntitiesUploadDefault extends EntitiesUpload {
}
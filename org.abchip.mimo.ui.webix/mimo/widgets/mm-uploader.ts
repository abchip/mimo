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

export interface UploaderConfig extends WidgetConfig, webix.ui.layoutConfig {
    upload: string;
}

export class WidgetUploader extends Widget<UploaderConfig, webix.ui.layout> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-uploader";
        setup.$cssName = "layout";
    }

    public config( config: UploaderConfig ): void {

        config.rows = [
            {
                view: "toolbar",
                elements: [
                    {
                        view: "icon",
                        icon: "mdi mdi-eraser",
                        click: () => this.clear()
                    },
                    {
                        view: "button",
                        icon: "mdi mdi-send",
                        click: () => this.send()
                    }

                ]
            },
            {
                view: "uploader",
                localId: "entities_upl1",
                autosend: false,
                value: "Select files",
                link: "entities_upl1_files",
                upload: config.upload
            },
            {
                view: "list",
                id: "entities_upl1_files",
                type: "uploader",
                borderless: true,
                scroll: "auto"
            }
        ];
    }

    @Subscribe( EventType.INIT )
    public init_( event_p: Event ): void {

        var entities_upl1 = this.getView().queryView( "entities_upl1" ) as webix.ui.uploader;

        var uploadUri = this.getConfig().upload;
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

    private getList(): webix.ui.list {
        return this.getView().queryView( "entities_upl1_files" ) as webix.ui.list;
    }

    private send() {
        var entities_upl1 = this.getView().queryView( "entities_upl1" ) as webix.ui.uploader;
        entities_upl1.send( null );
    }

    private clear() {
        this.getList().clearAll();
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetUploader.prototype ), webix.ui.layout );
    }
}

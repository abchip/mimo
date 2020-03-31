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
import { Widget , WidgetSetup, WidgetContainerConfig, WidgetContainer, Subscribe, EventType, Event } from "core/ui";

export interface FormConfig extends WidgetContainerConfig, webix.ui.layoutConfig {
}

export class WidgetForm extends WidgetContainer<FormConfig, webix.ui.layout> {

    private static LOCAL_ID: string = "entity_form";

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-form";
        setup.$cssName = "form";
        setup.defaults = {
            elements: [],
            scroll: true
        };
    }

    public notify( event: Event ): void {
        WidgetContainer.notifyEvent( event, this.getView(), false );
    }

    public getForm(): webix.ui.form {
        return this.getView().queryView( WidgetForm.LOCAL_ID ) as webix.ui.form;
    }

    public config( config: FormConfig ): void {

        config.rows = [
            {
                view: "toolbar",
                elements: [
                    {
                        view: "icon", icon: "mdi mdi-wan"
                    },
                    {
                        view: "icon", icon: "mdi mdi-eraser"
//                        click: () => this.clearForm()
                    },
                    {
                        view: "icon", icon: "mdi mdi-refresh"
//                        click: () => this.urlChange()
                    },
                    {
                        view: "icon", icon: "mdi mdi-content-save",
                        click: () => {
//                            KBEntities.saveEntity( this.getFrame(), this.getForm().getValues() );
                        }
                    }
                ]
            },
            {
                view: "form",
                localId: WidgetForm.LOCAL_ID,
                scroll: "auto",
                mode: "edit",
                elements: []
            }
        ];
    }

    @Subscribe( EventType.INIT )
    public init_( event: Event ): void {

        // mode
/*        switch ( this.getConfig().mode ) {
            case WidgetMode.EDIT:
                this.getView().enable();
                break;
            case WidgetMode.DISPLAY:
            case WidgetMode.SELECT:
                this.getView().disable();
                break;
            case WidgetMode.DELETE:
                this.getView().disable();
                break;
            default:
                this.getView().disable();
                break;
        }*/

        const formConfig: webix.DataRecord = this.lookupForm( event.entry.frame, true, () => {

            this.getView().reconstruct();

            // check empty
            if ( formConfig.getValues().fields == null ) {
                this.getForm().refresh();
                return;
            }

            this.completeForm( formConfig, event.entry.frame, event.entry.name );

            this.getForm().refresh();

            // notify children
            WidgetContainer.notifyEvents( event, this.getView().getChildViews() );
        } );
    }

    private completeForm( formConfig: webix.DataRecord, frame: string, name: string ) {


        // keys
        var keysToken = null;

        if ( name )
            keysToken = name.split( "/" );

        var keysValue = new Object();
        var keysSplitted: number = 0;

        for ( let fieldConfig of formConfig.getValues().fields ) {

            if ( !fieldConfig.widget.view.startsWith( "mm-" ) )
                continue;

            switch ( fieldConfig.widget.view ) {
                case "mm-combo":
                case "mm-checkbox":
                case "mm-counter":
                case "mm-datepicker":
                case "mm-image":
                case "mm-number":
                case "mm-switch":
                case "mm-text":
                case "mm-form":
                    this.getView().addView( fieldConfig.widget );


                    // key management
                    if ( fieldConfig.key ) {

                        if ( keysToken && keysToken.length > keysSplitted ) {
                            keysValue[fieldConfig.name] = keysToken[keysSplitted];
                            fieldConfig.widget = webix.extend( { view: "mm-text", disabled: true }, fieldConfig.widget, false );
                        }
                        keysSplitted++;
                    }

                    break;
                default:
                    alert( KBEntities.stringify( fieldConfig.widget ) );
            }
        }

        this.getForm().setValues( keysValue );

        // get entity
        if ( name != null ) {
            if ( keysToken.length < keysSplitted ) {
                // TODO prototype
                //                alert( "prototype" );
            }
            else {
                const entity = KBEntities.lookupEntity( frame, name, () => {
                    this.getForm().setValues( entity.getValues(), true );
                } );
            }
        }
    }

    private clearForm() {
        this.getForm().clear();
    }

    private lookupForm( frame: string, prototype: boolean, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupForm", { frame: frame, name: frame, prototype: prototype } ), null );
        return data;
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetForm.prototype ), webix.ui.layout );
    }
}

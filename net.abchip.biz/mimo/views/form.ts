/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";
import { KBEntities } from "base/kb";
import { UIViewConfig, UIViewMode, UIWindowView, UIFormView, UIMenuUtils } from "base/ui";

export class EntityForm extends UIFormView {

    public getComponentConfig(): webix.ui.toolbarConfig {

        var toolbarComponentConfig: webix.ui.toolbarConfig = {
            view: "toolbar",
            elements: [
                {
                    view: "icon", icon: "mdi mdi-wan"
                },
                {
                    view: "icon", icon: "mdi mdi-eraser",
                    click: () => this.clearForm()
                },
                {
                    view: "icon", icon: "mdi mdi-refresh",
                    click: () => this.urlChange()
                },
                {
                    view: "icon", icon: "mdi mdi-content-save",
                    click: () => {
                        KBEntities.saveEntity( this.getFrame(), this.getForm().getValues() );
                    }
                }
            ]
        };

        return toolbarComponentConfig;
    }

    public getForm(): webix.ui.form {
        return this.$$( "base" ) as webix.ui.form;
    }

    protected doConfig(): any {

        var form = {
            rows: [
                {
                    view: "form",
                    localId: "base",
                    scroll: true,
                    elements: []
                },
                {
                    view: "accordion",
                    multi: true,
                    localId: "dashboard",
                    collapsed: true,
                    rows: [
                        {
                            header: "Sales",
                            body: {
                                cols: [
                                    {
                                        view: "chart",
                                        localId: "dashboard",
                                        type: "pie",
                                        value: "#sales#",
                                        label: "#year#",
                                        data: [
                                            { id: 1, sales: 20, year: "02" },
                                            { id: 2, sales: 55, year: "03" },
                                            { id: 3, sales: 40, year: "04" },
                                            { id: 4, sales: 78, year: "05" }
                                        ]
                                    },
                                    {
                                        view: "chart",
                                        localId: "chart",
                                        type: "bar",
                                        value: "#sales#",
                                        xAxis: {
                                            template: "'#year#"
                                        },
                                        yAxis: {
                                            start: 0,
                                            end: 100,
                                            step: 10,
                                            template: function( obj ) {
                                                return ( obj % 20 ? "" : obj )
                                            }
                                        },
                                        data: [
                                            { id: 1, sales: 20, year: "02" },
                                            { id: 2, sales: 55, year: "03" },
                                            { id: 3, sales: 40, year: "04" },
                                            { id: 4, sales: 78, year: "05" },
                                            { id: 5, sales: 61, year: "06" },
                                            { id: 6, sales: 35, year: "07" },
                                            { id: 7, sales: 80, year: "08" },
                                            { id: 8, sales: 50, year: "09" },
                                            { id: 9, sales: 65, year: "10" },
                                            { id: 10, sales: 59, year: "11" }
                                        ]
                                    }
                                ]
                            }
                        }
                    ]
                }
            ]
        }

        return form;
    }

    public init( view: any, urls: any[] ) {
        super.init( view, urls );

        //        this.getForm().attachEvent( "onSubmit", ( newv, oldv ) => {
        //            KBEntities.saveEntity( this.getFrame(), this.getForm().getValues() );
        //        } );
    }


    public urlChange() {
        super.urlChange();

        if ( !this.getFrame() )
            return;


        var dashboard = this.$$( "dashboard" ) as webix.ui.accordion;
        if ( this.getFrame() == "Party" || this.getFrame() == "Product" ) {
//            dashboard.reconstruct();
            dashboard.show();
        }
        else
            dashboard.hide();

        this.reload();
    }

    public reload() {

        // form
        var form = this.getForm();

        // mode
        switch ( this.getMode() ) {
            case UIViewMode.SAVE:
                this.buildForm( form, this.getFrame(), this.getName() );
                form.enable();
                break;
            case UIViewMode.DISPLAY:
                this.buildForm( form, this.getFrame(), this.getName() );
                form.disable();
                break;
            case UIViewMode.DELETE:
                this.buildForm( form, this.getFrame(), this.getName() );
                form.disable();
                break;
            default:
                break;
        }

        this.onAfterLoad();
    }

    protected onAfterLoad(): void {

    }

    private clearForm() {
        var form: webix.ui.form = this.$$( "base" ) as webix.ui.form;
        form.clear();
    }
}

export class EntityFormWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new EntityForm( app, name, null ) );
    }
}

export default class EntityFormDefault extends EntityForm {
}

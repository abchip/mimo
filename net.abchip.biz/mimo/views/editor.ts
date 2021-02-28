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
import { UIViewConfig, UIViewMode, UIView, UIWindowView, UITabView, UITableView } from "base/ui";
import { EntityForm } from "views/form";
import { EntityNote } from "views/note";
import { EntitiesTable } from "views/table";

export class EntityEditor extends UITabView {

    private lastFocus: string = null;

    public getComponentConfig(): webix.ui.toolbarConfig {
        return null;
    }

    protected doConfig(): any {

        var entityForm = new EntityForm( this.app, "", null );

        var tabview = {
            view: "tabview",
            localId: UITabView.TABVIEW,
            cells: [
                {
                    header: "Base",
                    body: entityForm
                }
            ],
            tabMinWidth: 50,
            tabMoreWidth: 150,
            moreTemplate: "+",
            tabbar: {
                close: false
            }
        }

        return {
            cols: [
                tabview,
                { view: "resizer", localId: "resizer" },
                {
                    view: "accordion",
                    type: "wide",
                    multi: true,
                    collapsed: true,
                    cols: [
                        {
                            header: "Routes",
                            width: 200,
                            body: {
                                view: "list",
                                localId: "routes",
                                select: true,
                                template: "#text#",
                                data: []
                            }
                        }
                    ]
                }
            ]
        }
    }

    public init( view: any, urls: any[] ) {
        super.init( view, urls );

        this.lastFocus = this.getTabView().getTabbar().config.options[0].id;

        this.getTabView().getTabbar().attachEvent( "onAfterTabClick", ( id, ev ) => {

            const frame = KBEntities.lookupFrame( this.getFrame(), () => {
                var slots: any[] = frame.getValues().slots;
                for ( const slot of slots ) {

                    // lookup slot
                    if ( slot.name != id )
                        continue;

                    // lookup slot
                    if ( slot.route )
                        continue;

                    this.lastFocus = id;

                    var slotFrame = slot.domain.frame;
                    const slotValues: UITableView = new EntitiesTable( this.app, "", {
                        frame: slotFrame,
                        keys: this.getName(),
                        filter: ""
                    } );

                    const detail: any = this.buildSlotDetailView( slot );

                    const viewConfig = {
                        id: slot.name,
                        view: "layout",
                        rows: [
                            slotValues,
                            { view: "resizer" },
                            detail,
                            {
                                gravity: 0.1
                            }
                        ]
                    };

                    this.addOption( slot.name, slot.text, false, viewConfig );

                    slotValues.getDatatable().attachEvent( "onSelectChange", () => {
                        detail.setMode( this.getMode() );
                        detail.setName( slotValues.getSelectedName() );

                        detail.reload();
                    } );

                    // focus
                    this.getTabView().getTabbar().setValue( id );

                    break;
                }
            } );
        } );

        this.getTabView().getTabbar().attachEvent( "onOptionRemove", ( id, ev ) => {

            // focus
            //            alert( id );
            //            alert( this.getTabView().getTabbar().optionIndex( id ) );          

            // focus
            this.getTabView().getTabbar().setValue( this.lastFocus );

            //            this.getTabView().getTabbar().callEvent( "onAfterTabClick", [value] );
        } );

        // onClick
        var routes = this.$$( "routes" ) as webix.ui.list;
        routes.attachEvent( 'onItemClick', ( id ) => {
            var slot = routes.getItem( id );
            //          alert( KBEntities.stringify( item ) );
            //          this.show( "table?frame=Product" );

            var filter = slot.domain.route + "= '" + this.getName() + "'";

            const slotValues: UITableView = new EntitiesTable( this.app, "", {
                frame: slot.domain.frame,
                //                keys: this.getName(),
                filter: filter
            } );


            const routeConfig = {
                //                id: "routes_",
                id: slot.name,
                view: "layout",
                close: true,
                rows: [
                    slotValues
                ]
            };

            //            this.removeOption( "routes_" );
            //            this.addOption( "routes_", slot.text, true, routeConfig );
            //            this.getTabView().setValue( "routes_" );

            this.addOption( slot.name, slot.text, true, routeConfig );
            this.getTabView().setValue( slot.name );
            //            var tabbar = this.getTabView().getTabbar() as webix.ui.tabbar;
            //            var tabview = this.getTabView().getTabbar() as webix.ui.tabview;

        } );
    }

    public urlChange() {
        super.urlChange();

        const frame = KBEntities.lookupFrame( this.getFrame(), () => {
            this.reload( frame.getValues() );
        } );
    }

    private reload( frame: object ) {
        // mode
        switch ( this.getMode() ) {
            case UIViewMode.SAVE:
                this.buildFormTab( frame );
                break;
            case UIViewMode.DISPLAY:
                this.buildFormTab( frame );
                break;
            case UIViewMode.DELETE:
                this.buildFormTab( frame );
                break;
            default:
                break;
        }

        this.buildRoutes( frame );

        this.onAfterLoad();
    }

    protected onAfterLoad(): void {

    }

    private buildFormTab( frame: object ) {

        var slots: any[] = frame["slots"];
        for ( var slot of slots ) {
            if ( slot.derived != true )
                continue;

            if ( slot.route ) {
                continue;
            }

            if ( slot.cardinality.max != -1 )
                continue;

            if ( !slot.domain.frame )
                continue;

            this.addOption( slot.name, slot.text, false, null );
        }
    }

    private buildRoutes( frame: object ) {

        var routes = this.$$( "routes" ) as webix.ui.list;
        routes.clearAll();

        var slots: any[] = frame["slots"];
        for ( var slot of slots ) {

            if ( slot.derived != true )
                continue;

            if ( !slot.route )
                continue;

            var item = webix.extend( slot, { id: slot.name } );
            routes.add( item );
        }
    }

    private buildSlotDetailView( slot: any ): UIView {

        var slotFrame = slot.domain.frame;

        var detail = null;
        if ( slotFrame.endsWith( "Note" ) ) {
            detail = new EntityNote( this.app, "", {
                frame: slotFrame,
                toolbarConfig: {
                    showFrame: false,
                    showEntity: false
                }
            } );
        }
        else {
            detail = new EntityForm( this.app, "", {
                frame: slotFrame,
                toolbarConfig: {
                    showFrame: false,
                    showEntity: false
                }
            } );
        }

        return detail;
    }
}

export class EntityEditorWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new EntityEditor( app, name, null ) );
    }
}

export default class EntityEditorDefault extends EntityEditor {
}
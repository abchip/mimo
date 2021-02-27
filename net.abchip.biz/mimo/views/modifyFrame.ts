/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetView } from "webix-jet";
import { KBEntities } from "base/kb";
import { UIViewMode, UIWindowView, UITabView, UITableView } from "base/ui";
import { EntityForm } from "views/form";

export default class FrameEditor extends UITabView {

    public getComponentConfig(): webix.ui.toolbarConfig {
        return null;
    }

    protected doConfig(): any {

        var tabview = {
            view: "tabview",
            localId: UITabView.TABVIEW,
            cells: [
                {
                    header: "Base",
                    body: new EntityForm( this.app, "", {
                        frame: "Frame"
                    } )
                },
                {
                    header: "Slots",
                    localId: "slots",
                    body: new SlotsTable( this.app, "", {
                        frame: "Slot",
                        keys: this.getName()
                    } )
                }
            ]
        }

        return tabview;
    }
}

class SlotsTable extends UITableView {

    public getComponentConfig(): webix.ui.toolbarConfig {
        return null;
    }

    protected doConfig(): any {

        var config = {
            view: "datatable",
            localId: "slots_datatable",
            autoConfig: false,
            resizeColumn: true,
            select: true
        }

        return config;
    }

    public getDatatable(): webix.ui.datatable {
        return this.$$( "slots_datatable" ) as webix.ui.datatable;
    }


    public urlChange() {
        super.urlChange();

        this.reloadTableColumns( true );

        const datatable = this.getDatatable();
        datatable.clearAll();

        const frame = KBEntities.lookupFrame( this.getKeys(), () => {

            var slots: any[] = frame.getValues().slots;
            for ( var slot of slots ) {

                var item = webix.extend( slot, { id: slot.name } );
                if ( slot.cardinality )
                    item.cardinality = slot.cardinality.multiple;
                
                if ( slot.domain )
                    item.domain = slot.domain.frame;
                
                datatable.add( item );
            }
        } );
    }
}

export class FrameEditorWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new FrameEditor( app, name, null ) );
    }
}
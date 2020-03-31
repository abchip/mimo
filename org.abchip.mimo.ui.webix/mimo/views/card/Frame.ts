/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View } from "core/ui";

export default class FrameEditor extends View {

    protected doConfig(): any {

        return {
            view: "mm-tab",
            cells: [
                {
                    header: "Base",
                    body: {
                        view: "mm-form",
                        entry: {
                            frame: "Frame"
                        }
                    }
                },
                {
                    header: "Slots",
                    body: {
                        view: "mm-table",
                        entry: {
                            frame: "Slot",
                            keys: this.getParam( "name", true )
                        }
                    }
                }
            ]
        };
    }
}

/*
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
*/

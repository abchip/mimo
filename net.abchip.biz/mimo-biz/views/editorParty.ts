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
import { UIView, UIWindowView } from "base/ui";
import { EntityEditor, EntityEditorWindow } from "views/editor";

export default class PartyEditor extends EntityEditor {

    protected onAfterLoad(): void {

        this.removeOption( "partyNotes" );
        this.removeOption( "partyProfileDefaults" );
        this.removeOption( "supplierProductFeatures" );

        // Config

        var frame: string = "PartyRole";

        var table = {
            id: "table_" + frame,
            view: "datatable",
            autoheight: false,
            scrollX: false,
            select: "row",
        };


        var form = {
            id: "form_" + frame,
            view: "form",
            elements: []
        }

        var buttonSave = {
            id: "buttonSave_" + frame,
            view: "button",
            label: "Save",
            type: "Submit"
            //            css: "webix_primary",
        }

        this.addOption( "test", "Test", false, {
                id: "test",
                view: "layout",
                rows: [
                    table,
                    form,
                    {
                        cols: [
                            buttonSave
                        ]
                    }

                ]
            } );

    }
}

export class PartyEditorWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new PartyEditor( app, name, null ) );
    }
}
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
import { UIViewConfig, UIViewMode, UIWindowView, UINoteView } from "base/ui";

export class EntityNote extends UINoteView {

    private static AREA: string = "entity_textarea";

    public getComponentConfig(): webix.ui.toolbarConfig {

        var toolbarComponentConfig: webix.ui.toolbarConfig = {
            view: "toolbar",
            elements: [
                {
                    view: "icon", icon: "mdi mdi-eraser",
                    click: () => this.clearTextArea()
                },
                {
                    view: "icon", icon: "mdi mdi-refresh",
                    click: () => this.urlChange()
                },
                {
                    view: "icon", icon: "mdi mdi-content-save",
                    click: () => {
                        alert( KBEntities.stringify( this.getTextArea().getValue() ) );
                        //                        KBEntities.saveEntity( this.getFrame(), this.getForm().getValues() );
                    }
                }
            ]
        };

        return toolbarComponentConfig;
    }

    public getTextArea(): webix.ui.textarea {
        return this.$$( EntityNote.AREA ) as webix.ui.textarea;
    }

    protected doConfig(): any {

        var textarea = {
            view: "textarea",
            localId: EntityNote.AREA,
//            label: "note",
            labelAlign: "right"
        }

        return textarea;
    }

    public urlChange() {
        super.urlChange();

        this.reload();
    }

    public reload() {

        // form
        var note = this.getTextArea();

        // mode
        switch ( this.getMode() ) {
            case UIViewMode.SAVE:
                note.enable();
                break;
            case UIViewMode.DISPLAY:
                note.disable();
                break;
            case UIViewMode.DELETE:
                note.disable();
                break;
            default:
                break;
        }
    }

    private clearTextArea() {
        this.getTextArea().setValue( "" );
    }
}

export class EntityNoteWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, null, new EntityNote( app, name, null ) );
    }
}

export default class EntityNoteDefault extends EntityNote {
}

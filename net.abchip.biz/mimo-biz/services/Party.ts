/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { getBizServicePath } from "config/host";
import { KBService } from "base/kb";
import { UIView, UIViewMode, UIWindowView } from "base/ui";
import { EntitiesUploadWindow } from "views/uploader";
import { EntitiesTable } from "views/table";
import { EntityNoteWindow } from "views/note";

export class PartyServices extends KBService {

    public modifyNote( view: UIView, frame: string, name: string ) {

        var win = view.ui( EntityNoteWindow ) as EntityNoteWindow;
        win.setParam( "mode", UIViewMode.SAVE );
        win.setParam( "frame", frame );
        win.setParam( "name", name );

        win.showWindow();
    }

    public importPeople( view: UIView ) {

        var win = view.ui( EntitiesUploadWindow ) as EntitiesUploadWindow;
        win.setParam( "upload", getBizServicePath() + "/importPeople" );

        win.showWindow();
    }

    public viewContacts( view: UIView, frame: string, name: string ) {
        var win = view.ui( PartyContactMechWindow ) as PartyContactMechWindow;
        win.setParam( "keys", name );
        win.setParam( "filter", "" );
        win.showWindow();
    }
}

class PartyContactMechWindow extends UIWindowView {

    constructor( app: any, name: any ) {

        super( app, name, new EntitiesTable( app, name, {
            frame: "PartyContactMech"
        } ) );
    }
}

/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { KBService } from "base/kb";
import { UIViewMode, UIView, UITableView } from "base/ui";
import { EntityNoteWindow } from "views/note";

export class BizEntityNoteServices extends KBService {

    add( view: UIView ) {
        
        var win = view.ui( EntityNoteWindow ) as EntityNoteWindow;
        win.setParam( "frame", view.getFrame() );
        win.setParam( "mode", UIViewMode.SAVE );
        
        win.showWindow();
    }

    public modifyNote( view: UIView, frame: string, name: string ) {

        var win = view.ui( EntityNoteWindow ) as EntityNoteWindow;
        win.setParam( "mode", UIViewMode.SAVE );
        win.setParam( "frame", frame );
        win.setParam( "name", name );

        win.showWindow();
    }
}
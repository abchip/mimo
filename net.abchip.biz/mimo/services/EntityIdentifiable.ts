/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { KBService, KBEntities } from "base/kb";
import { UIViewMode, UIView, UITableView } from "base/ui";
import { EntityFormWindow } from "views/form";
import { EntityEditorWindow } from "views/editor";

export class EntityIdentifiableServices extends KBService {

    add( view: UIView ) {

        var win = view.ui( EntityFormWindow ) as EntityFormWindow;
        win.setParam( "frame", view.getFrame() );
        win.setParam( "mode", UIViewMode.SAVE );
        win.setParam( "name", null );

        if ( view instanceof UITableView ) {
            var tableView = view as UITableView;
            if ( tableView.getKeys() )
                win.setParam( "name", tableView.getKeys() );
        }

        win.showWindow();
    }

    modify( view: UIView, frame: string, name: string ) {

        var win = view.ui( EntityEditorWindow ) as EntityEditorWindow;
        win.setParam( "frame", frame );
        win.setParam( "name", name );
        win.setParam( "mode", UIViewMode.SAVE );
        win.showWindow();
    }

    view( view: UIView, frame: string, name: string ) {
        var win = view.ui( EntityEditorWindow ) as EntityEditorWindow;
        win.setParam( "frame", frame );
        win.setParam( "name", name );
        win.setParam( "mode", UIViewMode.DISPLAY );
        win.showWindow();
    }
    
    delete( view: UIView, frame: string, name: string ) {
        if (confirm('Delete record ' + name + " from " + frame + "?")) {
            KBEntities.deleteEntity(frame, name);
        }
    }
}
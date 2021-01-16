/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View, ActionProvider } from "core/ui";

export class EntityActions extends ActionProvider {

    add( view: View ) {
/*
        var win = view.ui( EntityFormWindow ) as EntityFormWindow;
        win.setParam( "frame", view.getFrame() );
        win.setParam( "mode", WidgetMode.SAVE );
        win.setParam( "name", null );

        if ( view instanceof UITableView ) {
            var tableView = view as UITableView;
            if ( tableView.getKeys() )
                win.setParam( "name", tableView.getKeys() );
        }

        win.showWindow();*/
    }

    modify( view: View, frame: string, name: string ) {

/*        var win = view.ui( EntityEditorWindow ) as EntityEditorWindow;
        win.setParam( "frame", frame );
        win.setParam( "name", name );
        win.setParam( "mode", WidgetMode.SAVE );
        win.showWindow();*/
    }

    view( view: View, frame: string, name: string ) {
        
/*        var win = view.ui( EntityEditorWindow ) as EntityEditorWindow;
        win.setParam( "frame", frame );
        win.setParam( "name", name );
        win.setParam( "mode", WidgetMode.DISPLAY );
        win.showWindow();*/
    }
    
    delete( view: View, frame: string, name: string ) {
/*        if (confirm('Delete record ' + name + " from " + frame + "?")) {
            KBEntities.deleteEntity(frame, name);
        }*/
    }
    
    info( view: View, frame: string, name: string ) {

        /*        var win = view.ui( EntityInfoWindow ) as EntityInfoWindow;
                win.setParam( "frame", frame );
                win.setParam( "name", name );
        
                win.showWindow();*/
    }
}
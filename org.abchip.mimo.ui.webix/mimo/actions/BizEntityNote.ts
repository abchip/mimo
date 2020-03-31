/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View, ActionProvider } from "core/ui";

export class BizEntityNoteActions extends ActionProvider {

    add( view: View, entry: any ) {

        /*        var win = view.ui( EntityNoteWindow ) as EntityNoteWindow;
                win.setParam( "frame", view.getFrame() );
                win.setParam( "mode", WidgetMode.SAVE );
                
                win.showWindow();*/
    }

    public modifyNote( view: View, frame: string, name: string ) {

        /*        var win = view.ui( EntityNoteWindow ) as EntityNoteWindow;
                win.setParam( "mode", WidgetMode.SAVE );
                win.setParam( "frame", frame );
                win.setParam( "name", name );
        
                win.showWindow();*/
    }
}
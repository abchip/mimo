/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View, ActionProvider } from "core/ui";

export class FrameActions extends ActionProvider {

    setupFrame( view: View, frame: string, name: string ) {
        /*        var win = view.ui( FrameSetupFormWindow ) as FrameSetupFormWindow;
                win.setParam( "frame", frame );
                win.setParam( "name", name );
                win.setParam( "mode", "save" );
                win.showWindow();*/
    }

    modify( view: View, frame: string, name: string ) {

        /*        var win = view.ui( FrameEditorWindow ) as FrameEditorWindow;
                win.setParam( "frame", frame );
                win.setParam( "name", name );
                win.setParam( "mode", WidgetMode.EDIT );
                win.showWindow();*/
    }
};
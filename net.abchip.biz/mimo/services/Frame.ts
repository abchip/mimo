/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { KBService } from "base/kb";
import { UIView, UIViewMode } from "base/ui";
import { FrameSetupFormWindow } from "views/setupFrame";
import { FrameEditorWindow } from "views/modifyFrame";

export class FrameServices extends KBService {

    setupFrame( view: UIView, frame: string, name: string ) {
        var win = view.ui( FrameSetupFormWindow ) as FrameSetupFormWindow;
        win.setParam( "frame", frame );
        win.setParam( "name", name );
        win.setParam( "mode", "save" );
        win.showWindow();
    }

    modify( view: UIView, frame: string, name: string ) {

        var win = view.ui( FrameEditorWindow ) as FrameEditorWindow;
        win.setParam( "frame", frame );
        win.setParam( "name", name );
        win.setParam( "mode", UIViewMode.SAVE );
        win.showWindow();
    }
};
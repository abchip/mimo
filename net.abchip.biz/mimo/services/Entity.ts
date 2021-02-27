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
import { UIViewMode, UIView } from "base/ui";
import { EntityInfoWindow } from "views/info";

export class EntityServices extends KBService {
    
    public info( view: UIView, frame: string, name: string ) {

        var win = view.ui( EntityInfoWindow ) as EntityInfoWindow;
        win.setParam( "frame", frame );
        win.setParam( "name", name );

        win.showWindow();
    }
}
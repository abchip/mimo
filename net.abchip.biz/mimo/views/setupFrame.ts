/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetView } from "webix-jet";
import { UIViewMode, UIWindowView, UITabView } from "base/ui";
import { EntityForm } from "views/form";

export default class FrameSetupForm extends UITabView {

    public getComponentConfig(): webix.ui.toolbarConfig {
        return null;
    }

    protected doConfig(): any {

        var tabview = {
            view: "tabview",
            localId: UITabView.TABVIEW,
            cells: [
                {
                    header: "UI",
                    body: new EntityForm( this.app, "", {
                        frame: "UiFrameSetup"
                    } )
                },
                {
                    header: "EDI",
                    body: new EntityForm( this.app, "", {
                        frame: "EdiFrameSetup"
                    } )
                }
            ],
            tabMinWidth: 150,
            tabMoreWidth: 50,
            moreTemplate: "+"
        }

        return tabview;
    }
}

export class FrameSetupFormWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new FrameSetupForm( app, name, null ) );
    }
}
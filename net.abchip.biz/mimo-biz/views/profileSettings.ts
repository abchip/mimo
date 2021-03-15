/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";
import { KBEntities } from "base/kb";
import { UIViewMode, UIWindowView, UITabView, UIViewModeUtils } from "base/ui";
import { EntityForm } from "views/form";

export default class SettingsProfile extends UITabView {

    public getComponentConfig(): webix.ui.toolbarConfig {
        return null;
    }

    protected doConfig(): any {

        var entityForm = new EntityForm( this.app, "", {
            frame: "UserLogin",
            name: KBEntities.getContext().user,
            mode: UIViewMode.SAVE
        } );

        var tabview = {
            view: "tabview",
            localId: UITabView.TABVIEW,
            cells: [
                {
                    header: "My profile",
                    body: entityForm
                }
            ],
            tabMinWidth: 150,
            tabMoreWidth: 50,
            moreTemplate: "+"
        }

        return tabview;
    }
}

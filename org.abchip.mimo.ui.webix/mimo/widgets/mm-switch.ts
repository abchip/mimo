/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { Widget, WidgetSetup, WidgetConfig } from "core/ui";

export interface SwitchConfig extends WidgetConfig, webix.ui.switchButtonConfig {
}

export class WidgetSwitch extends Widget<SwitchConfig, webix.ui.switchButton> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-switch";
        setup.$cssName = "switch";
        setup.defaults = {
            labelWidth: 250,
            uncheckValue: "0",
            checkValue: "1",
            value: "1",
            customCheckbox: true
        };
    }

    public config( config: SwitchConfig ): void {
        
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetSwitch.prototype ), webix.ui.switchButton );
    }
}
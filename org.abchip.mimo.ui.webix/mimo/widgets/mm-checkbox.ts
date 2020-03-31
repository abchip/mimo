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

export interface CheckBoxConfig extends WidgetConfig, webix.ui.checkboxConfig {
}

export class WidgetCheckBox extends Widget<CheckBoxConfig, webix.ui.checkbox> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-checkbox";
        setup.$cssName = "checkbox";
        setup.defaults = {
            labelWidth: 250
        };
    }

    public config( config: CheckBoxConfig ): void {
        
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetCheckBox.prototype ), webix.ui.checkbox );
    }
}

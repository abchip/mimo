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

export interface NumberConfig extends WidgetConfig, webix.ui.textConfig {
}

export class WidgetNumber extends Widget<NumberConfig, webix.ui.text> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-number";
        setup.$cssName = "text";
        setup.defaults = {
            labelWidth: 250
        };
    }

    public config( config: NumberConfig ): void {
        
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetNumber.prototype ), webix.ui.text );
    }
}
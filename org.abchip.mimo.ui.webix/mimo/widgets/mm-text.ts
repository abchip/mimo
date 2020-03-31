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

export interface TextConfig extends WidgetConfig, webix.ui.textConfig {
}

export class WidgetText extends Widget<TextConfig, webix.ui.text> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-text";
        setup.$cssName = "text";
        setup.defaults = {
            labelWidth: 250
        };
    }

    public config( config: TextConfig ): void {
        
    }

    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetText.prototype ), webix.ui.text );
    }
}
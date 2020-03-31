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

export interface DatePickerConfig extends WidgetConfig, webix.ui.datepickerConfig {
}

export class WidgetDatePicker extends Widget<DatePickerConfig, webix.ui.datepicker> {

    public setup( setup: WidgetSetup ): void {
        setup.name = "mm-datepicker";
        setup.$cssName = "datepicker";
        setup.defaults = {
            labelWidth: 250,
            timepicker: true,
            format: webix.i18n.fullDateFormat
        };
    }

    public config( config: DatePickerConfig ): void {
        
    }
    
    public static import( jetApp: JetApp ) {
        webix.protoUI( Widget._prototype( jetApp, WidgetDatePicker.prototype ), webix.ui.datepicker );
    }
}
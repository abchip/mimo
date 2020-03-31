/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View } from "core/ui";

export default class Test extends View {

    doConfig() {

        return {
            view: "layout",
            rows: [
                {
                    view: "mm-checkbox",
                    mode: "edit",
                    label: "CheckBox"
                },
                {
                    view: "mm-combo",
                    mode: "edit",
                    label: "Combo",
                    entry: {
                        frame: "Product"
                    }
                },
                {
                    view: "mm-counter",
                    mode: "edit",
                    label: "Counter"
                },
                {
                    view: "mm-datepicker",
                    mode: "edit",
                    label: "DatePicker"
                },
                {
                    view: "mm-form",
                    mode: "edit",
                    label: "Form",
                    entry: {
                        frame: "Product"
                    }
                },
                {
                    view: "mm-image",
                    mode: "edit",
                    label: "Image"
                },
                {
                    view: "mm-number",
                    mode: "edit",
                    label: "Number"
                },
                {
                    view: "mm-review",
                    mode: "edit",
                    label: "Review"
                },
                {
                    view: "mm-text",
                    mode: "edit",
                    label: "Text"
                },
                {
                    view: "mm-textarea",
                    mode: "edit",
                    label: "TextArea"
                },
                {
                    cols: [
                        { view: "label", label: "Toolbar" },
                        {
                            view: "mm-toolbar",
                            showFrame: true,
                            showEntity: true,
                            entry: {
                                frame: "Product"
                            }
                        }
                    ]
                }
            ]
        };
    }
}
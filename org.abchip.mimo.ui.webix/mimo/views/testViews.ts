/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View } from "core/ui";

export default class TestView extends View {

    doConfig() {

        return {
            params: {
                frame: {
                    value: "Product",
                    changeable: false
                },
                name: {
                    value: "Modeling",
                    changeable: true
                }
            },
// frmae=Product&name=Modeling || /Product#Modeling
            widgets: {
                products: {
                    view: "combo",
                    label: "Select Product",
                    selected: "${name}"
                },
                product: {
                    view: "form",
                    mode: "edit"
                }
            },
            events: {
                products: {
                    when: "select",
                    then: "refresh",
                    xxx: {
                        refresh: {
                            products: {
                                selected: "$name"
                            }
                        },
                        data: {
                            url: "/find?xxx=yyyy"
                        }
                    }
                }
            }
        };
    }
}
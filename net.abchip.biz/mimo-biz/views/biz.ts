/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetView } from "webix-jet";
import { ApplicationToolbar, ApplicationMenu } from "views/application";

export default class HomeView extends JetView {

    config() {

        return {
            view: "layout",
            rows: [
                ApplicationToolbar,
                {
                    cols: [
                        ApplicationMenu,
                        { view: "resizer", localId: "resizer" },
                        { $subview: true }
                    ]
                }
            ]
        };
    }
}
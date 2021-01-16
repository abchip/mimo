/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { KBEntities } from "core/kb";
import { View } from "core/ui";

export default class UserLogin extends View {

    protected doConfig(): any {

        return {
            view: "tabview",
            cells: [
                {
                    header: "My profile",
                    body: {
                        view: "mm-form",
                        entry: {
                            frame: "UserLogin",
                            name: KBEntities.getContext().user
                        }
                    }
                }
            ],
            tabMinWidth: 150,
            tabMoreWidth: 50,
            moreTemplate: "+"
        };
    }
}

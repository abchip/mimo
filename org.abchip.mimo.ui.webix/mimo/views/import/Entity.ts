/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { View } from "core/ui";

export class EntitiesUpload extends View {

    doConfig(): any {
        return {
            view: "mm-uploader"
        };
    }
}

export default class EntitiesUploadDefault extends EntitiesUpload {
}
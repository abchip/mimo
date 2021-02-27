/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { getBizServicePath } from "config/host";
import { KBService, KBEntities } from "base/kb";
import { UIView } from "base/ui";
import { EntitiesUpload, EntitiesUploadWindow } from "views/uploader";

export class ProductCategoryServices extends KBService {

    importCategories( view: UIView ) {

        var win = view.ui( EntitiesUploadWindow ) as EntitiesUploadWindow;
        win.setParam( "upload", getBizServicePath() + "/importProductCategories" );

        win.showWindow();
    }
}

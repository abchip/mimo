/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetView } from "webix-jet";
import { UIBrowserView, UIWindowView } from "base/ui";

export class Browser extends UIBrowserView {

    public getComponentConfig(): webix.ui.toolbarConfig {

        var toolbarComponentConfig: webix.ui.toolbarConfig = {
            view: "toolbar",
            elements: [
                {
                    view: "icon", icon: "mdi mdi-refresh",
                    click: () => this.refresh()
                }
            ]
        };

        return toolbarComponentConfig;
    }

    protected doConfig(): any {

        return {
            view: "iframe",
            localId: "toolbar_frame",
            src: ""
        }
    }

    public urlChange() {
        super.urlChange();

        var src: string = "//";

        for ( var url of this.getUrl() ) {
            if ( url.page == "browser" )
                src = src + url.params.url;
            else
                src = src + "/" + url.page;
        }

        ( this.$$( "toolbar_frame" ) as webix.ui.iframe ).define( "src", src );
    }
}

export class BrowserWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new Browser( app, name, null ) );
    }
}

export default class BrowserDefault extends Browser {
}
/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetApp } from "webix-jet";
import { Widget, WidgetSetup, WidgetConfig, Entry } from "core/ui";

export interface BrowserEntry extends Entry {
}

export interface BrowserConfig extends WidgetConfig<BrowserEntry>, webix.ui.layoutConfig {
}

export class WidgetBrowser extends Widget<BrowserEntry, BrowserConfig, webix.ui.layout> {

	public setup(setup: WidgetSetup): void {
		setup.name = "mm-browser";
		setup.$cssName = "layout";
	}

	public config(config: BrowserConfig): void {
		config.rows = [
			{
				view: "toolbar",
				elements: [
					{
						view: "icon", icon: "mdi mdi-refresh"
					}
				]
			},
			{
				view: "iframe",
				src: ""
			}
		];
	}

	public init(entry: BrowserEntry): void {
	}

	public ready(entry: BrowserEntry): void {
	}

    /*    protected urlChange() {
            super.urlChange();
    
            var src: string = "//";
    
            for ( var url of this.getUrl() ) {
                if ( url.page == "browser" )
                    src = src + url.params.url;
                else
                    src = src + "/" + url.page;
            }
    
            ( this.$$( "toolbar_frame" ) as webix.ui.iframe ).define( "src", src );
        }*/

	public static import(jetApp: JetApp) {
		webix.protoUI(Widget._prototype(jetApp, WidgetBrowser.prototype), webix.ui.layout);
	}
}
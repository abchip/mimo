/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetView } from "webix-jet";
import { UIView, UIViewConfig, UIWindowView } from "base/ui";
import { KBEntities } from "base/kb";

export class EntityInfo extends UIView {

    constructor( app: any, name: any, config: UIViewConfig ) {
        super( app, name, UIView.config( {
            toolbarConfig: {
                showFrame: false,
                showEntity: false
            }
        }, config, true ) );
    }

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

    public getSelectedName(): string {
        return this.getName();
    }

    protected doConfig(): any {

        return {
            view: "property",
            localId: "entity_properties",
            elements: []
        }
    }

    public urlChange() {
        super.urlChange();

        if ( !this.getFrame() )
            return;

        this.reload();
    }

    public reload() {

        const properties = this.$$( "entity_properties" ) as webix.ui.property;

        const entity = KBEntities.lookupEntity( this.getFrame(), this.getName(), () => {
            const frame = KBEntities.lookupFrame( this.getFrame(), () => {
                var index: number = 0;
                for ( const slot of frame.getValues().slots ) {
                    if ( slot.group != "info" )
                        continue;

                    //                    alert( KBEntities.stringify( slot ) );
                    properties.config.elements[index] = {
                        id: slot.name,
                        label: slot.text,
                        type: "text",
                        value: entity.getValues()[slot.name]
                    }
                    index = index + 1;
                }

                properties.config["labelWidth"] = 500;
                properties.refresh();
                //  properties.setValues( entity.getValues() );
            } );
        } );
    }
}

export class EntityInfoWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new EntityInfo( app, name, null ) );
    }
}

export default class EntityInfoDefault extends EntityInfo {
}
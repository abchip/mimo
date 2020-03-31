/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
window.webix = webix; // make webix global again

import { JetApp, EmptyRouter, HashRouter, UrlRouter, plugins } from "webix-jet";

import session from "core/ctx";
import { KBEntities } from "core/kb";
import { View } from "core/ui";
import "config/styles/app.css";

// actions
import { BizEntityNoteActions } from "actions/BizEntityNote";
import { EntityActions } from "actions/Entity";
import { FrameActions } from "actions/Frame";
import { PartyActions } from "actions/Party";
import { ProductCategoryActions } from "actions/ProductCategory";


// widgets
import { WidgetBrowser } from 'widgets/mm-browser';
import { WidgetCheckBox } from 'widgets/mm-checkbox';
import { WidgetCombo } from 'widgets/mm-combo';
import { WidgetCounter } from 'widgets/mm-counter';
import { WidgetDashboard } from 'widgets/mm-dashboard';
import { WidgetDatePicker } from 'widgets/mm-datepicker';
import { WidgetForm } from 'widgets/mm-form';
import { WidgetImage } from 'widgets/mm-image';
import { WidgetLayout } from 'widgets/mm-layout';
import { WidgetMenu } from 'widgets/mm-menu';
import { WidgetNumber } from 'widgets/mm-number';
import { WidgetProperty } from 'widgets/mm-property';
import { WidgetQuery } from 'widgets/mm-query';
import { WidgetReview } from 'widgets/mm-review';
import { WidgetSwitch } from 'widgets/mm-switch';
import { WidgetTab } from 'widgets/mm-tab';
import { WidgetTable } from 'widgets/mm-table';
import { WidgetText } from 'widgets/mm-text';
import { WidgetTextArea } from 'widgets/mm-textarea';
import { WidgetToolbar } from 'widgets/mm-toolbar';
import { WidgetUploader } from 'widgets/mm-uploader';
import { WidgetView } from 'widgets/mm-view';

declare var APPNAME;
declare var VERSION;
declare var PRODUCTION;
declare var BUILD_AS_MODULE;

class AppCache {
    public viewTypes: webix.DataCollection = null;
    public frames: webix.DataCollection = null;
}

export default class App extends JetApp {


    public cache: AppCache;

    constructor() {

        const defaults = {
            id: APPNAME,
            version: VERSION,
            start: "/home",
            //            router: BUILD_AS_MODULE ? EmptyRouter : UrlRouter,
            //            routerPrefix: "mimo",
            router: HashRouter,
            debug: !PRODUCTION,
            views: ( name ) => {
                return name;
            },
            theme: webix.storage.local.get( "theme_color" ) || ""
        };

        super( defaults );

        this.cache = new AppCache();

        this.use( plugins.Locale, null );

        this.use(( app: JetApp ) => {
            app.setService( "BizEntityNoteActions", new BizEntityNoteActions() );
            app.setService( "EntityActions", new EntityActions() );
            app.setService( "FrameActions", new FrameActions() );
            app.setService( "PartyActions", new PartyActions() );
            app.setService( "ProductCategoryActions", new ProductCategoryActions() );
        }, null );

        this.attachEvent( "app:error", function( err ) {
            alert( "Error" );
        } );

        this.attachEvent( "app:error:resolve", function( err, url ) {
            alert( "Delay" ); // webix.delay(() => app.show("/some"));
        } );


        this.use( plugins.User, {
            model: session,
            ping: 60000,
            public: path => {
                return ( path.indexOf( "out-of-service" ) > -1 || path.indexOf( "loginTenant" ) > -1 );
            }
        } );
    }

    createFromURL( chunk ) {

        if ( this.cache.viewTypes.getIndexById( "mm-" + chunk.page ) < 0 )
            return super.createFromURL( chunk );

        if ( !chunk.isNew ) {
            if ( chunk.view instanceof View ) {
                var view: View = chunk.view;
                //                alert( KBEntities.stringify( chunk.view.constructor.name ) );
                chunk.isNew = true;
                chunk.view = null;
            }
        }

        return super.createFromURL( chunk );
    }

    _loadViewDynamic( url ) {
        url = url.replace( /\./g, "/" );

        if ( this.cache.viewTypes.getIndexById( "mm-" + url ) < 0 )
            return require( "jet-views/" + url );

        for ( var chunk of this.getUrl() ) {
            if ( chunk.page == url ) {
                break;
            }
        }

        if ( !chunk ) {
            alert( "Unexpected condition: szn476t686q3ads" );
            return {
            };
        }

        if ( !chunk.params.frame ) {
            alert( "Frame is required parameter" );
            return {
            };
        }

        // frame in role
        try {
            return require( "jet-views/" + chunk.page + "/" + chunk.params.frame );
        }
        catch ( e ) {
        }

        // search frame
        var id = this.cache.frames.getFirstId();
        var frame = this.cache.frames.getItem( id );
        while ( frame != null ) {

            // found
            if ( frame.name == chunk.params.frame )
                break;

            id = this.cache.frames.getNextId( id, 1 );
            frame = this.cache.frames.getItem( id );
        }

        if ( frame == null ) {
            alert( "Frame not found: " + chunk.params.frame );
            return;
        }

        // super frames
        for ( let superName of frame.superNames ) {

            try {
                return require( "jet-views/" + chunk.page + "/" + superName );
            }
            catch ( e ) {
                //                    alert( e );
            }
        }

        alert( "Unexpected condition: ve968ye9rtr8etya8d9" );
    }
}

webix.ready(() => {

    const jetApp: App = new App();

    //webix.EditAbility
    //webix.Movable

    WidgetBrowser.import( jetApp );
    WidgetCheckBox.import( jetApp );
    WidgetCombo.import( jetApp );
    WidgetCounter.import( jetApp );
    WidgetDashboard.import( jetApp );
    WidgetDatePicker.import( jetApp );
    WidgetForm.import( jetApp );
    WidgetImage.import( jetApp );
    WidgetLayout.import( jetApp );
    WidgetMenu.import( jetApp );
    WidgetNumber.import( jetApp );
    WidgetProperty.import( jetApp );
    WidgetQuery.import( jetApp );
    WidgetReview.import( jetApp );
    WidgetSwitch.import( jetApp );
    WidgetTab.import( jetApp );
    WidgetTable.import( jetApp );
    WidgetText.import( jetApp );
    WidgetTextArea.import( jetApp );
    WidgetToolbar.import( jetApp );
    WidgetUploader.import( jetApp );
    WidgetView.import( jetApp );

    session.status().then( function( value ) {

        // frames
        const frames: webix.DataCollection = KBEntities.findFrames(() => {
            jetApp.cache.frames = frames;

            // views
            const names: webix.DataCollection = KBEntities.findNames( "ViewType", null, () => {
                jetApp.cache.viewTypes = names;

                // rendering
                jetApp.render();
            } );
        } );
    } );
} );
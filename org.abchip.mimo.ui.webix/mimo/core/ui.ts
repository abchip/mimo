/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView, JetApp } from "webix-jet";
import { KBEntities } from "core/kb";

/***********************************************************************************
 * Entry
 ***********************************************************************************/
export interface Entry {
}

export interface EntryFramed extends Entry {
    frame: string;
}

/***********************************************************************************
 * Actions
 ***********************************************************************************/
export abstract class ActionProvider {

    public check( action: string ): boolean {

        if ( this[action] != null )
            return true;

        return false;
    }

    public exec( action: string, params: any[] ) {
        this[action].apply( null, params );
    }
}

export class ActionUtils {

    public static lookupAction( app: JetApp, frameName: string, action: string, callback: any ): ActionProvider {

        var actionProvider: ActionProvider = app.getService( frameName + "Actions" );

        if ( actionProvider != null && actionProvider.check( action ) ) {
            callback( actionProvider );
            return;
        }

        const frame = KBEntities.lookupFrame( frameName, () => {

            var superNames: string[] = frame.getValues().superNames;
            if ( superNames != null ) {
                for ( var superName of superNames ) {
                    actionProvider = app.getService( frameName + "Actions" );
                    if ( actionProvider == null )
                        continue;

                    if ( !actionProvider.check( action ) ) {
                        actionProvider = null;
                        continue;
                    }

                    break;
                }
            }

            if ( actionProvider == null ) {
                alert( "Action not found: " + frameName + "(" + action + ")" );
                return;
            }

            callback( actionProvider );
        } );
    }
}

/***********************************************************************************
 * Events
 ***********************************************************************************/
export function Subscribe( event: EventType ) {

    return function( prototype: Widget<WidgetConfig, webix.ui.baseview>, key: string, descriptor: PropertyDescriptor ) {

        if ( !prototype.subscriptions )
            prototype.subscriptions = new Array<Subscription>();

        var subscription: Subscription = descriptor as Subscription;
        subscription.event = event;
        subscription.method = key;

        prototype.subscriptions.push( subscription );
    };
}

export interface Subscription extends PropertyDescriptor {
    event: EventType;
    method: string;
}

export class Event {

    public type: EventType;
    public source?: any;
    public entry?: any;

    constructor( type: EventType, source?: any, entry?: any ) {
        this.type = type;
        this.source = source;
        this.entry = entry;
    }
}

export enum EventType {
    INIT = "mm-init",
    READY = "mm-ready",
    SELECT = "mm-select"
}

/***********************************************************************************
 * Views
 ***********************************************************************************/
export abstract class View extends JetView {

    protected abstract doConfig(): any;

    protected getContainer(): WidgetContainer<any, any> {
        return this.getRoot()["widget"];
    }

    public config(): any {

        alert( 'config ' + this.constructor.name );

        var config = webix.extend( {
            view: "mm-layout"
        }, this.doConfig(), false );

        return config;
    }

    public init( view: any, url: any ) {

        this.getContainer().notify( new Event( EventType.INIT, null, url[0].params ) );
    }

    public ready( view: any, url: any ) {

        this.getContainer().notify( new Event( EventType.READY, null, url[0].params ) );
    }
}

export abstract class ViewFramed extends View {

    public getFrame(): any {
        return this.getParam( "frame", false );
    }
}

abstract class WidgetWindow extends JetView {

    private body: View = null;

    constructor( app: any, name: any, body: View ) {
        super( app, name );
        this.body = body;
    }

    public getBodyView(): View {
        return this.body;
    }

    config() {

        return {
            view: "window",
            move: true,
            position: "center",
            modal: true,
            head: {
                view: "layout",
                type: "head",
                padding: 8,
                rows: [
                    {
                        view: "toolbar",
                        elements: [
                            {
                                view: "icon", icon: "mdi mdi-chevron-down",
                                click: () => this.setFullScreen( false )
                            },
                            {
                                view: "icon", icon: "mdi mdi-chevron-up",
                                click: () => this.setFullScreen( true )
                            },
                            {
                                view: "icon", icon: "mdi mdi-close",
                                click: () => this.closeWindow()
                            }
                        ]
                    }
                ]
            },
            fullscreen: false,
            resize: true,
            width: 1200,
            height: 600,
            body: this.getBodyView()
        }
    }

    public isFullScreen(): boolean {
        return this.getWindow()["fullscreen"] == true;
    }

    public getWindow(): webix.ui.window {
        return this.getRoot() as webix.ui.window;
    }

    public setFullScreen( fullScreen: boolean ): void {
        var window = this.getWindow();
        window.define( "fullscreen", fullScreen );
        window.resize();
    }

    public showWindow() {
        var window = this.getWindow();
        window.show();
    }

    public closeWindow() {
        var window = this.getWindow();
        window.destructor();
    }
}

/***********************************************************************************
 * Widgets
 ***********************************************************************************/
export class WidgetSetup {
    public name: string;
    public $cssName?: string;
    public defaults?: any;
}

export interface WidgetConfig extends webix.ui.viewConfig {
    localId?: string;
    entry?: any;
}

export abstract class Widget<C extends WidgetConfig, W extends webix.ui.baseview> {

    private view: W = null;
    private jetApp: JetApp = null;

    public subscriptions: Array<Subscription> = null;

    public getConfig(): C {
        return this.view.config as C;
    }

    public getView(): W {
        return this.view;
    }

    public getApplication(): JetApp {
        return this.jetApp;
    }

    public abstract setup( setup: WidgetSetup ): void;
    public abstract config( config: C ): void;

    public static _prototype<W extends Widget<WidgetConfig, webix.ui.baseview>>( jetApp_param: JetApp, prototype_param: W ): any {

        const jetApp: JetApp = jetApp_param;
        const prototype: W = prototype_param;

        var target: WidgetSetup = {
            name: ""
        };

        // setup
        prototype.setup( target );

        target["$init"] = function( config: WidgetConfig ) {

            const widget: W = Object.create( prototype );
            widget.jetApp = jetApp;
            widget.config( config );

            // ready
            this.$ready.push( function() {

                widget.view = this;
                this["widget"] = widget;

                // events
                if ( prototype.subscriptions ) {

                    for ( const subscription of prototype.subscriptions ) {
                        this.attachEvent( subscription.event, ( ev: Event ) => {

                            //                            alert( subscription.event + " -> " + widget.getView().name + "(" + JSON.stringify( widget.getConfig().entry ) + ")" );

                            // TODO filter

                            widget[subscription.method]( ev );
                        } );
                    }
                }
            } );
        };

        return target;
    }
}

export interface WidgetContainerConfig extends WidgetConfig {
}

export abstract class WidgetContainer<C extends WidgetContainerConfig, W extends webix.ui.baseview> extends Widget<C, W> {


    public static queryContainers( view: webix.ui.view ): WidgetContainer<any, any>[] {

        var containers: WidgetContainer<any, any>[] = [];

        for ( let child of view.getChildViews() ) {

            if ( child.widget instanceof WidgetContainer ) {
                containers.push( child.widget );
            }
            else {
                var childContainers: WidgetContainer<any, any>[] = WidgetContainer.queryContainers( child );
                containers = containers.concat( childContainers );
            }
        }

        return containers;
    }

    public abstract notify( event: Event ): void;

    public static notifyEvent( event: Event, view: webix.ui.baseview, deep: boolean ): void {

        if ( view == event.source ) {
            //            alert( 'exclude view: ' + view.config.id );
            return;
        }

        var proto = view as webix.ui.proto;

        if ( proto.hasEvent && proto.hasEvent( event.type ) ) {
            var widget: Widget<any, any> = view["widget"];
            if ( widget ) {
                if ( event.entry ) {
                    //                    alert( JSON.stringify( setup.parameters ) );
                }
            }

            proto.callEvent( event.type, [event] );
        }

        // notify children
        if ( deep )
            WidgetContainer.notifyEvents( event, proto.getChildViews() );
    }

    public static notifyEvents( event: Event, views: any[] ): void {

        for ( let view of views ) {
            if ( view.widget instanceof WidgetContainer ) {
                var container = view.widget;
                container.notify( event );
            }
            else {
                WidgetContainer.notifyEvent( event, view, true );
            }
        }
    }
}
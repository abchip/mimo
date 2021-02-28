/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";
import { KBService, KBServices, KBEntities } from "base/kb";

/***********************************************************************************
 * UIView
 ***********************************************************************************/
export enum UIViewMode {
    DISPLAY = "display",
    SAVE = "save",
    DELETE = "delete",
    SELECT = "select"
}

export class UIViewModeUtils {
    public static getValues(): string[] {
        return [UIViewMode.DISPLAY, UIViewMode.SAVE, UIViewMode.DELETE, UIViewMode.SELECT] ;
    }
}

export class UIViewConfig {

    public mode?: UIViewMode;
    public frame?: string;
    public name?: string;

    public toolbarConfig?: UIToolbarConfig = {};
}

export abstract class UIView extends JetView {

    private mode: UIViewMode = null;
    private frame: string = null;
    private name: string = null;
    private toolbarConfig: UIToolbarConfig = {};

    private toolbarView: UIToolbarView = null;

    constructor( app: any, name: any, config: UIViewConfig ) {
        super( app, name );

        if ( config ) {

            this.mode = config.mode;
            this.frame = config.frame;
            this.name = config.name;

            if ( config.toolbarConfig )
                this.toolbarConfig = config.toolbarConfig;
        }

        if ( this.isToolbarEnabled() ) {
            this.toolbarView = new UIToolbarView( this.app, name, this.toolbarConfig );
        }
    }

    public static config( target: UIViewConfig, source: UIViewConfig, overwrite?: boolean ): any {
        if ( source == null )
            return webix.extend( target, {}, overwrite );
        else
            return webix.extend( target, source, overwrite );
    }

    public abstract getComponentConfig(): webix.ui.toolbarConfig;
    protected abstract doConfig(): any;

    public abstract getSelectedName(): string;

    public config(): any {


        var rows: any[] =  [] ;

        if ( this.isToolbarEnabled() && !this.isWindow() )
            rows.push( this.getToolbarView() );

        rows.push( this.doConfig() );

        var layoutConfig: webix.ui.datalayoutConfig = {
            view: "layout",
            rows: rows
        }

        return layoutConfig;
    }

    public urlChange() {
        if ( this.getFrame() )
            this.setTitle();
    }

    public isWindow(): boolean {
        if ( this.getParentView() && this.getParentView().getRoot() )
            return this.getParentView().getRoot().name == "window";
        else
            return false;
    }

    public getWindowView(): UIWindowView {
        return this.getParentView() as UIWindowView;
    }

    public isToolbarEnabled() {
        var isToolbarEnabled: boolean = null;

        if ( this.toolbarConfig.showToolbar )
            isToolbarEnabled = this.toolbarConfig.showToolbar;
        else
            isToolbarEnabled = this.getParam( "showToolbar", false ) as boolean;

        if ( isToolbarEnabled == null )
            isToolbarEnabled = true;

        return isToolbarEnabled;
    }

    public getMode(): UIViewMode {
        var mode: UIViewMode = null;
        if ( this.mode )
            mode = this.mode;
        else
            mode = this.getParam( "mode", false ) as UIViewMode;
        if ( mode == null )
            mode = UIViewMode.DISPLAY;
        return mode;
    }

    public setMode( mode: UIViewMode ) {
        this.mode = mode;
    }

    public getFrame(): string {
        if ( this.frame )
            return this.frame;
        else
            return this.getParam( "frame", false );
    }

    public getName(): string {
        if ( this.name )
            return this.name;
        else
            return this.getParam( "name", false );
    }

    public setName( name: string ) {
        this.name = name;
    }

    public getToolbarView(): UIToolbarView {
        return this.toolbarView;
    }

    private setTitle() {

        //        var title = this.capitalizeFirstLetter( this.getMode() as string );
        //        title = title + " -> " + this.getFrame();

        var title = this.getFrame();
        if ( this.getName() )
            title = title + " -> " + this.getName();

        // change title
        if ( this.getToolbarView().getToolbarLabel() )
            this.getToolbarView().getToolbarLabel().setValue( title );
    }

    private capitalizeFirstLetter( str: string ) {
        return str.charAt( 0 ).toUpperCase() + str.slice( 1 );
    }
}

/***********************************************************************************
 * UIToolbar 
 ***********************************************************************************/
export class UIToolbarConfig {
    public showToolbar?: boolean;
    public showEntity?: boolean;
    public showFrame?: boolean;
}

export class UIToolbarView extends JetView {

    private static TOOLBAR: string = "UIToolbarView";

    private showToolbar: boolean = true;
    private showFrame: boolean = true;
    private showEntity: boolean = true;

    private ENTITY_IDX: number = 0;
    private FRAME_IDX: number = 0;
    private COMPONENT_IDX: number = 0;
    private WINDOW_IDX: number = 0;

    constructor( app: any, name: any, config: UIToolbarConfig ) {
        super( app, name );

        if ( config.showToolbar == false )
            this.showToolbar = config.showToolbar;
        if ( config.showFrame == false )
            this.showFrame = config.showFrame;
        if ( config.showEntity == false )
            this.showEntity = config.showEntity;
    }

    config() {

        var elements: any[] =  [] ;

        // label
        var toolbarLabelConfig: webix.ui.labelConfig = {
            view: "label",
            align: "left",
            label: ""
        };
        elements.push( toolbarLabelConfig );

        // spacer
        elements.push( {} );

        // entity
        if ( this.showEntity == true ) {
            var toolbarEntityConfig: webix.ui.toolbarConfig = {
                view: "toolbar",
                elements: []
            };
            this.ENTITY_IDX = elements.length;
            elements.push( toolbarEntityConfig );
        }

        // frame
        if ( this.showFrame == true ) {
            var toolbarFrameConfig: webix.ui.toolbarConfig = {
                view: "toolbar",
                elements: []
            };
            this.FRAME_IDX = elements.length;
            elements.push( toolbarFrameConfig );
        }

        // component
        if ( this.getContainer().getComponentConfig() ) {
            this.COMPONENT_IDX = elements.length;
            elements.push( this.getContainer().getComponentConfig() );
        }

        // window
        if ( this.getParentView() instanceof UIWindowView ) {
            this.WINDOW_IDX = elements.length;
            elements.push(( this.getParentView() as UIWindowView ).getComponentConfig() );
        }

        var toolbarConfig: webix.ui.toolbarConfig = {
            view: "toolbar",
            elements: elements
        };
        toolbarConfig["localId"] = UIToolbarView.TOOLBAR;

        return toolbarConfig;
    }

    public urlChange() {

        if ( !this.getContainer().getFrame() )
            return;

        // label
        if ( this.getToolbarLabel() )
            this.getToolbarLabel().setValue( this.getContainer().getFrame() );

        // frameToolbar
        if ( this.showFrame == true )
            this.reloadFrameToolbar();

        // entityToolbar
        if ( this.showEntity == true )
            this.reloadEntityToolbar();
    }

    public getContainer(): UIView {
        if ( this.getParentView() instanceof UIWindowView )
            return ( this.getParentView() as UIWindowView ).getBodyView();
        else
            return this.getParentView() as UIView;
    }

    private getToolbar(): webix.ui.toolbar {
        try {
            return this.$$( UIToolbarView.TOOLBAR ) as webix.ui.toolbar;
        }
        catch ( exc ) {
            return null;
        }
    }

    public getToolbarLabel(): webix.ui.label {
        var toolbar = this.getToolbar();
        if ( toolbar == null )
            return null;

        return toolbar.getChildViews()[0];
    }

    public getToolbarEntity(): webix.ui.toolbar {
        var toolbar = this.getToolbar();
        if ( toolbar == null )
            return null;

        try {
            return toolbar.getChildViews()[this.ENTITY_IDX];
        }
        catch ( exc ) {
            return null;
        }
    }

    public getToolbarFrame(): webix.ui.toolbar {
        var toolbar = this.getToolbar();
        if ( toolbar == null )
            return null;
        try {
            return toolbar.getChildViews()[this.FRAME_IDX];
        }
        catch ( exc ) {
            return null;
        }
    }

    public getToolbarComponent(): webix.ui.toolbar {
        var toolbar = this.getToolbar();
        if ( toolbar == null )
            return null;
        try {
            return toolbar.getChildViews()[this.COMPONENT_IDX];
        }
        catch ( exc ) {
            return null;
        }
    }

    public getToolbarWindow(): webix.ui.toolbar {
        var toolbar = this.getToolbar();
        if ( toolbar == null )
            return null;

        try {
            return toolbar.getChildViews()[this.WINDOW_IDX];
        }
        catch ( exc ) {
            return null;
        }
    }

    protected reloadFrameToolbar() {

        var toolbar = this.getToolbarFrame();
        toolbar.reconstruct();

        const toolbarConfig: webix.DataRecord = UIToolbarUtils.lookupToolbar( this.getContainer().getFrame(), () => {

            toolbar.disable();

            if ( toolbarConfig.getValues().elements == null )
                return;

            for ( let viewConfig of toolbarConfig.getValues().elements ) {

                var viewId = toolbar.addView( viewConfig );
                var view = toolbar.queryView( { "id": viewId } );

                // onClick
                view.attachEvent( 'onItemClick', ( id ) => {

                    var selectedView = toolbar.queryView( { "id": id } );
                    var action = selectedView.config.action;

                    KBServices.lookupServiceByAction( this.app, this.getContainer().getFrame(), action, ( service: KBService ) => {
                        try {
                            service.exec( action, [this.getContainer()] );
                        }
                        catch ( exc ) {
                            alert( exc );
                        }
                    } );
                } );
            }

            toolbar.enable();
            toolbar.refresh();
        } );
    }

    protected reloadEntityToolbar() {

        var toolbar = this.getToolbarEntity();
        toolbar.reconstruct();

        const contextMenuConfig: webix.DataRecord = UIMenuUtils.lookupContextMenu( this.getContainer().getFrame(), () => {

            toolbar.disable();

            if ( contextMenuConfig.getValues().elements == null ) {
                toolbar.refresh();
                return;
            }

            for ( let actionConfig of contextMenuConfig.getValues().elements ) {

                if ( actionConfig.isa == "MenuAction" )
                    actionConfig["view"] = "icon";
                else if ( actionConfig.isa == "MenuGroup" )
                    continue;

                var viewId = toolbar.addView( actionConfig );
                var view = toolbar.queryView( { "id": viewId } );

                // onClick
                view.attachEvent( 'onItemClick', ( id ) => {

                    var selectedView = toolbar.queryView( { "id": id } );
                    var action = selectedView.config.action;

                    KBServices.lookupServiceByAction( this.app, this.getContainer().getFrame(), action, ( service: KBService ) => {
                        try {
                            var entityName = this.getContainer().getSelectedName();
                            service.exec( action, [this.getContainer(), this.getContainer().getFrame(), entityName] );
                        }
                        catch ( exc ) {
                            alert( exc );
                        }
                    } );
                } );
            }
        } );
    }
}

export class UIToolbarUtils {
    public static lookupToolbar( frame: string, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupToolbar", { frame: frame } ), null );

        return data;
    }
}

/***********************************************************************************
 * UIWindow 
 ***********************************************************************************/
export abstract class UIWindowView extends JetView {

    private body: UIView = null;

    constructor( app: any, name: any, body: UIView ) {
        super( app, name );
        this.body = body;
    }

    public getBodyView(): UIView {
        return this.body;
    }

    public getComponentConfig(): webix.ui.toolbarConfig {

        var toolbarComponentConfig: webix.ui.toolbarConfig = {
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
        };

        return toolbarComponentConfig;
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
                    this.getBodyView().getToolbarView()
                ]
            },
            //            head: this.body.getToolbarView(),
            //            head: this.getToolbarView(),
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
 * UITable 
 ***********************************************************************************/
export class UITableConfig extends UIViewConfig {
    public keys?: string;
    public filter?: string;
}

export abstract class UITableView extends UIView {

    private keys: string = null;
    private filter: string = null;

    constructor( app: any, name: any, config: UITableConfig ) {
        super( app, name, config );

        if ( config ) {
            this.keys = config.keys;
            this.filter = config.filter;
        }
    }

    public getKeys(): string {
        if ( this.keys )
            return this.keys;
        else
            return this.getParam( "keys", false );
    }

    public getFilter(): string {

        if ( this.filter != null ) {
            return this.filter;
        }
        else
            return this.getParam( "filter", false );
    }

    public abstract getDatatable(): webix.ui.datatable;

    public getEntityName( entity: any ) {

        var datatable = this.getDatatable();
        var entityName = null;

        for ( var i = 0; i < datatable.config.leftSplit; i++ ) {
            if ( entityName == null )
                entityName = entity[datatable.columnId( i )];
            else
                entityName = entityName + "/" + entity[datatable.columnId( i )];
        }
        
        return entityName;
    }

    public getSelectedName(): string {

        var datatable = this.getDatatable();
        var entity = datatable.getSelectedItem();
        if ( entity == null )
            return null;
        return this.getEntityName( entity );
    }

    protected reloadTableColumns( clear: boolean ) {

        var datatable = this.getDatatable();

        if ( clear )
            datatable.clearAll();

        const schema = UISchemaUtils.lookupSchema( this.getFrame(), true, () => {

            datatable.config.columns = [];

            if ( schema.getValues().columns != null ) {

                var keysLength: number = 0;
                var indexColumn: number = 0;
                for ( const columnConfig of schema.getValues().columns ) {

                    if ( columnConfig.leftSplit == true ) {
                        keysLength++;
                    }
                    if ( columnConfig.icon != null ) {
                        columnConfig.header = columnConfig.header + " <span class='webix_icon " + columnConfig.icon + "'></span> ";
                    }
                    switch ( columnConfig.widget ) {
                        case "checkbox":
                            columnConfig.template = "{common.checkbox()}";
                            break;
                        default:
                            break;
                    }

                    if ( columnConfig.group == "info" ) {
                        columnConfig.hidden = true;
                    }

                    datatable.config.columns[indexColumn] = columnConfig;
                    indexColumn = indexColumn + 1;
                }

                datatable.config.leftSplit = keysLength;

                // append info icon
                datatable.config.columns[indexColumn] = {
                    id: "info",
                    header: "Info",
                    template: data => {
                        return "<span class='webix_icon mdi mdi-information-outline'></span>";
                    }
                };
            }

            datatable.refreshColumns( null, true );
        } );
    }

    protected attachContextMenu(): webix.ui.contextmenu {

        const datatable = this.getDatatable();
        const contextMenu: webix.ui.contextmenu = webix.ui( {
            view: "contextmenu"
            //          autowidth: true,
            //            autoheight: true,
            //            autofocus: true,
            //            height: 200,
            //            modal: true,
            //            openAction:"click"  
            //            master: datatable.$view.id
        } ) as webix.ui.contextmenu;


        contextMenu.attachEvent( 'onShow', () => {
            //            contextMenu.resize();
            //            contextMenu.disable();
            //            contextMenu.enable();

            //            contextMenu.callEvent( "onFocus", null );
        } );

        datatable.attachEvent( 'onFocus', () => {
            contextMenu.hide();
        } );

        contextMenu.attachEvent( 'onBlur', () => {
            //            contextMenu.hide();
        } );

        contextMenu.attachEvent( 'onMenuItemClick', ( id ) => {

            var frameName = null;
            var entityName = null;

            var context = contextMenu.getContext();
            var itemMenu = contextMenu.getMenuItem( id );

            var entity = datatable.getItem( context.id );

            frameName = entity["isa"];
            var index = frameName.lastIndexOf( "/" );
            frameName = frameName.substring( index + 1 );

            entityName = this.getEntityName( entity );

            var action = itemMenu.action;
            KBServices.lookupServiceByAction( this.app, frameName, action, ( service: KBService ) => {
                try {
                    service.exec( action, [this, frameName, entityName] );
                }
                catch ( exc ) {
                    alert( exc );
                }
            } );
        } );

        contextMenu.attachTo( datatable );

        return contextMenu;
    }
}

export class UITableUtils {

}

/***********************************************************************************
 * UIForm
 ***********************************************************************************/
export abstract class UIFormView extends UIView {

    constructor( app: any, name: any, config: UIViewConfig ) {
        super( app, name, UIView.config( {
            toolbarConfig: {
                showFrame: false,
                showEntity: false
            }
        }, config, true ) );
    }

    public abstract getForm(): webix.ui.form;

    public getSelectedName(): string {
        return this.getName();
    }

    public getFormField( name: string ): webix.ui.baseview {
        var formField = this.getForm().elements[name] as webix.ui.baseview;
        return formField;
    }

    protected buildForm( form: webix.ui.form, frame: string, name: string ) {

        const formConfig: webix.DataRecord = UIFormUtils.lookupForm( this.getFrame(), true, () => {

            // reconstruct
            form.reconstruct();

            // check empty
            if ( formConfig.getValues().fields == null ) {
                // TODO 
                return;
            }

            this.completeForm( formConfig, form, frame, name );

            form.refresh();
            //            form.resize();

        } )
    }

    protected completeForm( formConfig: webix.DataRecord, form: webix.ui.form, frame: string, name: string ) {

        var keysToken = null;

        if ( name )
            keysToken = name.split( "/" );

        var keysValue = new Object();
        var keysSplitted: number = 0;

        for ( let fieldConfig of formConfig.getValues().fields ) {

            //            fieldConfig.height = 50;
            fieldConfig.widget.labelWidth = 250;

            // key management
            if ( fieldConfig.topSplit ) {

                if ( keysToken && keysToken.length > keysSplitted ) {
                    keysValue[fieldConfig.name] = keysToken[keysSplitted];
                    fieldConfig.widget.view = "text";
                    fieldConfig.disabled = "true";
                }
                keysSplitted++;
            }

            if ( fieldConfig.icon != null )
                fieldConfig.label = fieldConfig.label + " <span class='webix_icon " + fieldConfig.icon + "'></span> ";

            if(fieldConfig.widget.view.startsWith("mm-"))
                fieldConfig.widget.view = fieldConfig.widget.view.substring(3);

//            alert(KBEntities.stringify( fieldConfig.widget ));
            
            switch ( fieldConfig.widget.view ) {
                case "combo":
                    if ( fieldConfig.icon != null )
                        fieldConfig.icon = "mdi mdi-menu-down";

                    var viewId = form.addView( webix.extend( { options: [] }, fieldConfig.widget, false ) );
                    const fieldCombo = form.queryView( { "id": viewId } ) as webix.ui.combo;
                    const contextMenu = this.attachContextMenu( fieldConfig.widget.entry.frame, fieldCombo );

                    //                    fieldCombo.attachEvent( "onFocus", () => {
                    UIMenuUtils.reloadContextMenu( contextMenu, fieldConfig.widget.entry.frame );
                    var list = fieldCombo.getList() as webix.ui.list;
                    list.parse( KBEntities.findNames( fieldConfig.widget.entry.frame, null ), null );
                    //                    } );

                    break;
                case "form":

                    var viewId = form.addView( webix.extend( { elements: [] }, fieldConfig.widget, false ) );
                    var fieldForm = form.queryView( { "id": viewId } ) as webix.ui.form;

                    if ( keysToken.length == 2 )
                        this.buildForm( fieldForm, fieldConfig.widget.entry.frame, keysToken[1] );
                    else
                        this.buildForm( fieldForm, fieldConfig.widget.entry.frame, null );
                    break;
                case "note":
                    /*                        const fieldNote = new EntityNote( this.app, {
                                                mode: this.getMode(),
                                                frame: fieldConfig.domain.frame,
                                                name: name
                                            } );
                    
                                            form.addView( fieldNote );*/
                    break;
                case "switch":
                    form.addView( fieldConfig.widget );
                    break;
                case "datepicker":
                    fieldConfig.timepicker = true;
                    fieldConfig.format = "%d %M %Y at %H:%i";
                    form.addView( fieldConfig.widget );
                    break;
                case "checkbox":
                    form.addView( fieldConfig.widget );
                    break;
                case "counter":
                    form.addView( fieldConfig.widget );
                    break;
                case "photo":
                case "image":                    
                    //                    form.addView( fieldConfig );
                    fieldConfig.widget.view = "label";
                    form.addView(
                        {
                            view: "layout",
                            cols: [
                                fieldConfig.widget,
                                {
                                    view: "label",
                                    width: 512,
                                    height: 396,
                                    template: "<img src='images/" + frame + "/default.jpg'>"
                                }, {}
                            ]
                        }
                    );

                    break;
                case "number":
                    fieldConfig.widget.view = "text";
                case "text":

                    if ( fieldConfig.name == "icon" ) {
                        var viewId = form.addView( {
                            view: "layout",
                            cols: [
                                fieldConfig.widget,
                                {
                                    view: "icon",
                                    align: "left"
                                }
                            ]
                        } );

                        // icon synchronization
                        const fieldLayout = form.queryView( { "id": viewId } ) as webix.ui.layout;
                        const fieldText = fieldLayout.getChildViews()[0] as webix.ui.text;
                        const fieldIcon = fieldLayout.getChildViews()[1] as webix.ui.icon;
                        fieldText.attachEvent( "onChange", () => {
                            fieldIcon.define( "icon", fieldText.getValue() );
                            fieldIcon.refresh();
                        } );
                        fieldText.attachEvent( "onEnter", () => {
                            fieldIcon.define( "icon", fieldText.getValue() );
                            fieldIcon.refresh();
                        } );
                    }
                    else
                        form.addView( fieldConfig.widget );

                    break;
                default:
                    alert(KBEntities.stringify( fieldConfig ));
            }
        }

        // keys
        form.setValues( keysValue );

        // get entity
        if ( name != null ) {
            if ( keysToken.length < keysSplitted ) {
                // TODO prototype
                //                alert( "prototype" );
            }
            else {
                const entity = KBEntities.lookupEntity( frame, name, () => {
                    form.setValues( entity.getValues(), true );
                } );
            }
        }
    }

    protected attachContextMenu( frame: string, combo: webix.ui.combo ): webix.ui.contextmenu {

        const contextMenu: webix.ui.contextmenu = webix.ui( {
            view: "contextmenu",
            autofocus: true,
            master: combo.getInputNode().id
        } ) as webix.ui.contextmenu;


        contextMenu.attachEvent( 'onShow', () => {

            //            contextMenu.adjust();
            //            contextMenu.enable();
            //            contextMenu.callEvent( "onFocus", null );

            if ( combo.getValue() == "" )
                contextMenu.hide();
        } );

        combo.attachEvent( 'onBlur', () => {
            contextMenu.hide();
        } );

        contextMenu.attachEvent( 'onBlur', () => {
            //            contextMenu.hide();
        } );

        contextMenu.attachEvent( 'onMenuItemClick', ( id ) => {

            var frameName = null;
            var entityName = null;

            var context = contextMenu.getContext();
            var itemMenu = contextMenu.getMenuItem( id );

            var action = itemMenu.action;
            KBServices.lookupServiceByAction( this.app, frame, action, ( service: KBService ) => {
                try {
                    service.exec( action, [this, frame, combo.getValue()] );
                }
                catch ( exc ) {
                    alert( exc );
                }
            } );
        } );

        return contextMenu;
    }
}

export class UIFormUtils {

    public static lookupForm( frame: string, prototype: boolean, callback ): webix.DataRecord {


        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupForm", { frame: frame, name: frame, prototype: prototype } ), null );
        return data;
    }
}

/***********************************************************************************
 * UITab
 ***********************************************************************************/
export abstract class UITabView extends UIView {

    public static TABVIEW: string = "entity_tabview";

    constructor( app: any, name: any, config: UIViewConfig ) {
        super( app, name, UIView.config( {
            toolbarConfig: {
                showFrame: false,
                showEntity: false
            }
        }, config, true ) );
    }

    public getSelectedName(): string {
        return null;
    }

    protected getTabView(): webix.ui.tabview {
        return this.$$( UITabView.TABVIEW ) as webix.ui.tabview;
    }

    public init( view: any, urls: any[] ) {
        super.init( view, urls );
    }

    protected addOption( id: string, value: string, close: boolean, config: webix.ui.baselayoutConfig ) {

        var view: webix.ui.layout = this.getTabView().queryView( { "id": id } );
        if ( view != null )
            this.getTabView().getMultiview().removeView( id );

        this.getTabView().getTabbar().addOption( { id: id, value: value, close: close } );

        if ( config != null )
            this.getTabView().getMultiview().addView( config );
        // proxy view
        else {
            var viewConfig = {
                id: id,
                view: "layout",
                rows: [
                    {
                        gravity: 0.1
                    }
                ]
            };
            this.getTabView().getMultiview().addView( viewConfig );
        }

    }

    protected removeOption( id: string | number ): void {
        try {
            ( this.getTabView().getTabbar() as webix.ui.tabbar ).removeOption( id );
            var view: webix.ui.baseview = this.getTabView().queryView( { "id": id } );
            if ( view != null )
                view.destructor();
        }
        catch ( e ) {
        }
    }
}

export class UITabUtils {

}

/***********************************************************************************
 * UIMenu
 ***********************************************************************************/

export abstract class UIMenuView extends JetView {

    private eventSelect: any = null;

    public abstract getSidebar(): webix.ui.sidebar;

    public ready( view: any, urls: any[] ) {
        this.buildMenu( urls );
    }

    public buildMenu( urls: any[] ) {

        var sidebar = this.getSidebar();
        if ( this.eventSelect != null )
            sidebar.detachEvent( this.eventSelect );

        sidebar.clearAll();

        const menu: webix.DataRecord = UIMenuUtils.lookupMenu( "", () => {
            if ( menu.getValues() == null )
                return;

            sidebar.parse( menu.getValues().elements, null );

            var url = this.getUrlString().slice( urls[0].page.length + 1 );
            this.selectItemSidebar( url, true );

            this.eventSelect = sidebar.attachEvent( "onItemClick", ( id ) => {
                var item = sidebar.getItem( id );
                if ( item.isa == "MenuAction" ) {
                    if ( item.filter != null ) {
                        this.show( item.action + "&filter=" + item.filter );
                    }
                    else
                        this.show( item.action );
                }
            } );
        } );
    }

    protected openFirstSidebar() {

        var sidebar = this.getSidebar();
        var elementId = sidebar.getFirstId();
        while ( elementId != null ) {
            var elementOld = elementId;
            elementId = sidebar.getNextId( elementId, null );
            sidebar.open( elementOld );
            break;
        }
    }

    protected selectItemSidebar( url: string, all: boolean ) {

        var sidebar = this.getSidebar();

        var elementId = sidebar.getFirstId();
        while ( elementId != null ) {
            var menu = sidebar.getItem( elementId );
            if ( this.selectItemMenuSidebar( menu, url ) )
                if ( !all )
                    break;
            elementId = sidebar.getNextId( elementId, null );
        }
    }

    protected selectItemMenuSidebar( menu, url: string ): boolean {

        var sidebar = this.getSidebar();

        var found: boolean = false;

        var elementId = sidebar.getFirstChildId( menu.id );
        while ( elementId != null ) {
            var dataNode = sidebar.getItem( elementId );
            
//            alert(KBEntities.stringify(dataNode));
            
            if ( dataNode.isa == "MenuAction" ) {
                var menuAction = dataNode;

                // TODO                + "&filter=" + item.filter
                if ( menuAction.action == url && !menuAction.filter ) {
                    sidebar.select( elementId, true );

                    var parent = menuAction.$parent;
                    while ( parent != null ) {
                        try {
                            sidebar.open( parent );
                            var parentItem = sidebar.getItem( parent );
                            parent = parentItem.$parent;
                        }
                        catch ( exc ) {
                            parent = null;
                        }
                    }

                    found = true;
                }
            }
            else if ( dataNode.isa == "MenuGroup" ) {
                var menuGroup = dataNode;
                found = this.selectItemMenuSidebar( menuGroup, url );
            }
            else  {
                alert( "Unexpected condition: wiertyfbaswei8dfdsfa" );
            }

            if ( found )
                break;

            elementId = sidebar.getNextSiblingId( elementId ) as string;
        }

        return found;
    }
}

export class UIMenuUtils {

    public static lookupContextMenu( frame: string, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupContextMenu", { frame: frame } ), null );

        return data;
    }

    public static lookupMenu( name, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupMenu", { name: name } ), null );

        return data;
    }

    public static reloadContextMenu( contextMenu: webix.ui.contextmenu, frame: string ) {

        contextMenu.clearAll();
        const contextMenuConfig: webix.DataRecord = UIMenuUtils.lookupContextMenu( frame, () => {

            if ( contextMenuConfig.getValues().elements == null ) {
                contextMenu.disable();
                return;
            }

            for ( let actionConfig of contextMenuConfig.getValues().elements )
                contextMenu.add( actionConfig );

            contextMenu.enable();
        } );
    }
}

/***********************************************************************************
 * UISchema
 ***********************************************************************************/
export abstract class UISchemaView extends UIView {
}

export class UISchemaUtils {

    public static lookupSchema( name, prototype, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupSchema", { frame: name, name: name, prototype: prototype } ), null );

        return data;
    }
}

/*
 * UINote
 */
export abstract class UINoteView extends UIView {

    constructor( app: any, name: any, config: UIViewConfig ) {
        super( app, name, UIView.config( {
            toolbarConfig: {
                showFrame: false,
                showEntity: false
            }
        }, config, true ) );
    }

    public getSelectedName(): string {
        return this.getName();
    }
}

export class UINoteUtils {

}

/*
 * UIBrowser
 */
export abstract class UIBrowserView extends UIView {

    public getSelectedName(): string {
        return this.getName();
    }
}

export class UIBrowserUtils {

}

/**********************************************************************************
 * UIQuery
 **********************************************************************************/
export abstract class UIQueryView extends UIView {

    public getSelectedName(): string {
        return null;
    }
}

export class UIQueryUtils {

    public static lookupQuery( frame: string, prototype: boolean, callback ): webix.DataRecord {

        var data = new webix.DataRecord( {} );
        if ( callback != null )
            data.attachEvent( "onAfterLoad", callback );

        data.parse( KBEntities.sendBizRequest( "lookupQuery", { frame: frame, name: frame, prototype: prototype } ), null );

        return data;
    }
}

/**********************************************************************************
 * UIUploader
 **********************************************************************************/
export class UIUploaderConfig extends UIViewConfig {
    public upload: string;
}

export abstract class UIUploaderView extends UIView {

    private upload: string = null;

    constructor( app: any, name: any, config: UIUploaderConfig ) {
        super( app, name, config );

        if ( config )
            this.upload = config.upload;
    }

    public getSelectedName(): string {
        return null;
    }

    public getUpload(): string {

        if ( this.upload )
            return this.upload;
        else
            return this.getParam( "upload", false );
    }
}

export class UIUploaderUtils {
}
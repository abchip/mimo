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
import { KBEntities } from "base/kb";
import { UIWindowView, UITabView, UIViewModeUtils } from "base/ui";
import { EntitiesTable } from "views/table";
import { EntityForm } from "views/form";

export default class TestTab extends UITabView {

    public getComponentConfig(): webix.ui.toolbarConfig {
        return null;
    }

    protected doConfig(): any {

        var tabview = {
            view: "tabview",
            localId: UITabView.TABVIEW,
            cells: [
                {
                    header: "Table",
                    body: TestTable
                },
                {
                    header: "Query",
                    body: TestQuery
                },
                {
                    header: "Form",
                    body: TestForm
                },
                {
                    header: "Editor",
                    body: TestEditor
                },
                {
                    header: "Note",
                    body: TestNote
                },
                {
                    header: "Uploader",
                    body: TestUploader
                },
                {
                    header: "Browser",
                    body: TestBrowser
                }
            ],
            tabMinWidth: 150,
            tabMoreWidth: 50,
            moreTemplate: "+"
        }

        return tabview;
    }
}

export class TestTabWindow extends UIWindowView {

    constructor( app: any, name: any ) {
        super( app, name, new TestTab( app, name, null ) );
    }
}

export class TestTable extends JetView {

    private table: EntitiesTable = null;

    config() {
        var form = {
            view: "form",
            localId: "table_form",
            scroll: true,
            gravity: 0.4,
            elements: [
                { view: "search", label: "Frame", name: "frame" },
                { view: "combo", label: "Mode", name: "mode", options: UIViewModeUtils.getValues() },
                { view: "checkbox", label: "Toolbar", name: "showToolbar", value: 1 },
                { view: "checkbox", label: "ContextMenu", name: "showContextMenu", value: 1 }
            ],
            elementsConfig: {
                labelWidth: 200
            }
        }

        this.table = new EntitiesTable( this.app, "", null );
        return {
            view: "layout",
            rows: [
                form,
                { view: "resizer" },
                this.table
            ]
        };
    }

    init() {

        ( this.$$( "table_form" ) as webix.ui.form ).getChildViews()[0].focus();

        const form = this.$$( "table_form" ) as webix.ui.form;
        form.attachEvent( "onSubmit", () => {
            this.table.setParam( "frame", form.getValues().frame );
            this.table.urlChange();
        } );

    }
}

export class TestQuery extends JetView {

    config() {
        var form = {
            view: "form",
            localId: "query_form",
            scroll: true,
            gravity: 0.3,
            elements: [
                { view: "search", label: "Frame", name: "frame" },
                { view: "combo", label: "Mode", name: "mode", options: UIViewModeUtils.getValues() },
                { view: "checkbox", label: "Toolbar", name: "showToolbar", value: 1 }
            ],
            elementsConfig: {
                labelWidth: 200
            }
        }

        return {
            view: "layout",
            rows: [
                form
            ]
        };
    }
}

export class TestForm extends JetView {

    private form: EntityForm = null;

    config() {

        var form = {
            view: "form",
            localId: "form_form",
            scroll: true,
            gravity: 0.3,
            elements: [
                {
                    cols: [
                        { view: "search", label: "Frame", name: "frame" },
                        {},
                        { view: "text", label: "Name", name: "name" },
                        {}
                    ]
                },
                { view: "combo", label: "Mode", name: "mode", options: UIViewModeUtils.getValues() },
                { view: "checkbox", label: "Toolbar", name: "showToolbar", value: 1 }
            ],
            elementsConfig: {
                labelWidth: 200
            }
        }

        this.form = new EntityForm( this.app, "", null );

        return {
            view: "layout",
            rows: [
                form,
                this.form
            ]
        };
    }

    init() {

        const form = this.$$( "form_form" ) as webix.ui.form;
        form.attachEvent( "onSubmit", () => {

            this.form.setParam( "frame", form.getValues().frame );
            this.form.setParam( "name", form.getValues().name );
            this.form.setParam( "mode", form.getValues().mode );
            this.form.urlChange();
        } );

    }
}

export class TestEditor extends JetView {

    config() {

        var form = {
            view: "form",
            localId: "editor_form",
            scroll: true,
            gravity: 0.3,
            elements: [
                {
                    cols: [
                        { view: "search", label: "Frame", name: "frame" },
                        {},
                        { view: "text", label: "Name", name: "name" },
                        {}
                    ]
                },
                { view: "combo", label: "Mode", name: "mode", options: UIViewModeUtils.getValues() },
                { view: "checkbox", label: "Toolbar", name: "showToolbar", value: 1 }
            ],
            elementsConfig: {
                labelWidth: 200
            }
        }

        return {
            view: "layout",
            rows: [
                form
            ]
        };
    }
}

export class TestNote extends JetView {

    config() {

        var form = {
            view: "form",
            localId: "note_form",
            scroll: true,
            gravity: 0.3,
            elements: [
                {
                    cols: [
                        { view: "search", label: "Frame", name: "frame" },
                        {},
                        { view: "text", label: "Name", name: "name" },
                        {}
                    ]
                },
                { view: "combo", label: "Mode", name: "mode", options: UIViewModeUtils.getValues() },
                { view: "checkbox", label: "Toolbar", name: "showToolbar", value: 1 }
            ],
            elementsConfig: {
                labelWidth: 200
            }
        }

        return {
            view: "layout",
            rows: [
                form
            ]
        };
    }
}

export class TestUploader extends JetView {

    config() {

        var form = {
            view: "form",
            localId: "uploader_form",
            scroll: true,
            gravity: 0.3,
            elements: [
                { view: "search", label: "Frame", name: "frame" },
                { view: "checkbox", label: "Toolbar", name: "showToolbar", value: 1 },
                { view: "text", label: "Upload", name: "upload" },
            ],
            elementsConfig: {
                labelWidth: 200
            }
        }

        return {
            view: "layout",
            rows: [
                form
            ],
            elementsConfig: {
                labelWidth: 200
            }
        };
    }
}

export class TestBrowser extends JetView {

    config() {

        var form = {
            view: "form",
            localId: "browser_form",
            scroll: true,
            gravity: 0.3,
            elements: [
                { view: "text", label: "URL", name: "url" },
                { view: "checkbox", label: "Toolbar", name: "showToolbar", value: 1 }
            ],
            elementsConfig: {
                labelWidth: 200
            }
        }

        return {
            view: "layout",
            rows: [
                form
            ]
        };
    }
}
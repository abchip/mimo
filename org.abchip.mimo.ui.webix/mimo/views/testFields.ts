/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import * as webix from "@xbs/webix-pro";
import { JetView } from "webix-jet";

export default class TestFields extends JetView {

    config() {

        var numberFormat = {
            edit: function( v ) { return webix.Number.format( v, webix.i18n ); },
            parse: function( v ) { return webix.Number.parse( v, webix.i18n ); }
        };
        var dateFormat1 = function( v ) { return webix.i18n.fullDateFormatStr( v ) };
        var dateFormat2 = function( v ) { return webix.i18n.dateFormatStr( v ) };
        var dateFormat3 = function( v ) { return webix.i18n.longDateFormatStr( v ) };


        //        var priceNumber = function( v ) { return webix.i18n.priceFormat(parseInt(v) )};

        var form = {
            view: "form",
            localId: "fieldForm",
            scroll: true,
            gravity: 0.3,
            elements: [
                {
                    cols: [
                        { view: "button", value: "en-US", click: () => this.switchLocale( "en-US" ) },
                        { view: "button", value: "ru-RU", click: () => this.switchLocale( "ru-RU" ) },
                        { view: "button", value: "fr-FR", click: () => this.switchLocale( "fr-FR" ) },
                        { view: "button", value: "ja-JP", click: () => this.switchLocale( "ja-JP" ) },
                        { view: "button", value: "be-BY", click: () => this.switchLocale( "be-BY" ) },
                        { view: "button", value: "de-DE", click: () => this.switchLocale( "de-DE" ) },
                        { view: "button", value: "es-ES", click: () => this.switchLocale( "es-ES" ) },
                        { view: "button", value: "it-IT", click: () => this.switchLocale( "it-IT" ) },
                        { view: "button", value: "zh-CN", click: () => this.switchLocale( "zh-CN" ) }
                    ]
                },

                { view: "label", label: "Alphanumeric field" },
                {
                    cols: [
                        { view: "text", label: "1 char max", name: "text01", attributes: { maxlength: 1 } },
                        { view: "text", label: "10 char max", name: "text02", attributes: { maxlength: 10 } },
                        { view: "text", label: "20 char max", name: "text03", attributes: { maxlength: 20 } }
                    ]
                },
                {
                    cols: [
                        { view: "text", label: "Align left", name: "text04", value: "left", attributes: { maxlength: 10 }, inputAlign: "left" },
                        { view: "text", label: "Align center", name: "text05", value: "center", attributes: { maxlength: 10 }, inputAlign: "center" },
                        { view: "text", label: "Align right", name: "text06", value: "right", attributes: { maxlength: 10 }, inputAlign: "right" }
                    ]
                },

                { view: "label", label: "Numeric field" },

                {
                    cols: [
                        { view: "text", label: "Number 1", name: "number1", value: 1, format: numberFormat },
                        { view: "text", label: "Number 2", name: "number2", value: 10, format: numberFormat },
                        { view: "text", label: "Number 3", name: "number3", value: 100, format: numberFormat }
                    ]
                },
                {
                    cols: [
                        { view: "text", label: "Number 4", name: "number4", value: 1000, format: numberFormat },
                        { view: "text", label: "Number 5", name: "number5", value: 10000, format: numberFormat },
                        { view: "text", label: "Number 6", name: "number6", value: 100000, format: numberFormat }
                    ]
                },
                {
                    cols: [
                        { view: "text", label: "Number 7", name: "number7", value: 100.1234, format: numberFormat },
                        { view: "text", label: "Number 8", name: "number8", value: 1000.1234, format: numberFormat },
                        { view: "text", label: "Number 9", name: "number9", value: 10000.1234, format: numberFormat }
                    ]
                },

                { view: "label", label: "Date field" },
                { view: "datepicker", timepicker: true, label: "Date 1", name: "date1", value: new Date(), format: dateFormat1 },
                { view: "datepicker", timepicker: true, label: "Date 2", name: "date2", value: new Date(), format: dateFormat2 },
                { view: "datepicker", timepicker: true, label: "Date 3", name: "date3", value: new Date(), format: dateFormat3 },

                { view: "label", label: "Price field" },
                //                { view: "text", label: "Price 1", name: "price1", value: this.getPriceFormat(123456789.1234) },

                { view: "text", label: "Price 1", name: "price1", value: webix.i18n.priceFormat( 1234567.1234 ), },



                { view: "label", label: "Pattern field" },
                { view: "text", label: "Phone number", value: "3384029377", name: "pattern01", pattern: { mask: "###-## ########", allow: /[0-9]/g } },
                { view: "text", label: "CardNumber", value: "1111222233334444", name: "msnr", pattern: { mask: "#### #### #### ####", allow: /[0-9]/g } },

                { view: "button", value: "Get Values Form", click: () => this.getValuesForm() }


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

    private getPriceFormat( value ) {
        return webix.i18n.priceFormat( value );
    }

    private getValuesForm() {
        var fieldForm: webix.ui.form = this.$$( "fieldForm" ) as webix.ui.form;
        var values = fieldForm.getValues();
    }

    private switchLocale( locale ) {
        webix.i18n.setLocale( locale );
        //        alert(KBEntities.stringify(webix.i18n));
        var fieldForm: webix.ui.form = this.$$( "fieldForm" ) as webix.ui.form;
        fieldForm.reconstruct();
        fieldForm.refresh();
    }
}
/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { JetView } from "webix-jet";

export class FrameDashboard extends JetView {

    config() {

        var dataset_colors = [
            { id: 1, sales: 20, year: "02", color: "#ee4339" },
            { id: 2, sales: 55, year: "03", color: "#ee9336" },
            { id: 3, sales: 40, year: "04", color: "#eed236" },
            { id: 4, sales: 78, year: "05", color: "#d3ee36" },
            { id: 5, sales: 61, year: "06", color: "#a7ee70" },
            { id: 6, sales: 35, year: "07", color: "#58dccd" },
            { id: 7, sales: 80, year: "08", color: "#36abee" },
            { id: 8, sales: 50, year: "09", color: "#476cee" },
            { id: 9, sales: 65, year: "10", color: "#a244ea" },
            { id: 10, sales: 59, year: "11", color: "#e33fc7" }
        ];
        var dataset = [
            { id: 1, sales: 20, year: "02" },
            { id: 2, sales: 55, year: "03" },
            { id: 3, sales: 40, year: "04" },
            { id: 4, sales: 78, year: "05" },
            { id: 5, sales: 61, year: "06" },
            { id: 6, sales: 35, year: "07" },
            { id: 7, sales: 80, year: "08" },
            { id: 8, sales: 50, year: "09" },
            { id: 9, sales: 65, year: "10" },
            { id: 10, sales: 59, year: "11" }
        ];
        var multiple_dataset = [
            { sales: "20", sales2: "35", sales3: "55", year: "02" },
            { sales: "40", sales2: "24", sales3: "40", year: "03" },
            { sales: "44", sales2: "20", sales3: "27", year: "04" },
            { sales: "23", sales2: "50", sales3: "43", year: "05" },
            { sales: "21", sales2: "36", sales3: "31", year: "06" },
            { sales: "50", sales2: "40", sales3: "56", year: "07" },
            { sales: "30", sales2: "65", sales3: "75", year: "08" },
            { sales: "90", sales2: "62", sales3: "55", year: "09" },
            { sales: "55", sales2: "40", sales3: "60", year: "10" },
            { sales: "72", sales2: "45", sales3: "54", year: "11" }
        ];

        var achart = {
            view: "chart",
            type: "bar",
            value: "#sales#",
            color: "#color#",
            barWidth: 30,
            radius: 0,
            tooltip: {
                template: "#sales#"
            },
            xAxis: {
                template: "'#year#"
            },
            yAxis: {
                start: 0,
                step: 10,
                end: 100
            },
            padding: {
                bottom: 55
            },
            data: dataset_colors
        };
        var bchart = {
            view: "chart",
            type: "spline",
            value: "#sales#",
            item: {
                borderColor: "#ffffff",
                color: "#000000"
            },
            line: {
                color: "#ff9900",
                width: 3
            },
            xAxis: {
                template: "'#year#"
            },
            offset: 0,
            yAxis: {
                start: 0,
                end: 100,
                step: 10,
                template: function( obj ) {
                    return ( obj % 20 ? "" : obj )
                }
            },
            padding: {
                bottom: 55
            },
            data: dataset
        };
        var cchart = {
            view: "chart",
            type: "line",
            xAxis: {
                template: "'#year#"
            },
            yAxis: {
                start: 0,
                step: 10,
                end: 100
            },
            offset: 0,
            legend: {
                values: [{ text: "Company A" }, { text: "Company B" }, { text: "Company C" }],
                align: "right",
                valign: "middle",
                layout: "y",
                width: 100,
                margin: 8,
                marker: {
                    type: "item",
                    width: 18
                }
            },
            series: [
                {
                    value: "#sales#",
                    item: {
                        borderColor: "#447900",
                        color: "#69ba00"
                    },
                    line: {
                        color: "#69ba00",
                        width: 2
                    },
                    tooltip: {
                        template: "#sales#"
                    }
                },
                {
                    value: "#sales2#",
                    item: {
                        borderColor: "#0a796a",
                        color: "#4aa397",
                        type: "s",
                        radius: 4
                    },
                    line: {
                        color: "#4aa397",
                        width: 2
                    },
                    tooltip: {
                        template: "#sales2#"
                    }
                },
                {
                    value: "#sales3#",
                    item: {
                        borderColor: "#b7286c",
                        color: "#de619c",
                        type: "t",
                        radius: 4
                    },
                    line: {
                        color: "#de619c",
                        width: 2
                    },
                    tooltip: {
                        template: "#sales3#"
                    }
                }
            ],
            padding: {
                bottom: 55
            },
            data: multiple_dataset
        };

        return {
            css: "webix_dark",
            view: "carousel",
            cols: [
                cchart, bchart, achart
            ],
            navigation: {
//                type: "side"
            }
        };
    }
}

export default class FrameDashboardDefault extends FrameDashboard {
}
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
import { KBEntities } from "core/kb";

export class ApplicationToolbar extends JetView {

	config() {

		var srcPicture = "images/account-circle.png";
		if (KBEntities.getContext().picture) {
			srcPicture = KBEntities.getContext().picture;
		}

		return {
			view: "toolbar",
			elements: [
				{
					rows: [
						{
							height: 70,
							cols: [
								{
									view: "template",
									gravity: 0.33,
									borderless: true,
									data: { src: "images/abchip_small.png" },
									template: function(obj: any) {
										return "<img class='image' src='" + obj.src + "'/>"
									},
									onClick: {
										"image": function() {
											// go to home
											this.$scope.app.show();
										}
									}
								},
								{
									view: "icon",
									icon: "mdi mdi-microphone",
									align: "left",
									click: () => {
									}
								},
								{
									view: "form",
									borderless: true,
									label: "?",
									elements: [
										{
											view: "text",
											id: "my_input",
											placeholder: "Insert a command or ? to help"
										}
									]
								},
								{},
								{
									view: "label",
									template: "<img class='image' style='width:63px; height:63px;' src='" + srcPicture + "'>",
									gravity: 0.1,
									borderless: true,
									popup: {
										view: "popup",
										head: "Submenu",
										width: 400,
										body: {
											view: "layout",
											rows: [
												{
													view: "label",
													label: "ContextId: " + KBEntities.getContext().id,
												},
												{
													view: "label",
													label: "User: " + KBEntities.getContext().user,
												},
												{
													view: "label",
													label: "Tenant: " + KBEntities.getContext().tenant,
												},
												{
													view: "label",
													label: "Anonymous: " + KBEntities.getContext().anonymous,
												},
												{
													view: "label",
													label: "Currency: " + KBEntities.getContext().currencyUom,
												},
												{
													view: "label",
													label: "Locale: " + KBEntities.getContext().locale,
												},
												{
													view: "label",
													label: "TimeZone: " + KBEntities.getContext().timeZone,
												},
												{
													view: "label",
													label: "<span class='webix_icon mdi mdi-settings'></span> Profile settings",
													click: () => {
														this.show("profileSettings");
													}
												},
												{
													view: "label",
													label: "<span class='webix_icon mdi mdi-logout'></span> Logout",
													click: () => {
														this.show("/logout");
													}
												}
											],
											autowidth: true,
											autoheight: true,
											select: true
										}
									}
								}
							]
						}
					]
				}
			]
		};
	}

	ready(view: any, urls: any[]) {
		super.ready(view, urls);

		var input = $$("my_input") as webix.ui.text;
		if(!input)
			return;
		
		input.attachEvent("onEnter", (ev) => {
			alert(ev);
			//            alert( KBEntities.stringify( input.getValue() ) );

			if (input.getValue().trim() == "?")
				alert("Ma un giorno il vitello dai piedi di balsa si reco' dal vitello coi piedi di cobalto. Gli disse C'e' il vitello coi piedi tonnati che parla molto male di te: sostiene che i tuoi piedi non sono di vero cobalto ma sono soltanto quattro piedi di pane ricoperti da un sottile strato di cobalto. ");
			else {

				var splitted = input.getValue().trim().split(" ", 2);

				if (splitted.length <= 1)
					this.show("table?frame=" + splitted[0]);
				else {
					if (splitted[0] == "Frame")
						this.show("modifyFrame?frame=" + splitted[0] + "&name=" + splitted[1] + "&mode=save");
					else
						this.show("editor?frame=" + splitted[0] + "&name=" + splitted[1] + "&mode=save");
				}
			}
		});
	}
}
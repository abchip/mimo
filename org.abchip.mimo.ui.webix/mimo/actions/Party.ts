/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
import { View, ActionProvider } from "core/ui";


export class PartyActions extends ActionProvider {

    public modifyNote( view: View, frame: string, name: string ) {

        /*        var win = view.ui( EntityNoteWindow ) as EntityNoteWindow;
                win.setParam( "mode", WidgetMode.SAVE );
                win.setParam( "frame", frame );
                win.setParam( "name", name );
        
                win.showWindow();*/
    }

    public importPeople( view: View ) {

        /*        var win = view.ui( EntitiesUploadWindow ) as EntitiesUploadWindow;
                win.setParam( "upload", getBizServicePath() + "/importPeople" );
        
                win.showWindow();*/
    }

    public viewContacts( view: View, frame: string, name: string ) {
        /*        var win = view.ui( PartyContactMechWindow ) as PartyContactMechWindow;
                win.setParam( "keys", name );
                win.setParam( "filter", "" );
                win.showWindow();*/
    }

    public exportVcard( view: View, frame: string, name: string ) {
        /*        var url: string = getBizServicePath() + "/exportPartyVcard";
                // append jsessionid
                var context = KBEntities.getContext();
                if ( context != null && context.id != null )
                    url = url + ";jsessionid=" + context.id
                // append param
                url = url + "?partyId=" + name
                window.open( url );*/
    }
}

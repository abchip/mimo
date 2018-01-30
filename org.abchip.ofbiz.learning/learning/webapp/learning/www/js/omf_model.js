//
// see org.abchip.omf Java API doc
//
function org_abchip_omf_session_linker() {
		
	this.parseLink = function(id) {

	   var frame = '';
  		var name = '';
  	  	var slot = '';
  	  	var event = '';				
		var status = 'frame';
	
		for(var c=0;c<id.length;c++) {
			switch(status) {
				case 'unknown':
					if(id.charAt(c) == '.')
						status = 'slot';
					break;						
				case 'frame':
					if(id.charAt(c) == '(')
						status = 'name';
					else
						frame += id.charAt(c);
					break;
				case 'name':
					if(id.charAt(c) == ')')
						status = 'unknown';
					else
						name += id.charAt(c);
					break;
				case 'slot':
					if(id.charAt(c) == '$')
						status = 'event';
					else				
						slot += id.charAt(c);
					break;
				case 'event':
					event += id.charAt(c);
					break;
			}
		}
		return new org_abchip_omf_session_link(frame, name, slot, event);
	};

	
	this.parseLink2 = function(link_str) {
		var tokens = link_str.split(' ');
		for(var x=0; x<tokens.length; x++) {
			alert(tokens[x]);
		}
	};
} 

function org_abchip_omf_session_link(frame, name, slot, event) {	
	this.frame = frame;
	this.name = name;
	this.slot = slot;
	this.event = event;
}

function org_abchip_omf_session_domain(name) {

	var xml_objs = null;
	var request = createAjaxRequest();
   request.open("GET", './model/project.xml?rand='+Math.random(), false);
   try {  
		request.send(null);
		xml_objs = request.responseXML;
	}
	catch (oEvent) { 
		alert(oEvent);	
	}

	// lookup
	this.lookup =function lookup(name) {
		var object = null;
		var elems = xml_objs.childNodes; 
		for(var x=0;x<elems.length;x++) {
			if(elems[x].nodeType == 1 && elems[x].getAttributeNode('name').value == name) {
				object = new org_abchip_omf_model_object(elems[x]); 
				break;
			}
		}
		return object;
	};
}

function org_abchip_omf_model_object(xml) {
	var xml_obj = xml;	
	this.name = xml_obj.getAttributeNode('name').value;
	// getValue
	this.getValue = function(slot) {
		var value = null;
		var vs = new Array();
		var elems = xml_obj.childNodes;
		var v = 0;

		for(var x=0;x<elems.length;x++) {
			if(elems[x].nodeType == 1 && elems[x].nodeName == slot) {
				var values = elems[x].childNodes;
				for(var y=0;y<values.length;y++) {
					if(values[y].nodeType == 3 || values[y].nodeType == 4) {
						value = values[y].nodeValue;
						if(value.trim() != '') {
							vs[v]=value;
							v++;
							break;
						}
					}
				}
			}
		}
		return vs;
	};
	this.formatValue = function(slot) {
		var vals = this.getValue(slot);
		var str = '';
		if(vals.length == 0) 
		 return str;
		else if(vals.length > 1) {
			str = '<ul>';
			for(var x=0;x<vals.length;x++) {
				str += '<li>'+vals[x]+'</li>';
			}
			str += '</ul>';
		} else {
			str = vals[0];
		}
		return str;
	};
}
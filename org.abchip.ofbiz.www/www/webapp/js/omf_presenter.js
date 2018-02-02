var org_abchip_omf_session_linker = new org_abchip_omf_session_linker();

window.addEventListener('load', org_abchip_omf_session_init, false);     

function org_abchip_omf_session_init(e) {
	loadData(document.body);
}

function loadData(elem) {
//	   if (!e) var e = window.event;

	var links = elem.querySelectorAll('[data-omf-link]');
	var events = {};
	var en = 0;
	while(links.length != 0) {
		
		for(var x=0;x<links.length;x++) {
			var link_str = links[x].getAttribute('data-omf-link');
	 		var link = org_abchip_omf_session_linker.parseLink(link_str);
	 		
			var domain = new org_abchip_omf_session_domain(link.frame);
			var name = link.name;
		
			if(name.substr(0, 1) == '&')
				name = getParam(name.substr(1));
			var object = domain.lookup(name)

			var value = object.getValue(link.slot);
			if(value.length <2) {
				links[x].innerHTML = value;
			} else {
				for(var y=0; y<value.length; y++) {
					links[x].innerHTML += '<li>'+value[y]+'</li>';
				}			
			}
			links[x].removeAttribute('data-omf-link');			

			links[x].addEventListener('click', xalert, false);
			
			if(link.event != '') {
				events[link_str] = link.event;				
				en++;
			}				
		}
		links = elem.querySelectorAll('[data-omf-link]');
	}	
	for (var key in events) {
//		alert(key);
	}
}
function xalert(e) {
	alert(e.target.innerHTML);
}
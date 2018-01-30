
function getParam(param) {
   var search = window.location.search.substring(1);
   if(search.indexOf('&') > -1) {
      var params = search.split('&');
      for(var i = 0; i < params.length; i++) {
          var key_value = params[i].split('=');
          if(key_value[0] == param) return key_value[1];
      }
   } else {
      var params = search.split('=');
      if(params[0] == param) return params[1];
   }
   return null;
}



function load(url, params, elemId) {
	var ajaxRequest = createAjaxRequest();
   ajaxRequest.open('GET', url+'?rand='+Math.random()+'&'+params, false);

   try {  
		ajaxRequest.send(null);
	}
	catch (oEvent) { 
		alert(oEvent);	
	}
	 			
	if(elemId != null) {
		a = document.getElementById(elemId);
		a.innerHTML = ajaxRequest.responseText;	
	}
	return;
}

function createDOMParser(xml) {
	var doc = null;
	
   if (window.DOMParser) {
      var parser = new DOMParser();
      doc = parser.parseFromString(xml,'text/xml');
    }
    else {
      doc = new ActiveXObject('Microsoft.XMLDOM');
      doc.async = 'false';
      doc.loadXML(xml);
    }	
    return doc;
}

function createAjaxRequest() {
	// lista delle variabili locali
	var
	 // variabile di ritorno, nulla di default
	 XHR = null,
	 
	 // informazioni sul nome del browser
	 browserUtente = navigator.userAgent.toUpperCase();	
	
	 // browser standard con supporto nativo
	 // non importa il tipo di browser
	 if(typeof(XMLHttpRequest) === "function" || typeof(XMLHttpRequest) === "object") {

	  XHR = new XMLHttpRequest();

	 }
	 // browser Internet Explorer
	 // è necessario filtrare la versione 4
	 else if(
	  window.ActiveXObject &&
	  browserUtente.indexOf("MSIE 4") < 0
	 ) {
	 
	  // la versione 6 di IE ha un nome differente
	  // per il tipo di oggetto ActiveX
	  if(browserUtente.indexOf("MSIE 5") < 0)
	   XHR = new ActiveXObject("Msxml2.XMLHTTP");
	
	  // le versioni 5 e 5.5 invece sfruttano lo stesso nome
	  else
	   XHR = new ActiveXObject("Microsoft.XMLHTTP");
	 }
 return XHR;
}

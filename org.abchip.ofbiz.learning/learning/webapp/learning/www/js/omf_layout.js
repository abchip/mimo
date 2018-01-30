
function createTable(bor_h, bor_v, rows_perc, cols_perc, elem_id) {

	rows = rows_perc.length;
	cols = cols_perc.length;
	var table = document.getElementById(elem_id);

	// H border number
	var bh = 0;	
	for(var r=0; r+bh<rows+bh; r++) { 
		var row = table.insertRow(r+bh);
		// V border number
		var bv = 0;
		for(var c=0; c+bv<cols+bv; c++) {			 
			var cell  = row.insertCell(c+bv);
			if(rows_perc[r]>0)
				cell.height = rows_perc[r]+'%';
			if(cols_perc[c]>0)
				cell.width = cols_perc[c]+'%';

			dv = document.createElement('div');
			dv.setAttribute('id', 'cell_'+r+'-'+c);
			dv.setAttribute('class', 'block');
			cell.appendChild(dv);
					
			// 
//			cell.id = 'cell_'+r+'-'+c;
   		// V border
   		if(c+1<cols) {
   			bv++;
				cell  = row.insertCell(c+bv);
				cell.width = bor_v+'%';
				cell.className = 'table_border_V';
   		}
		}		
		
		// H border
		if(r+1<rows) {
			bh++;
			row = table.insertRow(r+bh);
			for(var c=0; c<cols+bv; c++) {						 
				cell  = row.insertCell(c);
				cell.className = 'table_border_H';
				cell.height = bor_h+'%';
				
				if(c % 2 > 0) 
					continue;					 
				cell.id = 'border_'+(r+1)+'-'+(c/2);
			}
		}
	}	
	return table;
}

function setDataLinks(links) {
	
	for (var key in links) {
		var cells = links[key];
		for(var x=0;x<cells.length;x++) {
			var cell = document.getElementById('cell_'+cells[x]);
			cell.setAttribute('data-omf-link', key);		
		}
	}      
}


function addValue(row, col, value, className) {
	var cell = document.getElementById('cell_'+row+'-'+col);
	if(cell == null) {
		alert('Cell '+ row+'-'+col+' not found');
	}
	cell.innerHTML = value;
	cell.className = className;
}
function setContentColor(row, col, content_id, class_id) {
	setContent(row, col, content_id, null, class_id);
}

function setContent(row, col, content_id, title_id, class_id) {
	var cell = document.getElementById('cell_'+row+'-'+col);
	if(cell == null) {
		alert('Cell '+ row+'-'+col+' not found');
	}
	var content = document.getElementById(content_id);
	if(content == null) {
		alert('Model '+content_id+' not found');
	}
	
	cell.innerHTML = content.innerHTML;
	if(class_id != null)
		cell.className = class_id;
	
	var cell_ret = cell;
		
	if(title_id == null)
		return cell_ret;
		
	
	cell = document.getElementById('border_'+row+'-'+col);

	if(cell == null) 
		return cell_ret;

	cell.innerHTML = title_id;
	
	return cell_ret;
}

function loadText(elem_id, text_id) { 
	from = document.getElementById(text_id);
	if(from == null) {
		alert(text_id+" not found");
		return;
	}
	to = document.getElementById(elem_id);
	if(to == null) {
		alert(elem_id+" not found");
		return;
	}	
	to.innerHTML = from.innerHTML;
	return true;
}
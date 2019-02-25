/**
 * 
 */
function init(){
	alert("a");
	var x=document.getElementsByName('btnLogin');
	x.onkeydown = function(event) {
		var e = event || window.event;
		if(e && e.keyCode == 13) { // enter 键
	            alert("b");
		}
	};
}



window.onload=init;
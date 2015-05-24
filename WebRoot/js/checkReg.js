var xmlHttp ;
var checkRes = true ;
function createXMLHttp(){
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest() ;
	} else {
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP") ;
	}
}

function checkUid(uid){
	createXMLHttp() ;
	xmlHttp.open("GET","pages/front/UserRegServletFront?uid="+uid) ;
	xmlHttp.onreadystatechange = checkUidCallback ;
	xmlHttp.send() ;
}
function checkUidCallback(){
	if(xmlHttp.readyState==4){
		if(xmlHttp.status==200){
			var res = xmlHttp.responseText ;
			//alert(res);
			if("false" == res){	// 此用户的ID已经存在了，不能注册
				
				checkRes = false ;
				document.getElementById("mid_msg").innerHTML = " <font color=\"red\">此用户ID已注册！</font>" ;
			} else {
				checkRes = true ;
				document.getElementById("mid_msg").innerHTML = " <font color=\"green\">此用户ID可以使用！</font>" ;
			}
		}
	}
}

function getCheckRes(){
	return checkRes ;
}



function validateUid() {
	return validateEmpty("user.uid") ;
}

function validatePassword() {
	return validateEmpty("user.password") ;
}

function validateCode() {
	return validateRegex("code",/^[0-9a-zA-Z]{4}$/) ;
}

function validateConf() {
	return validateCompare("user.password","conf") ;
}

function validate() {
	return validateUid() && validatePassword() && validateCode() && validateConf() ;
}

function validateLogin() {
	return validateUid() && validatePassword() && validateCode() ;
}


function validateOldpass() {
	return validateEmpty("oldpass") ;
}
function validateNewpass() {
	return validateEmpty("newpass") ;
}
function validateConfpass() {
	return validateCompare("confpass","newpass") ;
}

function validateUpdatePassword() {
	return validateOldpass() && validateNewpass() && validateConfpass() ;
}


function validateName() {
	return validateEmpty("user.name") ;
}
function validatePhone() {
	return validateEmpty("user.phone") ;
}
function validateCard() {
	return validateEmpty("user.card") ;
}
function validateAddress() {
	return validateEmpty("user.address") ;
}

function validateUpdateInfo() {
	return validateName() && validatePhone() && validateCard() 
		&& validateAddress() ;
}
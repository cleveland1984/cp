function validateAdid() {
	return validateEmpty("admin.adid") ;
}

function validatePassword() {
	return validateEmpty("admin.password") ;
}

function validateCode() {
	return validateRegex("code",/^[0-9a-zA-Z]{4}$/) ;
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

function validate() {
	return validateAdid() && validatePassword() && validateCode() ;
}
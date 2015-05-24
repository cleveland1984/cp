function validateTitle() {
	return validateEmpty("product.title") ;
}

function validatePrice() {
	return validateRegex("product.price",/^\d+(\.\d+)?$/) ;
}

function validateNote() {
	return validateEmpty("product.note") ;
}

function validate() {
	return validateTitle() && validatePrice() && validateNote() ;
}
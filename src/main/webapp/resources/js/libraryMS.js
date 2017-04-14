/**
 * Created By Developer
 */

	function formSubmit() {
		document.getElementById("logoutForm").submit();
	}
	
	function newBookFunc() {
		document.getElementById("newBookForm").reset();
		document.getElementById("newBookForm").className = "visible";
	    document.getElementById("issueBookForm").className = "hidden"
	    document.getElementById("bookIssuedForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function issueBookFunc() {
		document.getElementById("issueBookForm").reset();
		document.getElementById("newBookForm").className = "hidden";
	    document.getElementById("issueBookForm").className = "visible"
	    document.getElementById("bookIssuedForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function bookIssuedFunc() {
		document.getElementById("bookIssuedForm").reset();
		document.getElementById("newBookForm").className = "hidden";
	    document.getElementById("issueBookForm").className = "hidden"
	    document.getElementById("bookIssuedForm").className = "visible";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function returnBookFunc() {
		document.getElementById("returnBookForm").reset();
		document.getElementById("newBookForm").className = "hidden";
	    document.getElementById("issueBookForm").className = "hidden"
	    document.getElementById("bookIssuedForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "visible"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function dispDefaltersFunc() {
		document.getElementById("defaultersForm").reset();
		document.getElementById("newBookForm").className = "hidden";
	    document.getElementById("issueBookForm").className = "hidden"
	    document.getElementById("bookIssuedForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "visible"
	}
	
	/*********************************ADMIN SERVICE********************************************/
	function newCategoryFunc() {
		document.getElementById("newCategoryForm").reset();
		document.getElementById("newCategoryForm").className = "visible";
	    document.getElementById("newLocationForm").className = "hidden"
	    document.getElementById("addReaderForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function newLocationFunc() {
		document.getElementById("newLocationForm").reset();
		document.getElementById("newCategoryForm").className = "hidden";
	    document.getElementById("newLocationForm").className = "visible"
	    document.getElementById("addReaderForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function newReaderFunc() {
		document.getElementById("addReaderForm").reset();
		document.getElementById("newCategoryForm").className = "hidden";
	    document.getElementById("newLocationForm").className = "hidden"
	    document.getElementById("addReaderForm").className = "visible";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function returnBookFunc() {
		document.getElementById("returnBookForm").reset();
		document.getElementById("newBookForm").className = "hidden";
	    document.getElementById("issueBookForm").className = "hidden"
	    document.getElementById("bookIssuedForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "visible"
	    document.getElementById("defaultersForm").className = "hidden"
	}
	function dispDefaltersFunc() {
		document.getElementById("defaultersForm").reset();
		document.getElementById("newBookForm").className = "hidden";
	    document.getElementById("issueBookForm").className = "hidden"
	    document.getElementById("bookIssuedForm").className = "hidden";
	    document.getElementById("returnBookForm").className = "hidden"
	    document.getElementById("defaultersForm").className = "visible"
	}
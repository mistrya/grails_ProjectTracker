package projecttracker

class TaskController {

	def beforeInterceptor = [action:this.&auth]   //before we do anything else, call the auth() method below.  auth() method verifies if the user is login.
	
	def scaffold=true
	
	//In Grails 2.4.4, dont need explicit index method if default to index (or list in previous version) page
	
//	def index() {
//		redirect(action: "index")
//	}
	
	
	def auth() {
		if(!session.user) {
			redirect(controller:"EndUser", action:"login")
			return false
		}
	}
	
}

//copy and pasted  above code from EndUserController.groovy code on http://www.grailsexample.net/code-examples/
//This overrides any of the below methods to introduce Authorization logic after login.



/*
package projecttracker


class TaskController {
	//Dynamic Scaffolding
	//Dynamically generates all the views and controllers at runtime.  Its allows minor customization to the view via model.
	//it takes the defn of the model and turns it in to a UI.
	def scaffold = true
	
	//static scaffolding creates actual controllers and views based on our models which we can modify.
		
	
	// with dynamic scaffolding we don't need index with grails 2.4.xx. 
//    def index() { 
//		redirect (action: list)
//	}

	}
*/
package projecttracker

class ProjectController {

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

class ProjectController {
	def scaffold = true
	//Dynamic Scaffolding
	//Dynamically generates all the views and controllers at runtime.  Its allows minor customization to the view via model.


	// with dynamic scaffolding we don't need index with grails 2.4.xx. 
//    def index() { 
//		redirect (action: overdue)
//	}

	//no need parenthesis if no parameters required
//	def renderbrowser = {  //render send texts from controller to the browser.
//		//NOTE.  it is considered bad-form to add HTML tags and elements in the controller.  Instead put it in a view.
//		render "Project Tracker Video Tutorials" }

	def current = {
//		def projectName =  "Project Tracker Video Tutorials"
//		def dueDate = "08/19/2015"
		//Map below is what going to be sent to a view and variables can be accessed by key.
		//By convention create a view name "current.gsp" under the folder name for my controller listProjects
//		[project:projectName, date:dueDate]

		def allProjects = Project.list()
		[allProjects:allProjects] 
		
	}

	def overdue = { 
		render "Order Valentines Day Package" 
	}

}
*/
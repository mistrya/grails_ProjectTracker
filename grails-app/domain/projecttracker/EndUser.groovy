package projecttracker

class EndUser {

	//static scaffolding - It will allow to create a controller and view files with statically generated content as per domain.  
	//Because its static, any change we make will require to either manually update the controllers and view,
	//to avoid regenerating them and overriding any custom changes. 
	
	String userName
	String password
	String fullName

		//to have the dropdown list show something information instead of identifier field for Project Database Table correctly
	String toString () {
		"${fullName}"
	}

	
	//To see which projects are owned, or which tasks are assigned to enduser. 
	//We will point the parent (EndUser) to their children (Project and Task)
	static hasMany = [projects: Project, tasks: Task]  
	
	//allows to configure constraints for the views.  Below we are setting the order the fields should appear for Projects list and create views
    static constraints = {
		fullName()
		userName()
		password(password: true)  //for Authentication - anytime I type password, Grails will type in "."s
    }
}

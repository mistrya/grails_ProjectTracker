package projecttracker

class CopyOfEndUser {

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
		password()
    }
}

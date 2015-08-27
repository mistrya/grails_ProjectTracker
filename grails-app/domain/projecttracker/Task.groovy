package projecttracker

import java.util.Date;

class Task {
	String name
	String description
	Date dueDate

	//to have the dropdown list show something information instead of identifier field for Project Database Table correctly
	String toString () {
		"${name}"
	}

	//Set up Entity relationship with EndUser (parent) and Project (parent)
	static belongsTo = [assignee : EndUser, project : Project]
		
	//allows to configure constraints for the views.  Below we are setting the order the fields should appear for Projects list and create views
	
    static constraints = {
		name()
		description()
		dueDate()
    }
}

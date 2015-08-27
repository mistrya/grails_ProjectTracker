package projecttracker

class Project {
	//Usually the attributes/columns are assigned a data type rather than just def, it makes it easy to get and set expected data. 
	//  
	String name
	String description
	Date dueDate
	String billingType
	
	
	//to have the dropdown list show something information instead of identifier field for Project Database Table correctly
	//here we will have the name of the Project for the Project dropdown list
	String toString () {
		"${name}"
	}
	
	//Set up Entity relationship with EndUser (parent)
	static belongsTo = [owner : EndUser]
	
	//In order to be able to create tasks when editing a Project, 
	//we will point the parent (Project) back down to children (task). This gives flexibility from User Interface
	static hasMany = [tasks : Task] 
	
	
	//When we run this model it will create this model in memory on the server.  When the server stops it will destroy the data and model.
	//To persist we can configure settings in DataSource.groovy
	
	//allows to configure constraints for the views.  Below we are setting the order the fields should appear for Projects list and create views
	//constraints also allows to set validation rules
    static constraints = { 
		name(blank: false, unique: true)  //name cannot be blank and must be unique
		description()
		dueDate(min: new Date()) //Due date cannot be less than current date
		billingType(inList: ["Hourly", "Milestone","non-billable"]) //billingType can be only one of the listed values
    }
}

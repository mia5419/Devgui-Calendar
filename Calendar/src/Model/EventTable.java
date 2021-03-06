package Model;

/**
 * The TaskTable class where the attributes of a Task can be saved to an XML file.
 * (will be developed more...)
 * @author Deha
 * 
 */

public class EventTable {

	private Boolean done;
	
	private Boolean check;

	private String eventName;
	
	private String eventDueDate;
	
	private String eventCategory;
	
	private int eventPriority;
	
	private String button1;
	
	private String button2;
	
	
	
	//Zero-argument constructor for XML-management
	public EventTable() {
		super();
	}
	
	/**
	 * Initiate the EventTable
	 * @param done pending or done event element button
	 * @param check check mark for the event
	 * @param eventName the name of Event
	 * @param eventDueDate the due date of Event
	 * @param eventCategory the category of Event
	 * @param eventPriority the priority of Event
	 * @param button1 edit button
	 * @param button2 delete button
	 */
	public EventTable(Boolean done, Boolean check, String eventName,String eventDueDate, 
						String eventCategory, int eventPriority, String button1, String button2) {
		super();
		this.done = done;
		this.check = check;
		this.eventName = eventName;
		this.eventDueDate = eventDueDate;
		this.eventCategory = eventCategory;
		this.eventPriority = eventPriority;
		this.button1 = button1;
		this.button2 = button2;
	}

	/**
	 * Getter method for the check mark
	 * @return check value of the check mark
	 */
	public Boolean getCheck() {
		return check;
	}
	
	/**
	 * Setter method for the check mark
	 * @param check the check mark
	 */
	public void setCheck(Boolean check) {
		this.check = check;
	}
	
	/**
	 * Getter method for the done/pending button
	 * @return done value of the done/pending button
	 */
	public Boolean getDone() {
		return done;
	}
	
	/**
	 * Setter method for the done/overdue button
	 * @param check the done/pending button
	 */
	public void setDone(Boolean done) {
		this.done = done;
	}
	
	/**
	 * Getter method for Event name
	 * @return taskName the name of the event
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * Setter method for Event name
	 * @param taskName the name of the event
	 */
	public void setEventName(String taskName) {
		if (taskName.equals(""))  {
			taskName = " ";
		}
		this.eventName = taskName;
	}

	/**
	 * Getter method for Event due date
	 * @return taskDueDate the due date of Event
	 */
	public String getEventDueDate() {
		return eventDueDate;
	}

	/**
	 * Setter method for Event due date
	 * @param taskDueDate the due date of Event
	 */
	public void setEventDueDate(String taskDueDate) {
		if (taskDueDate.equals(""))  {
			taskDueDate = " ";
		}
		this.eventDueDate = taskDueDate;
	}

	/**
	 * Getter method for Event Category
	 * @return taskCategory the category of Event
	 */
	public String getEventCategory() {
		return eventCategory;
	}

	/**
	 * Setter method for Event category
	 * @param taskCategory the category of Event
	 */
	public void setEventCategory(String taskCategory) {
		if (taskCategory.equals(""))  {
			taskCategory = " ";
		}
		this.eventCategory = taskCategory;
	}

	/**
	 * Getter method for Event priority
	 * @return taskPriority the priority of Event
	 */
	public int getEventPriority() {
		return eventPriority;
	}

	/**
	 * Setter method for Event priority
	 * @param taskPriority the priority of Event
	 */
	public void setEventPriority(int taskPriority) {
		this.eventPriority = taskPriority;
	}
	
	/**
	 * Getter method for edit button
	 * @param button1 the edit button
	 */
	public String getbutton1() {
		return button1;
	}

	/**
	 * Setter method for edit button
	 * @param button1 the edit button
	 */	
	public void setbutton1(String button1) {
		this.button1 = button1;
	}
	
	/**
	 * Getter method for delete button
	 * @param button1 the delete button
	 */
	public String getbutton2() {
		return button2;
	}

	/**
	 * Setter method for delete button
	 * @param button1 the delete button
	 */
	public void setbutton2(String button2) {
		this.button2 = button2;
	}	
	
	
}

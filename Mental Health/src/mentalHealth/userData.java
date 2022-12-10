package mentalHealth;

/**
 * userData is an object used for storing data for a specified day of the year.
 * 
 * 
 * @author clayk
 * @version 1
 */

public class userData {
	
	/**
	 * The day of the month.
	 */
	private int day;
	
	/**
	 * Comments for the day.
	 */
	private String notes;
	
	/**
	 * How the user rates the day from 1-10.
	 */
	private int rating;
	
	/**
	 * The month of the year.
	 */
	
	private int month;
	
	/**
	 * The date as passed by the GUI. 
	 */
	
	private String localdate;
	
	/**
	 * userData constructs a new userData object.
	 * 
	 * @param rating The rating the user gives to the day which is a value ranging from 1-10.
	 * @param notes The notes are specific things that the user has about a given day.
	 * @param day A number 0-30 which defines the day of the month.
	 * @param month A number 0-11 which defines the month of the year.
	 * @param localdate A string containing the day, month, and year.
	 */
	
	public userData(int rating,String notes, int day, int month, String localdate) {	//Constructor for Data Entries
		super();
		this.day = day;
		this.notes = notes;
		this.rating = rating;
		this.month = month;
		this.localdate = localdate;
	}
	
	/**
	 * Returns the day.
	 * @return
	 */
	public int getDay() { //Getters and Setters
		return day;
	}
	
	/**
	 * Sets the day. 
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * Returns the month
	 * @return
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * Sets the month.
	 * @param month
	 */

	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Returns the local date.
	 * @return
	 */
	
	public String getLocaldate() {
		return localdate;
	}

	/**
	 * Sets the local date.
	 * @param localdate
	 */
	
	public void setLocaldate(String localdate) {
		this.localdate = localdate;
	}

	/**
	 * Returns the notes.
	 * @return
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * Sets the notes.
	 * @param notes
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/**
	 * Returns the rating.
	 * @return
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Sets the rating.
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}

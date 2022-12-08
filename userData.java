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
	 * The day of the year.
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
	
	private int month;
	
	private String localdate;
	
	/**
	 * userData constructs a new userData object.
	 * 
	 * @param rating The rating the user gives to the day which is a value ranging from 1-10.
	 * @param notes The notes are specific things that the user has about a given day.
	 * @param day Currently a number 0-364 which defines the date.
	 */
	
	public userData(int rating,String notes, int day, int month, String localdate) {	//Constructor for Data Entries
		super();
		this.day = day;
		this.notes = notes;
		this.rating = rating;
	}
	
	/**
	 * Returns the date.
	 * @return
	 */
	public int getDay() { //Getters and Setters
		return day;
	}
	
	/**
	 * Sets the date. 
	 * @param date
	 */
	public void setDay(int date) {
		this.day = date;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getLocaldate() {
		return localdate;
	}

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

package mentalHealth;

public class userData {
	
	private String date;	//Variable Declaration
	private String notes;
	private int rating;
	
	public userData(int rating,String notes, String date) {	//Constructor for Data Entries
		super();
		this.date = date;
		this.notes = notes;
		this.rating = rating;
	}

	public String getDate() { //Getters and Setters
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}

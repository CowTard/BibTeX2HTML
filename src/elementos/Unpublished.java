package elementos;

public class Unpublished extends Entry {
	
	private String author, title, note, month, year, key;
	
	public Unpublished(String reference, String author, String title, String note, String month, String year, String key){
		super(reference);
		this.author = author;
		this.title = title;
		this.note = note;
	}
	
	public String toString(){
		String result = "";
		
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nNote: " + note;
		if (month != null) result += "\nMonth: " + month;
		if (year != null) result += "\nYear: " + year;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
	
	

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setKey(String key) {
		this.key = key;
	}


}

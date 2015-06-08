package elementos;

public class Unpublished extends Entry {
	
	private String author, title, note, month, year, key;
	
	public Unpublished(){
		super();
	}
	
	public boolean isValid() {
		if (author != null && title != null && note != null) return true;
		else return false;
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

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNote(String note) {
		this.note = note;
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

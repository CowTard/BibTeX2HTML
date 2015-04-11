package elementos;

public class Unpublished extends Entry {
	
	private String author, title, note, month, year, key;
	
	public Unpublished(String reference, String author, String title, String note, String month, String year, String key){
		super(reference);
		this.author = author;
		this.title = title;
		this.note = note;
		this.month = month;
		this.note = note;
		this.key = key;
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
}

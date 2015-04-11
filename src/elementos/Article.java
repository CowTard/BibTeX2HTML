package elementos;

public class Article extends Entry {
	private String author, title, journal, year, volume, number, pages, month, note, key;
	
	public Article(String reference, String author, String title, String journal, String year, String volume, String number, String pages, String month, String note, String key) {
		super(reference);
		this.author = author;
		this.title = title;
		this.journal = journal;
		this.year = year;
		this.volume = volume;
		this.number = number;
		this.pages = pages;
		this.month = month;
		this.note = note;
		this.key = key;
	}
	
	public String toString(){
		String result = "";
		
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nJournal: " + journal;
		result += "\nYear: " + year;
		result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number;
		if (pages != null) result += "\nPages: " + pages;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}


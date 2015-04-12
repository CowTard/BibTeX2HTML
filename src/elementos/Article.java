package elementos;

public class Article extends Entry {
	private String author, title, journal, year, volume, number, pages, month, note, key;

	public Article(String reference, String author, String title, String journal, String year, String volume) {
		super(reference);
		this.author = author;
		this.title = title;
		this.journal = journal;
		this.year = year;
		this.volume = volume;
	}
	
	public void setNumber(String number){
		this.number = number;
	}
	
	public void setPages(String pages){
		this.pages = pages;
	}
	
	public void setMonth(String month){
		this.month = month;
	}
	
	public void setNote(String note){
		this.note = note;
	}
	
	public void setKey(String key){
		this.key = key;
	}

	public String toString(){
		String result = "";

		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nJournal: " + journal;
		result += "\nYear: " + year;
		result += "\nVolume: " + volume;
		if (!number.equals("null")) result += "\nNumber: " + number;
		if (!pages.equals("null")) result += "\nPages: " + pages;
		if (!month.equals("null")) result += "\nMonth: " + month;
		if (!note.equals("null")) result += "\nNote: " + note;
		if (!key.equals("null")) result += "\nKey: " + key;

		return result + "\n\n";
	}
}


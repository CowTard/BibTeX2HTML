package elementos;

public class Article extends Entry {
	String author, title, journal, year, volume, number, pages, month, note, key;
	
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
}


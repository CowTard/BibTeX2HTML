package elementos;

public class Article extends Entry {
	String author, title, journal, year, volume, number, pages, month, note, key;
	
	Article(String author, String title, String journal, String year, String volume, String number, String pages, String month, String note, String key) {
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


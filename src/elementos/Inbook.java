package elementos;

public class Inbook extends Entry {
	String author;
	String editor;
	String title;
	String chapter;
	String pages;
	String publisher;
	String year;
	String volume;
	String number;
	String series;
	String type;
	String address;
	String edition;
	String month;
	String note;
	String key;
	
	public Inbook(String reference, String author, String editor, String title, String chapter, String pages, String publisher, String year, String volume, 
			String number, String series, String type, String address, String edition, String month, String note, String key){
		super(reference);
		this.author = author;
		this.editor = editor;
		this.title = title;
		this.chapter = chapter;
		this.pages = pages;
		this.publisher = publisher;
		this.year = year;
		this.volume = volume;
		this.number = number;
		this.series = series;
		this.type = type;
		this.address = address;
		this.edition = edition;
		this.month = month;
		this.note = note;
		this.key = key;
	}
	
}

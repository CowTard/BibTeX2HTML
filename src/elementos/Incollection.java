package elementos;

public class Incollection extends Entry {

	private String author;
	private String title;
	private String booktitle;
	private String publisher;
	private String year;
	private String editor;
	private String volume;
	private String number;
	private String series;
	private String type;
	private String chapter;
	private String pages;
	private String address;
	private String edition;
	private String month;
	private String note;
	private String key;
	
	
	public Incollection(String reference, String author, String title, String booktitle, String publisher, String year, String editor, String volume, 
			String number, String series, String type, String chapter, String pages, String address, String edition, String month,
			String note, String key) {
		super(reference);
		this.author = author;
		this.title = title;
		this.booktitle = booktitle;
		this.publisher = publisher;
		this.year = year;
		this.editor = editor;
		this.volume = volume;
		this.number = number;
		this.series = series;
		this.type = type;
		this.chapter = chapter;
		this.pages = pages;
		this.address = address;
		this.edition = edition;
		this.month = month;
		this.note = note;
		this.key = key;
	}
}

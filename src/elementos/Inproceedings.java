package elementos;

public class Inproceedings extends Entry {
	private String author;
	private String title;
	private String booktitle;
	private String year;
	private String editor;
	private String volume;
	private String number;
	private String series;
	private String pages;
	private String address;
	private String month;
	private String organization;
	private String publisher;
	private String note;
	private String key;
	
	public Inproceedings(String reference, String author, String title, String booktitle, String year, String volume, String number, String series,
			String pages, String address, String month, String organization, String publisher, String note, String key){
		super(reference);
		this.author = author;
		this.title = title;
		this.booktitle = booktitle;
		this.year = year;
		this.volume = volume;
		this.number = number;
		this.pages = pages;
		this.address = address;
		this.month = month;
		this.organization = organization;
		this.publisher = publisher;
		this.note = note;
		this.key = key;
	}
}

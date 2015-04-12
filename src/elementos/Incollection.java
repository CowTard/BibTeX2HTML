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

	public String toString(){
		String result = "";
		
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nBooktitle: " + booktitle;
		result += "\nPublisher: " + publisher;
		result += "\nYear: " + year;
		if (editor != null) result += "Editor: " + editor;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number; //ou só else
		if (series != null) result += "\nSeries: " + series;
		if (type != null) result += "\nType: " + type;
		if (chapter != null) result += "\nChapter: " + chapter;
		if (pages != null) result += "\nPages: " + pages;
		if (address != null) result += "\nAddress: " + address;
		if (edition != null) result += "\nEdition: " + edition;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}

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

	public String toString(){
		String result = "";
		
		if (author != null) result += "Author: " + author;
		if (editor != null) result += "Editor: " + editor; //ou só else
		result += "\nTitle: " + title;
		if (chapter != null) result += "\nChapter: " + chapter;
		if (pages != null) result += "\nPages: " + pages; //ou só else
		result += "\nPublisher: " + publisher;
		result += "\nYear: " + year;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number; //ou só else
		if (series != null) result += "\nSeries: " + series;
		if (type != null) result += "\nType: " + type;
		if (address != null) result += "\nAddress: " + address;
		if (edition != null) result += "\nEdition: " + edition;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
	
}

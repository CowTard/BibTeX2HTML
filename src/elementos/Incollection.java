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
	
	
	public Incollection(String reference, String author, String title, String booktitle, String publisher, String year) {
		super(reference);
		this.author = author;
		this.title = title;
		this.booktitle = booktitle;
		this.publisher = publisher;
		this.year = year;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public void setSeries(String series) {
		this.series = series;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setChapter(String chapter) {
		this.chapter = chapter;
	}


	public void setPages(String pages) {
		this.pages = pages;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setEdition(String edition) {
		this.edition = edition;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public void setKey(String key) {
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

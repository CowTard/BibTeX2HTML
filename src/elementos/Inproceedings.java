package elementos;

public class Inproceedings extends Entry {
	private String author, title, booktitle, year, editor, volume, number, series, pages, address, month, organization, publisher, note, key;

	public Inproceedings(String reference, String author, String title, String booktitle, String year) {
		super(reference);
		this.author = author;
		this.title = title;
		this.booktitle = booktitle;
		this.year = year;
		this.editor = null;
		this.volume = null;
		this.number = null;
		this.series = null;
		this.pages = null;
		this.address = null;
		this.month = null;
		this.organization = null;
		this.publisher = null;
		this.note = null;
		this.key = null;
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
	
	public void setPages(String pages) {
		this.pages = pages;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
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
		result += "\nYear: " + year;
		if (editor != null) result += "Editor: " + editor;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number;
		if (series != null) result += "\nSeries: " + series;
		if (pages != null) result += "\nPages: " + pages;
		if (address != null) result += "\nAddress: " + address;
		if (month != null) result += "\nMonth: " + month;
		if (organization != null) result += "\nOrganization: " + organization;
		if (publisher != null) result += "\nPublisher: " + publisher;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}

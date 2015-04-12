package elementos;

public class Conference extends Entry {
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

	public Conference(String reference, String author, String title, String booktitle, String year, String volume, String number, String series,
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

	public String toString(){
		String result = "";
		
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nBooktitle: " + booktitle;
		result += "\nYear: " + year;
		if (editor != null) result += "Editor: " + editor;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number; //ou só else
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

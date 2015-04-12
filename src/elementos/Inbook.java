package elementos;

public class Inbook extends Entry {
	private String author;
	private String editor;
	private String title;
	private String chapter;
	private String pages;
	private String publisher;
	private String year;
	private String volume;
	private String number;
	private String series;
	private String type;
	private String address;
	private String edition;
	private String month;
	private String note;
	private String key;
	
	public Inbook(String reference, String type, String authorEditor, String title, String type1, String chapterPages, String publisher, String year){
		super(reference);
		if (type.equals("author"))
			author = authorEditor;
		else if (type.equals("editor"))
			this.editor = authorEditor;
		this.title = title;
		if (type1.equals("chapter"))
			this.chapter = chapterPages;
		else if (type1.equals("pages"))
			this.pages = chapterPages;
		this.publisher = publisher;
		this.year = year;
	}

	public void setYear(String year) {
		this.year = year;
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

	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	public void setAddress(String address){
		this.address = address;
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

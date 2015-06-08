package elementos;

public class Incollection extends Entry {
	private String author, title, booktitle, publisher, year, editor, volume, number, series, type, chapter, pages, address, edition, month, note, key;
	
	public Incollection() {
		super();
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public void setYear(String year) {
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
	
	public boolean isValid() {
		if (author != null && title != null && booktitle != null && publisher != null && year != null) return true;
		else return false;
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
		if (number != null) result += "\nNumber: " + number;
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

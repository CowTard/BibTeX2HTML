package elementos;

public class Incollection extends Entry {
	private String author, title, booktitle, publisher, year, editor, volume, number, series, type, chapter, pages, address, edition, month, note, key;
	
	public Incollection() {
		super();
	}
	
	public boolean addattribute(String attr, String value) {
		boolean aRetornar = false;
		switch(attr) {
		case "author":
			setAuthor(value);
			aRetornar = true;
			break;
		case "title":
			setTitle(value);
			aRetornar = true;
			break;
		case "booktitle":
			setBooktitle(value);
			aRetornar = true;
			break;
		case "publisher":
			setPublisher(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
			aRetornar = true;
			break;
		case "editor":
			setEditor(value);
			aRetornar = true;
			break;
		case "volume":
			setVolume(value);
			aRetornar = true;
			break;
		case "number":
			setNumber(value);
			aRetornar = true;
			break;
		case "series":
			setSeries(value);
			aRetornar = true;
			break;
		case "type":
			setType(value);
			aRetornar = true;
			break;
		case "chapter":
			setChapter(value);
			aRetornar = true;
			break;
		case "pages":
			setPages(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "edition":
			setEdition(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
			aRetornar = true;
			break;
		case "note":
			setNote(value);
			aRetornar = true;
			break;
		case "key":
			setKey(value);
			aRetornar = true;
			break;
		default: break;
		}
		return aRetornar;
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
	
	public String isValid() {
		String aRetornar = "";
		if (author == null) aRetornar +="author|editor-";
		if (title == null) aRetornar +="title-";
		if (booktitle == null)  aRetornar +="title-"; 
		if (publisher == null) aRetornar +="publisher-"; 
		if ( year == null) aRetornar +="year-"; 
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}

	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		
		
		
		contents += " " + author + ".";
		contents += " " + title + ".";
		if (editor != null) contents += " In " + editor + ", editor,";
		contents += " " + booktitle + ",";
		if (volume != null && series != null) contents += " volume " + volume + " of " + series + ",";
		else if (number != null && series != null) contents += " number " + number + " of " + series + ",";
		if (chapter != null) contents += " chapter " + chapter + ",";
		if (pages != null) contents += " pages " + pages + ".";
		contents += " " + publisher + ",";
		if (address != null) contents += " " + address + ",";
		if (edition != null) contents += " " + edition + " edition,";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		//type
		
		return contents;
		
	}
}

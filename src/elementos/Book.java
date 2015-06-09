package elementos;

public class Book extends Entry {
	String author, editor, title, publisher, year, volume, number, series, address, edition, month, note, key, crossref;
	
	public Book() {
		super();
	}
	
	public boolean addattribute(String attr, String value) {
		boolean aRetornar = false;
		switch(attr) {
		case "author":
			setAuthor(value);
			aRetornar = true;
			break;
		case "editor":
			setEditor(value);
			aRetornar = true;
			break;
		case "title":
			setTitle(value);
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
		case "crossref":
			setCrossRef(value);
			aRetornar = true;
			break;
		default: break;
		}
		return aRetornar;
	}

	private void setCrossRef(String value) {
		this.crossref = value;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
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
		if (author == null && editor == null) aRetornar +="author|editor-";
		if (title == null) aRetornar +="title-";
		if(publisher == null) aRetornar +="publisher-";
		if(year == null) aRetornar +="year-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}

	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else if (author != null && year != null) contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		else if (editor != null && year != null) contents += "[" + editor.substring(0, 3) + year.substring(2, 4) + "]";
		else contents += "[book]";
		
		if (author != null) contents += " " + author + ".";
		if (editor != null) contents += " " + editor + ".";
		contents += " <i>" + title + "</i>,";
		if (volume != null && number != null)contents += " volume " + volume + " of " + number + ".";
		contents += " " +  publisher + ",";
		if (address != null) contents += " " + address + " ";
		if (edition != null) contents += " " + edition + " edition,";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
	
}

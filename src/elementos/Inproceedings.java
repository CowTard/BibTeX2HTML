package elementos;

public class Inproceedings extends Entry {
	private String author, title, booktitle, year, editor, volume, number, series, pages, address, month, organization, publisher, note, crossref;

	public Inproceedings() {
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
		case "pages":
			setPages(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
			aRetornar = true;
			break;
		case "organization":
			setOrganization(value);
			aRetornar = true;
			break;
		case "publisher":
			setPublisher(value);
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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
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

	public void setPages(String pages){
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

	public String isValid() {
		String aRetornar = "";
		if (author == null) aRetornar+= "author-";
		if (title == null) aRetornar+= "title-";
		if (booktitle == null) aRetornar+= "booktitle-";
		if (year == null) aRetornar+= "year-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}

	@Override
	public String[] printContents() {
		String[] contents = new String[3];
		contents[0] = "";
		contents[1] = "";
		contents[2] = "";
		if (key != null) contents[0] += "[" + key.substring(1, key.length()-1) + "]";
		else contents[0] += "[" + author.substring(1, 3) + year.substring(2, 4) + "]";
		contents[2] = contents[0];
		contents[0] += " " + author.substring(1, author.length()-1) + ".";
		contents[0] += " " + title.substring(1, title.length()-1) + ".";
		if (editor != null) contents[0] += " In " + editor.substring(1, editor.length()-1) + ", editor,";
		contents[0] += " <i>" + booktitle.substring(1, booktitle.length()-1) + "</i>,";
		if (volume != null && series != null) contents[0] += " volume " + volume.substring(1, volume.length()-1) + " of " + series + ",";
		else if (number != null && series != null) contents[0] += " number " + number.substring(1, number.length()-1) + " of " + series.substring(1, series.length()-1) + ",";
		if (pages != null) contents[0] += " pages " + pages.substring(1, pages.length()-1) + ",";
		if (address != null) contents[0] += " " + address.substring(1, address.length()-1) + ",";
		if (month != null) contents[0] += " " + month.substring(1, month.length()-1);
		contents[0] += " " + year.substring(1, year.length()-1) + ".";
		if (organization != null) contents[0] += " " + organization.substring(1, organization.length()-1) + ",";
		if (publisher != null) contents[0] += " " + publisher.substring(1, publisher.length()-1) + ".";
		if (note != null) contents[0] += " " + note.substring(1, note.length()-1) + ".";
		
		contents[1] = this.crossref;
		return contents;
	}
}

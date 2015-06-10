package elementos;

public class Article extends Entry {
	private String author, title, journal, year, volume, number, pages, month, note, crossref;

	public Article() {
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
		case "journal":
			setJournal(value);
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
		case "pages":
			setPages(value);
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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setJournal(String journal) {
		this.journal = journal;
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

	public void setPages(String pages){
		this.pages = pages;
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
		if (author == null) aRetornar +="author-";
		if (title == null) aRetornar +="title-";
		if(journal == null) aRetornar +="journal-";
		if(year == null) aRetornar +="year-";
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
		contents[0] += " <i>" + journal.substring(1, journal.length()-1) + "</i>,";
		if (volume != null) contents[0] += " " + volume.substring(1, volume.length()-1);
		if (number != null) contents[0] += "(" + number.substring(1, number.length()-1) + ")";
		if (pages != null) contents[0] += ":" + pages.substring(1, pages.length()-1) + ",";
		if (month != null) contents[0] += " " + month.substring(1, month.length()-1);
		contents[0] += " " + year.substring(1, year.length()-1) + ".";
		if (note != null) contents[0] += " " + note.substring(1, note.length()-1) + ".";
		
		contents[1] = this.crossref;
		return contents;
	}
}

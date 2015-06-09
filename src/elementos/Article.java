package elementos;

public class Article extends Entry {
	private String author, title, journal, year, volume, number, pages, month, note, key;

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


	public void setPages(String pages) {
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
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		
		contents += " " + author + ".";
		contents += " " + title + ".";
		contents += " <i>" + journal + "</i>,";
		if (volume != null) contents += " " + volume;
		if (number != null) contents += "(" + number + ")";
		if (pages != null) contents += ":" + pages + ",";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
}


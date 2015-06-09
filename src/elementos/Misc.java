package elementos;

public class Misc extends Entry {
	private String author, title, howpublished, month, year, note, key;
	
	public Misc(){
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
		case "howpublished":
			setHowpublished(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
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

	public void setHowpublished(String howpublished) {
		this.howpublished = howpublished;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String isValid() {
		return "";
	}

	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else if (author != null && year != null) contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		else contents += "[misc]";
		
		if (author != null) contents += " " + author + ".";
		if (title != null) contents += " " + title + ".";
		if (howpublished != null) contents += " " + howpublished + ",";
		if (month != null) contents += " " + month;
		if (year != null) contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
}

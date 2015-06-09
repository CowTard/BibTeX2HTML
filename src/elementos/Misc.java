package elementos;

public class Misc extends Entry {
	private String author, title, howpublished, month, year, note, key, crossref;
	
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
		
		if (key != null) contents += "[" + key.substring(1, key.length()-1) + "]";
		else if (author != null && year != null) contents += "[" + author.substring(1, 3) + year.substring(2, 4) + "]";
		else contents += "[misc]";
		
		if (author != null) contents += " " + author.substring(1, note.length()-1) + ".";
		if (title != null) contents += " " + title.substring(1, title.length()-1) + ".";
		if (howpublished != null) contents += " " + howpublished.substring(1, howpublished.length()-1) + ",";
		if (month != null) contents += " " + month.substring(1, month.length()-1);
		if (year != null) contents += " " + year.substring(1, year.length()-1) + ".";
		if (note != null) contents += " " + note.substring(1, note.length()-1) + ".";
		
		return contents;
	}
}

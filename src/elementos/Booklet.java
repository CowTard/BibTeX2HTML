package elementos;

public class Booklet extends Entry {
	private String title, author, howpublished, address, month, year, note, key, crossref;
	
	public Booklet(){
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
		case "year":
			setYear(value);
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

	public void setTitle(String title) {
		this.title = title;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setHowpublished(String howpublished) {
		this.howpublished = howpublished;
	}


	public void setAddress(String address) {
		this.address = address;
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
		String aRetornar = "";
		if (title == null) aRetornar = "title";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else if (author != null && year != null) contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		else contents += "[booklet]";
		if (author != null) contents += " " + author + ".";
		contents += " " + title + ".";
		if (howpublished != null) contents += " " + howpublished + ",";
		if (address != null) contents += " " + address + ",";
		if (month != null) contents += " " + month;
		if (year != null) contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
	
}

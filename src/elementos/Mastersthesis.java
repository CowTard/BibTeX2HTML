package elementos;

public class Mastersthesis extends Entry {
	private String crossref, author, title, school, year, address, month, note;
	
	public Mastersthesis() {
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
		case "school":
			setSchool(value);
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

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setAddress(String address) {
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
	
	public String isValid() {
		String aRetornar = "";
		if (author == null) aRetornar += "author-";
		if (title == null) aRetornar += "title-";
		if (school == null) aRetornar += "school-";
		if (year == null) aRetornar += "year-";
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
		contents[0] += " Master's thesis, " + school.substring(1, school.length()-1) + ",";
		if (address != null) contents[0] += " " + address.substring(1, address.length()-1) + ",";
		if (month != null) contents[0] += " " + month.substring(1, month.length()-1);
		contents[0] += " " + year.substring(1, year.length()-1) + ".";
		if (note != null) contents[0] += " " + note.substring(1, note.length()-1) + ".";
				
		contents[1] = this.crossref;
		return contents;
	}
}

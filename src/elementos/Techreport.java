package elementos;

public class Techreport extends Entry {
	private String author, title, institution, year, number, address, month, note, crossref;
	
	public Techreport(){
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
		case "institution":
			setInstitution(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
			aRetornar = true;
			break;
		case "number":
			setNumber(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "month":
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

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setNumber(String number) {
		this.number = number;
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
		if (author == null) aRetornar +="author-";
		if (title == null) aRetornar +="title-";
		if (institution == null) aRetornar +="institution-";
		if (year == null) aRetornar +="year-";
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
		if (number != null) contents[0] += " Technical Report " + number.substring(1, number.length()-1) + ",";
		contents[0] += " " + institution.substring(1, institution.length()-1) + ",";
		if (address != null) contents[0] += " " + address.substring(1, address.length()-1) + ",";
		if (month != null) contents[0] += " " + month.substring(1, month.length()-1);
		contents[0] += " " + year.substring(1, year.length()-1) + ".";
		if (contents[0] != null) contents[0] += " " + note.substring(1, note.length()-1) + ".";
		
		contents[1] = this.crossref;
		return contents;
	}
}

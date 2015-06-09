package elementos;

public class Manual extends Entry {
	private String author, title, organization, address, edition, month, year, note, key, crossref;
	
	public Manual(){
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
		case "organization":
			setOrganization(value);
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
		this.crossref = crossref;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
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
		if (title == null) aRetornar +="title-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}

	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key.substring(1, key.length()-1) + "]";
		else if (author != null && year != null) contents += "[" + author.substring(1, 3) + year.substring(2, 4) + "]";
		else contents += "[manual]";
			
		if (author != null) contents += " " + author.substring(1, author.length()-1) + ".";
		contents += " <i>" + title.substring(1, title.length()-1) + "</i>.";
		if (organization != null) contents += " " + organization.substring(1, organization.length()-1) + ",";
		if (address != null) contents += " " + address.substring(1, address.length()-1) + ",";
		if (edition != null) contents += " " + edition.substring(1, edition.length()-1) + " edition,";
		if (month != null) contents += " " + month.substring(1, month.length()-1);
		if (year != null) contents += " " + year.substring(1, year.length()-1) + ".";
		if (note != null) contents += " " + note.substring(1, note.length()-1) + ".";
				
		return contents;
	}
}

package elementos;

public class Techreport extends Entry {
	
	private String author, title, institution, year, type, number, address, month, note, key;
	
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
		case "type":
			setType(value);
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



	public void setInstitution(String institution) {
		this.institution = institution;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public void setType(String type) {
		this.type = type;
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

	public String toString() {
		String result = "";
		
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nInstitution: " + institution;
		result += "\nYear: " + year;
		if (type != null) result += "\nType: " + type;
		if (number != null) result += "\nNumber: " + number;
		if (address != null) result += "\nAddress: " + number;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}	
}

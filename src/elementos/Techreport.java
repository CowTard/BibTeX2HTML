package elementos;

public class Techreport extends Entry {
	
	private String author, title, institution, year, type, number, address, month, note, key;
	
	public Techreport(){
		super();
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

	public boolean isValid() {
		if (author != null && title != null && institution != null && year != null) return true;
		else return false;
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

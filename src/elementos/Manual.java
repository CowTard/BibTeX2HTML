package elementos;

public class Manual extends Entry {
	private String title, author, organization, address, edition, month, year, note, key;
	
	public Manual(){
		super();
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
	
	public boolean isValid() {
		if (title != null) return true;
		else return false;
	}


	public String toString(){
		String result = "";
	
		result += "Title: " + title;
		if (author != null) result += "\nAuthor: " + author;
		if (organization != null) result += "\nOrganization: " + organization;
		if (address != null) result += "\nAddress: " + address;
		if (edition != null) result += "\nEdition: " + edition;
		if (month != null) result += "\nMonth: " + month;
		if (year != null) result += "\nYear: " + year;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}

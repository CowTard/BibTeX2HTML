package elementos;

public class Manual extends Entry {
	private String title, author, organization, address, edition, month, year, note, key;
	
	public Manual(String reference, String title, String author, String organization, String address, String edition,String month, String year, String note, String key){
		super(reference);
		this.title = title;
		this.author = author;
		this.organization = organization;
		this.address = address;
		this.edition = edition;
		this.month = month;
		this.year = year;
		this.note = note;
		this.key = key;
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

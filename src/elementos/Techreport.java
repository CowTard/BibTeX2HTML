package elementos;

public class Techreport extends Entry {
	
	private String author, title, institution, year, type, number, address, month, note, key;
	
	public Techreport(String reference, String author, String title, String institution, String year, String type, String number, String address, String month, String note, String key){
		super(reference);
		this.author = author;
		this.title = title;
		this.institution = institution;
		this.year = year;
		this.type = type;
		this.number = number;
		this.address = address;
		this.month = month;
		this.note = note;
		this.key = key;
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

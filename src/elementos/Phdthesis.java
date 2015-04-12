package elementos;

public class Phdthesis extends Entry {
	private String author, title, school, year, type, address, month, note, key;
	
	public Phdthesis(String reference, String author, String title, String school, String year, String type, String address, String month, String note, String key) {
		super(reference);
		this.author = author;
		this.title = title;
		this.school = school;
		this.year = year;
		this.type = type;
		this.address = address;
		this.month = month;
		this.note = note;
		this.key = key;
	}

	public String toString(){
		String result = "";
	
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nSchool: " + school;
		result += "\nYear: " + year;
		if (type != null) result += "\nType: " + type;
		if (address != null) result += "\nAddress: " + address;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}

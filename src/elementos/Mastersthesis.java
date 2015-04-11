package elementos;

public class Mastersthesis extends Entry {
	private String author, title, school, year, type, address, month, note, key;
	
	public Mastersthesis(String reference, String author, String title, String school, String year, String type, String address, String month, String note, String key) {
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
}

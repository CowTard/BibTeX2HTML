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
}

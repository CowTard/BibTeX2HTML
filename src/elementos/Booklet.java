package elementos;

public class Booklet extends Entry {
	private String title, author, howpublished, address, month, year, note, key;
	
	public Booklet(String reference, String title, String author, String howpublished, String address, String month, String year, String note, String key){
		super(reference);
		this.title = title;
		this.author = author;
		this.howpublished = howpublished;
		this.address = address;
		this.month = month;
		this.year = year;
		this.note = note;
		this.key = key;
	}
}

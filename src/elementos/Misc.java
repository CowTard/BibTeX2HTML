package elementos;

public class Misc extends Entry {
	private String none, author, title, howpublished, month, year, note, key;
	
	public Misc(String reference, String none, String author, String title, String howpublished, String month, String year, String note, String key){
		super(reference);
		this.none = none;
		this.author = author;
		this.title = title;
		this.howpublished = howpublished;
		this.month = month;
		this.year = year;
		this.note = note;
		this.key = key;
	}
}

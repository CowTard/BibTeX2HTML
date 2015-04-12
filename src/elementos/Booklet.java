package elementos;

public class Booklet extends Entry {
	private String title, author, howpublished, address, month, year, note, key;
	
	public Booklet(String reference, String title){
		super(reference);
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setHowPublished(String howpublished){
		this.howpublished = howpublished;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setMonth(String month){
		this.month = month;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
	public void setNote(String note){
		this.note = note;
	}
	
	public void setKey(String key){
		this.key = key;
	}

	public String toString(){
		String result = "";
		

		result += "Title: " + title;
		if (author != null) result += "\nAuthor: " + author;
		if (howpublished != null) result += "\nHowpublished: " + howpublished;
		if (address != null) result += "\nAddress: " + address;
		if (month != null) result += "\nMonth: " + month;
		if (year != null) result += "\nYear: " + year;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}

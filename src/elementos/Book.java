package elementos;

public class Book extends Entry {
	String author, editor, title, publisher, year, volume, number, series, address, edition, month, note, key;
	
	public Book(String reference, String type, String authorEditor, String title, String publisher, String year) {
		super(reference);
		if (type.equals("author"))
			author = authorEditor;
		else if (type.equals("editor"))
			this.editor = authorEditor;
		else throw new IllegalArgumentException();
		
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	public void setVolume(String volume){
		this.volume = volume;
	}
	
	public void setNumber(String number){
		this.number = number;
	}
	
	public void setSeries(String series){
		this.series = series;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setEdition(String edition){
		this.edition = edition;
	}
	
	public void setMonth(String month){
		this.month = month;
	}
	
	public void setNote(String note){
		this.note = note;
	}
	
	public void setKey(String key){
		this.key = key;
	}

	public String toString(){
		String result = "";
		
		if (author != null) result += "Author: " + author;
		if (editor != null) result += "Editor: " + editor; //ou só else
		result += "\nTitle: " + title;
		result += "\nPublisher: " + publisher;
		result += "\nYear: " + year;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number; //ou só else
		if (series != null) result += "\nSeries: " + series;
		if (address != null) result += "\nAddress: " + address;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
}

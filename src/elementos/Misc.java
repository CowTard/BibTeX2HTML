package elementos;

public class Misc extends Entry {
	private String author, title, howpublished, month, year, note, key;
	
	public Misc(){
		super();
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void setHowpublished(String howpublished) {
		this.howpublished = howpublished;
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
		return true;
	}


	public String toString(){
		String result = "";
		
		if (author != null) result += "\nAuthor: " + author;
		if (title != null) result += "\nTitle: " + title;
		if (howpublished != null) result += "\nHowpublished: " + howpublished;
		if (month != null) result += "\nMonth: " + month;
		if (year != null) result += "\nYear: " + year;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else if (author != null && year != null) contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		else contents += "[misc]";
		
		if (author != null) contents += " " + author + ".";
		if (title != null) contents += " " + title + ".";
		if (howpublished != null) contents += " " + howpublished + ",";
		if (month != null) contents += " " + month;
		if (year != null) contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
}


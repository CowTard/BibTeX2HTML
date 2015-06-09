package elementos;

public class Unpublished extends Entry {
	private String author, title, note, month, year, key;
	
	public Unpublished(){
		super();
	}
	
	public boolean isValid() {
		if (author != null && title != null && note != null) return true;
		else return false;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else if (year != null) contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		else contents += "[unpublished]";
		
		contents += " " + author + ".";
		contents += " " + title + ".";
		contents += " " + note + ",";
		if (month != null) contents += " " + month;
		if (year != null) contents += " " + year + ".";
		
		return contents;
	}
}

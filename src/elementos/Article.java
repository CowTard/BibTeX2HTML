package elementos;

public class Article extends Entry {
	private String author, title, journal, year, volume, number, pages, month, note, key;

	public Article() {
		super();
	}
	

	public void setAuthor(String author) {
		this.author = author;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setJournal(String journal) {
		this.journal = journal;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public void setPages(String pages) {
		this.pages = pages;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public void setKey(String key) {
		this.key = key;
	}
	
	public boolean isValid() {
		if (author != null && title != null && journal != null && year != null) return true;
		else return false;
	}

	public String toString(){
		String result = "";

		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nJournal: " + journal;
		result += "\nYear: " + year;
		if (!volume.equals("null")) result += "\nVolume: " + volume;
		if (!number.equals("null")) result += "\nNumber: " + number;
		if (!pages.equals("null")) result += "\nPages: " + pages;
		if (!month.equals("null")) result += "\nMonth: " + month;
		if (!note.equals("null")) result += "\nNote: " + note;
		if (!key.equals("null")) result += "\nKey: " + key;

		return result + "\n\n";
	}


	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		
		contents += " " + author + ".";
		contents += " " + title + ".";
		contents += " <i>" + journal + "</i>,";
		if (volume != null) contents += " " + volume;
		if (number != null) contents += "(" + number + ")";
		if (pages != null) contents += ":" + pages + ",";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
}


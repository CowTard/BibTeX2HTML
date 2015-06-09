package elementos;

public class Techreport extends Entry {
	
	private String author, title, institution, year, type, number, address, month, note, key;
	
	public Techreport(){
		super();
	}
		
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAddress(String address) {
		this.address = address;
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
		if (author != null && title != null && institution != null && year != null) return true;
		else return false;
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		
		contents += " " + author + ".";
		contents += " " + title + ".";
		if (number != null) contents += " Technical Report " + number + ",";
		contents += " " + institution + ",";
		if (address != null) contents += " " + address + ",";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (contents != null) contents += " " + note + ".";
		
		return contents;
	}
}

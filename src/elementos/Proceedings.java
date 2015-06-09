package elementos;

public class Proceedings extends Entry {
	private String title, year, editor, volume, number, series, address, month, publisher, organization, note, key;
	
	public Proceedings(){
		super();
	}
		
	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isValid() {
		if (title != null && year != null) return true;
		else return false;
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else if (editor != null) contents += "[" + editor.substring(0, 3) + year.substring(2, 4) + "]";
		else contents += "[proceedings]";
		
		if (editor != null) contents += " " + editor + ", editor.";
		contents += " " + title + ",";
		if (volume != null) contents += " volume " + volume;
		else if (number != null) contents += " number " + number;
		if (series != null) contents += " of " + series + ",";
		if (address != null) contents += " " + address + ",";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (organization != null) contents += " " + organization + ",";
		if (publisher != null) contents += " " + publisher + ".";
		if (contents != null) contents += " " + note + ".";
		
		return contents;
	}
}

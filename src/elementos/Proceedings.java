package elementos;

public class Proceedings extends Entry {
	private String title, year, editor, volume, number, series, address, month, publisher, organization, note, key;
	
	public Proceedings(String reference, String title, String year){
		super(reference);
		this.title = title;
		this.year = year;

	}
	
	public String toString(){
		String result = "";
		
		result += "Title: " + title;
		result += "\nYear: " + year;
		if (editor != null) result += "Editor: " + editor;
		if (volume != null) result += "\nVolume: " + volume;
		if (number != null) result += "\nNumber: " + number; //ou só else
		if (series != null) result += "\nSeries: " + series;
		if (address != null) result += "\nAddress: " + address;
		if (month != null) result += "\nMonth: " + month;
		if (publisher != null) result += "\nPublisher: " + publisher;
		if (organization != null) result += "\nOrganization: " + organization;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
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

}

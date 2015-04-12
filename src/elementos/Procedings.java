package elementos;

public class Procedings extends Entry {
	private String title, year, editor, volume, number, series, address, month, publisher, organization, note, key;
	
	public Procedings(String reference, String title, String year, String editor, String volume, String number, String series, String address, String month, String publisher, String organization, String note, String key){
		super(reference);
		this.title = title;
		this.year = year;
		this.editor = editor;
		this.volume = volume;
		this.number = number;
		this.editor = editor;
		this.series = series;
		this.address = address;
		this.month = month;
		this.publisher = publisher;
		this.organization = organization;
		this.note = note;
		this.key = key;
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

	/*public String toString() {
		String result = "";
		
		result += "Author: " + author;
		result += "\nTitle: " + title;
		result += "\nInstitution: " + institution;
		result += "\nYear: " + year;
		if (type != null) result += "\nType: " + type;
		if (number != null) result += "\nNumber: " + number;
		if (address != null) result += "\nAddress: " + number;
		if (month != null) result += "\nMonth: " + month;
		if (note != null) result += "\nNote: " + note;
		if (key != null) result += "\nKey: " + key;
		
		return result + "\n\n";
	}*/
}

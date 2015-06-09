package elementos;

import compilador.ParseException;

public class Inbook extends Entry {
	private String author;
	private String editor;
	private String title;
	private String chapter;
	private String pages;
	private String publisher;
	private String year;
	private String volume;
	private String number;
	private String series;
	private String crosskey;
	private String address;
	private String edition;
	private String month;
	private String note;
	private String key;
	
	public Inbook(){
		super();
	}
	
	public boolean addattribute(String attr, String value) {
		boolean aRetornar = false;
		switch(attr) {
		case "author":
			setAuthor(value);
			aRetornar = true;
			break;
		case "editor":
			setEditor(value);
			aRetornar = true;
			break;
		case "title":
			setTitle(value);
			aRetornar = true;
			break;
		case "chapter":
			setChapter(value);
			aRetornar = true;
			break;
		case "pages":
			setPages(value);
			aRetornar = true;
			break;
		case "publisher":
			setPublisher(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
			aRetornar = true;
			break;
		case "volume":
			setVolume(value);
			aRetornar = true;
			break;
		case "number":
			setNumber(value);
			aRetornar = true;
			break;
		case "series":
			setSeries(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "edition":
			setEdition(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
			aRetornar = true;
			break;
		case "note":
			setNote(value);
			aRetornar = true;
			break;
		case "key":
			setKey(value);
			aRetornar = true;
			break;
		case "crossref":
			setCrossRef(value);
			aRetornar = true;
			break;
		default: break;
		}
		return aRetornar;
	}


	private void setCrossRef(String value) {
		this.crosskey = value;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setChapter(String chapter) {
		this.chapter = chapter;
	}


public void setPages(String pages){
		
		String[] pagesSplit = pages.split("-");
		
		if(pagesSplit.length == 0)
			this.pages = pages;
		
		else if(pagesSplit.length == 1){
			this.pages = pagesSplit[0];
		}
		
		else if(pagesSplit.length == 2){
			int part1 = Integer.parseInt(pagesSplit[0]);
			int part2 = Integer.parseInt(pagesSplit[1]);
			
			if(part1 > part2){
				String tmp = pagesSplit[0];
				pagesSplit[0] = pagesSplit[1];
				pagesSplit[1] = tmp;
			}
			
			else if(part1 == part2){
				this.pages = pagesSplit[0];
			}
			
			else this.pages = pages;
		}
		
		else{
			try {
				throw new ParseException("Pages not in the correct format.");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
			
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
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


	public void setSeries(String series) {
		this.series = series;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public void setEdition(String edition) {
		this.edition = edition;
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
	
	public String isValid() {
		String aRetornar = "";
		if (author == null && editor == null) aRetornar = "author-";
		if (title == null) aRetornar = "title-";
		if (chapter == null && pages == null) aRetornar = "chapter|pages-";
		if (publisher == null) aRetornar = "publisher-";
		if (year == null) aRetornar = "year-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else if (author != null && year != null) contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		else if (editor != null && year != null) contents += "[" + editor.substring(0, 3) + year.substring(2, 4) + "]";
		else contents += "[inbook]";
		if (author != null) contents += " " + author + ".";
		if (editor != null) contents += " " + editor + ".";
		contents += " <i>" + title + "</i>,";
		if (volume != null && series != null) contents += " volume " + volume + " of " + series + ",";
		if (number != null && series != null) contents += " number " + number + " of " + series + ",";
		if (chapter != null) contents += " chapter " + chapter + ",";
		if (pages != null) contents += " pages " + pages + "."; 
		contents += " " + publisher + ",";
		if (address != null) contents += " " + address + ",";
		if (edition != null) contents += " " + edition + "edition,";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
	
	
}

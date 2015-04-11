package elementos;

public class Book extends Entry {
	String author, editor, title, publisher, year, volume, number, series, address, edition, month, note, key;
	
	Book(String type, String authorEditor, String title, String publisher, String year, String... optionals) {
		if (type.equals("author"))
			author = authorEditor;
		else if (type.equals("editor"))
			this.editor = authorEditor;
		else throw new IllegalArgumentException();
		
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		
		if (optionals[0].equals("volume"))
			author = authorEditor;
		else if (optionals[1].equals("number"))
			this.editor = authorEditor;
		else throw new IllegalArgumentException();
		
		series = optionals[2];
		address = optionals[3];
		edition = optionals[4];
		month = optionals[5];
		note = optionals[6];
		key = optionals[7];
	}
}

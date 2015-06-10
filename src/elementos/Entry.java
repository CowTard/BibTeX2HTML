package elementos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Entry {
	protected String reference, key;
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public abstract boolean addattribute(String attr, String value);
	
	public abstract String isValid();
	
	public void createFile() throws IOException {
		File bibtex = new File("BibTeX.html");
		FileOutputStream oFile = new FileOutputStream(bibtex, true); 
		if(!bibtex.exists()) {
			bibtex.createNewFile();
			oFile.write(toString().getBytes());
	
		} else {
			oFile.write(toString().getBytes());
		}
		oFile.close();
	}
	
	public String toString() {
		String[] temp = printContents();
		String output = "";
		output += "<p id=\"" + reference + "\">";
		output += temp[0];
		if (temp[1] != null) output += " <a href=\"#" + temp[1].substring(1,temp[1].length()-1) + "\">Cross-reference</a>" ;
		output += "</p>";
		return output;
	}

	public abstract String[] printContents();
}

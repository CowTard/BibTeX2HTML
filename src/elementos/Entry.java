package elementos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Entry {
	protected String reference;
	
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
			oFile.write(toStringg().getBytes());
	
		} else {
			oFile.write(toStringg().getBytes());
		}
		oFile.close();
	}
	

	public String toStringg() {
		String output = "";
		output += "<p style=\"margin-left: 20px; text-indent: -20px;\">";
		output += printContents();
		output += "</p>";
		return output;
	}

	public abstract String printContents();
}

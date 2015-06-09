package elementos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public abstract class Entry {
	protected String reference;
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public abstract boolean addattribute(String attr, String value);
	
	public abstract String isValid();

	public void createFile() throws UnsupportedEncodingException, FileNotFoundException, IOException{
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("BibTeX.html"), "utf-8"))) {
	   writer.write("something");
	}
	}
	
	public String toString() {
		String output = "";
		output += "<p style=\"margin-left: 20px; text-indent: -20px;\">";
		output += printContents();
		output += "</p>";
		return output;
	}

	public abstract String printContents();
}

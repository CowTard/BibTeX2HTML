package elementos;

public abstract class Entry {
	protected String reference;
	
	public void setReference(String reference) {
		this.reference = reference;
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

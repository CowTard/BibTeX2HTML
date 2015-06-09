package elementos;

public abstract class Entry {
	protected String reference;
	
	public Entry () {}
	
	public void setReference(String reference){
		this.reference = reference;
	}
	
	public abstract boolean addattribute(String attr, String value);
	
	public abstract String isValid();
}

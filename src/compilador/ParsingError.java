package compilador;

public class ParsingError extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public ParsingError (String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

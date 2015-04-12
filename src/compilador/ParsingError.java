package compilador;

public class ParsingError extends Exception{

	private static final long serialVersionUID = 1L;

	public ParsingError(String message) { super(message); }
}

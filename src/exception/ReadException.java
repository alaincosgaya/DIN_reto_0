package exception;
/**
 * Controls the exceptions that occurs when you read from the DB.
 * @author Alain Cosgaya
 */
public class ReadException extends Exception{

	private static final long serialVersionUID = 1L;

	public ReadException(String message) {
		super(message);
	}

	
	
}

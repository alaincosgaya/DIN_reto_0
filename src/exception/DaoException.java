package exception;
/**
 * Controls the exceptions that occurs when you try to connect to the DB.
 * @author Alain Cosgaya
 */
public class DaoException extends Exception{
	private static final long serialVersionUID = 1L;

	public DaoException(String message) {
		super(message);
	}
	
}

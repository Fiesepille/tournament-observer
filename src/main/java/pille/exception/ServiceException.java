package pille.exception;

public class ServiceException extends Throwable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}
	
	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(Throwable throwable) {
		super(throwable);
	}
	
	public ServiceException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	

}

package exceptions;

public class GraduacionVino extends Exception {

	private static final String MENSAJE_POR_DEFECTO = "No se puede crear una graduación igual o menor a 0";

	
	public GraduacionVino() {
		super(MENSAJE_POR_DEFECTO);
		// TODO Auto-generated constructor stub
	}

	public GraduacionVino(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public GraduacionVino(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public GraduacionVino(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public GraduacionVino(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

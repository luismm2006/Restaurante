package exceptions;

public class PrecioPlatoExcepcion extends Exception {

	private static final String MENSAJE_POR_DEFECTO = "No se puede crear un plato igual o menor a 0€";
	
	public PrecioPlatoExcepcion() {
		super(MENSAJE_POR_DEFECTO);
		// TODO Auto-generated constructor stub
	}

	public PrecioPlatoExcepcion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PrecioPlatoExcepcion(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PrecioPlatoExcepcion(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PrecioPlatoExcepcion(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

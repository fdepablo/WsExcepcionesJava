package excepciones_creadas;

//creamos una excepcion de tipo 
//unchecked 
public class CreditoNegativoException extends RuntimeException{
	
	private static final long serialVersionUID = -8859407903116691303L;

	public CreditoNegativoException(String mensaje){
		super(mensaje);
	}
}

package excepciones_creadas;

//para crear un excepcion debemos de crear una clase
//que extienda o de Exception o de RuntimeException
//Si extendemos de la clase Exception estaremos creando
//una excepcion de tipo "checked" lo que querra decir
//que el programador tiene la obligación de controlar
//dicha Excepcion
//Si extendemos de la clase RuntimeException estaremos
//creando una excepcion de tipo "unchecked" lo cual
//querra decir que el usuario no tiene la obligación
//de controlar la excepcion.
//Ojo, tanto las excepciones checked como las 
//unchecked te paran el programa, ambas son igual
//de peligrosas
public class SaldoNegativoException extends Exception{
	//este numerito representa la version de una clase
	private static final long serialVersionUID = -5905885562463797256L;

	//un constructor en java es un metodo especial el cual nos sirve
	//para crear objetos, es decir cuando usemos la palabra "new"
	public SaldoNegativoException(){
		
	}
	
	public SaldoNegativoException(String mensajeError){
		//mediante super invocamos al constructor padre (Exception)
		//y le pasamos el mensaje de error que hemos tenido
		//podemos obtener este mensaje con el metodo getMessage()
		super(mensajeError);
	}
}

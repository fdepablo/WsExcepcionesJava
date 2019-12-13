package excepciones_creadas;

public class MainCuentaBancaria {
	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria(1000);
		try {
			//al ser una excepcion de tipo checked tenemos la obligaci�n
			//de caputarla rodeando el metodo con un try-catch
			//si no lo hacemos, el programa ni siquiera compila
			double cantidad = cb.sacarDinero(600);
			System.out.println("Hemos sacado la cantidad de " + cantidad);
		} catch (SaldoNegativoException e) {
			//getMessage es un metodo que devuelve la cadena de texto
			// con la que se creo la excepcion, es optativo
			System.out.println("main -> " + e.getMessage());
		}
		
		try {
			double cantidad = cb.sacarDinero(600);
			System.out.println("Hemos sacado la cantidad de " + cantidad);
		} catch (SaldoNegativoException e) {
			System.out.println("main -> " + e.getMessage());
		}
		
		//este metodo al arrojar excepciones de tipo unchecked
		//no tengo la obligaci�n de poner un bloque try-catch
		//pero cuidado, si ocurriera la excepcion y no la controlo
		//me parar�a el programa igualmente
		double cantidad = cb.sacarDineroACredito(400);
		
		System.out.println("Fin del programa");
	}
}

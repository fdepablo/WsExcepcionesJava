package excepciones;

public class Excepciones7 {
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		//este metodo va a fallar, por lo que habria que
		//capturar la excepcion
		//int resultado = cal.dividirNormal(10, 0);
		
		try {
			int resultado = cal.dividirNormal(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error el ejecutar el dividir");			
		}
		
		try {
			int resultado = cal.dividirThrow(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("no se admiten divisiones entre 0");
		}
		
		System.out.println("*******************************");
		try {
			int resultado = cal.dividirTryCatchThrow(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Siguen sin admitirse denominadores con valor 0");
		}
	}
}

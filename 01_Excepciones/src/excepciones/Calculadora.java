package excepciones;

public class Calculadora {
	
	//este metodo no esta muy bien hecho porque arroja
	//excepciones si avisar al programador que lo este usando
	public int dividirNormal(int nominador, int denominador){
		int resultado = nominador / denominador;
		return resultado;
	}
	
	/**
	 * Metodo que devuelve la division entera entre dos numeros enteros
	 * 
	 * @param nominador representa el nominador a dividir
	 * @param denominador representa el denominador a dividir
	 * @return devolvemos el resultado de la operacion
	 * @throws ArithmeticException cuando el denominador sea 0
	 */
	public int dividirThrow(int nominador,int denominador) throws ArithmeticException{
		int resultado = nominador / denominador;
		return resultado;
	}
	
	/**
	 * Metodo que devuelve la division entera entre dos numeros enteros
	 * 
	 * @param nominador representa el nominador a dividir
	 * @param denominador representa el denominador a dividir
	 * @return devolvemos el resultado de la operacion
	 * @throws ArithmeticException cuando el denominador sea 0
	 */
	public int dividirTryCatchThrow(int nominador,int denominador) throws ArithmeticException{
		/*
		 * Cuando trabajamos con excepciones podemos hacer 3 labores con ellas
		 * 1- Capturarlas para evitar que el programa se pare
		 * 2- Arrojarlas, (throws) para que sea el objeto que llamo a nuestro
		 * metodo el que se encargue de controlarla
		 * 3- Capturarlas y arrojarlas, este ejemplo, es decir, capturarmos
		 * mediante un bloque try-catch y luego hacemos un throw de ella
		 */
		try {
			int resultado = nominador / denominador;
			return resultado;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//esta funcion imprime el error
			System.out.println("dividirTryCatchThrow -> division por cero");
			throw e;//arrojamos la excepcion al que llamo el metodo
		}
	}
}





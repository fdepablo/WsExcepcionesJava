
public class MainMetodos {
	public static void main(String[] args) {
		System.out.println("Primera linea del programa");
		funcion1();
		funcion1();
		funcion2();
		funcion2("cadena 1");
		funcion2("otra cadena");
		
		int resultado = sumar(8,9);
		System.out.println(resultado);
		resultado = sumar(345,789);
		System.out.println(resultado);
	}
	
	/*
	 * Los metodos tienen lo que se llama una
	 * firma del metodo o funcion.
	 * La firma de un metodo o funcion consiste
	 * en tres valores
	 * 1- Nombre de la funcion
	 * 2- El numero de parametros de entrada
	 * 3- El tipo de los parametros de entrada
	 * 
	 * La firma de un metodo java es la manera
	 * que tiene java de identificar univocamente
	 * un metodo o funcion de otro
	 * 
	 * En este ejemplo:
	 * 1- funcion1
	 * 2- 0
	 * 3- 0
	 */
	public static void funcion1(){
		System.out.println("Hola funcion1");
	}
	
	public static void funcion2(){
		System.out.println("Hola funcion2");
	}
	
	//En este caso de aqui la funcion se llama
	//igual que la anterior pero cambia el 
	//numero de parametros de entrada 0->1
	public static void funcion2(String cadena){
		System.out.println("Hola " + cadena);
	}
	
	//las funciones tambien pueden tener
	//parametros de salida
	public static int sumar(int numero1, int numero2){
		int resultado = numero1 + numero2;
		return resultado;
	}
	
}

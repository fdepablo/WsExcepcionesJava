import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {
		
		System.out.println("Introduzca un numero: ");
		
		//para leer datos introducidos por el teclado, podemos
		//utilizar las clase Scanner
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println("El numero introducido es: " + numero);
		
		System.out.println("Introduzca un nombre: ");
		String nombre = sc.next();
		System.out.println("El nombre introducido es: " +nombre);
		
		System.out.println("Introduzca un numero real: ");
		double real = sc.nextDouble();
		System.out.println("El numero real introducio es: " + real);
	}

}

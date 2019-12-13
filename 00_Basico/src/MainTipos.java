
public class MainTipos {

	public static void main(String[] args) {
		//java es un lenguaje tipado, quiere decir
		//que las variables donde vamos a almacenar
		//la información en memoria, tiene que ser
		//de un tipo especifico
		int numero = 1;//naturales positivos o negativos
		double decimal = 13.45;//numeros reales
		boolean cierto = true;//booleanos que sirven para guardar true o false
		cierto = false;//solo estos dos valores
		
		//particularidades
		numero = 07200;//los numeros que empiezan por '0' estan en base octal
		System.out.println(numero);
		
		
		String cp = "07200";
		System.out.println(cp);
		int numero2 = Integer.parseInt(cp);//el metodo pasa una cadena a un entero
		System.out.println(numero2);
		
		//Integer integer = 07200;
		numero = 0xABC23F;//seria en representacion hexadecimal
		numero = 0b101;//si empieza por 0b la representación es binaria
	}

}

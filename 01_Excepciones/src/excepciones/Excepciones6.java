package excepciones;

public class Excepciones6 {

	public static void main(String[] args) {
		int[] nominadores = {4,8,16,32,64,128,256,512};
		int[] denominadores = {2,0,4,4,0,8};
		
		try {
			for(int i = 0; i < nominadores.length;i++){
				try {
					int resultado = nominadores[i] / denominadores[i];
					System.out.println(resultado);
				} catch (ArithmeticException ae) {
					// TODO Auto-generated catch block
					System.out.println("Division entre cero!!!");
				}
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Ya no hay denominadores");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Fin de programa");
	}

}

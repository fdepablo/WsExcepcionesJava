package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraFicheroAutoclosable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("nombre.txt");
		System.out.println("Empezando el programa");
		
		//Desde la version de java 1.7, existen los bloques try auto-closable
		//es decir, que ciertos objetos permiten su auto cierre sin preocuparnos
		//nosotros de cerrarlos. 
		//Dentro de los parentesis del try, podemos poner todos los objetos que queremos
		//que se cierren cuando salgamos el bloque try-catch
		try (FileWriter fw = new FileWriter(file);PrintWriter pw = new PrintWriter(fw)){
			pw.println("Felix");
			pw.println("Pepe");
			pw.println("Pepa");			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

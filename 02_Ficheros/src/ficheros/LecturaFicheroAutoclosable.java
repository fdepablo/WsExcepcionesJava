package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheroAutoclosable {

	public static void main(String[] args) {
		File file = new File("nombre.txt");
		
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr)){
			
			String nombre = br.readLine();
			while(nombre != null){//si no estamos en EOF (fin de fichero)
				System.out.println("nombre leido: " + nombre);
				nombre = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

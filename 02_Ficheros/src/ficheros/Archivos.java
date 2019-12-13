package ficheros;

import java.io.File;
import java.io.IOException;

public class Archivos {
	public static void main(String[] args) {
		//Para trabajar con fichero podemos hacerlo de manera
		//relativa al proyecto o absoluta. De manera absuluta "C:/fichero.txt" o
		// "C:\\fichero.txt"
		try {
			File file = new File("fichero.txt");
			if(!file.exists()){
				file.createNewFile();
				
				//File se utiliza tanto para carpetas o directorios, como para archivos
				//si la ruta no tiene extension, sera considerada como un directorio
				// pero para ello deberemos de utilizar
				//file.mkdir();
			}
			
			file.canWrite();//podemos preguntar por los permisos del fichero
			file.isDirectory();
			file.isFile();
			file.isHidden();
			
			//si es un directorio podemos preguntar por todos los ficheros y
			//carpetas que tiene
			String[] lista = file.list();
			
			//file.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fin del programa");
	}
}

package policia;

public class Persona {
	public String nombre;
	public int edad;
	public double peso;
	public String dni;
	
	public void correr(){
		System.out.println("me llamo " + nombre + " y estoy corriendo");
	}
	
	public void presentarse(){
		System.out.println("Mi nombre es " + nombre + 
				" mi edad es: " + edad + " y mi peso es: " + peso);
	}
	
	public void cumplirAņos(){
		edad++;
	}
}

package policia;

public class Bombero extends Persona{

	@Override
	public void presentarse() {
		System.out.println("Soy el bombero " + nombre + " y tengo la edad de " + edad
				+ " y el peso de " + peso);
	}
	
}

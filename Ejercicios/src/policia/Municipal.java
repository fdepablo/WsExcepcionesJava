package policia;

public class Municipal extends Policia{


	public void multar(Persona p, int cantidad) {
		System.out.println("Soy un policia municipal con numero de placa "
				+ numeroPlaca + " y voy a multar a la persona " + p.nombre
				+ " con la cantidad de " + cantidad * 2);
	}
	
	

}

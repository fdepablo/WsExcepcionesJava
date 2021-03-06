package policia;

//mediante la herencia, extendemos automaticamente
//todos os atributos y metodos de la clase padre
//En este caso, policia tiene sin hacer nada
//los atributos nombre, edad y peso
//y los metodos, correr, presentarse, cumplirAņos
public abstract class Policia extends Persona{
	public int numeroPlaca;
	
	public void multar(Persona p, int cantidad){
		System.out.println("Soy el policia " + nombre + " con numero de placa " + 
			numeroPlaca + " y voy a multar a la persona " + p.nombre + " con la"
					+ " cantidad de " + cantidad);
	}

	//para sobreescribir un metodo, el metodo tiene que tener la misma firma, es decir
	//mismo nombre, mismo numero de argumentos y mismo tipo de argumentos
	@Override
	public void presentarse() {
		System.out.println("Soy el policia que se llama " + nombre + " con numero de placa "
				+ numeroPlaca + " con la edad de " + edad + " y con el peso de " + peso);
	}
	
	
	
}

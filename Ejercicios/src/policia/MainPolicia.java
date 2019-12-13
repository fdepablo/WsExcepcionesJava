package policia;

public class MainPolicia {
	public static void main(String[] args) {
		Persona[] arrayPersonas = new Persona[4];
		
		//Policia p = new Policia();
		
		Persona persona = new Persona();
		persona.nombre = "Harry Potter";
		persona.edad = 17;
		persona.peso = 55.6;
		
		Nacional nacional = new Nacional();
		nacional.nombre = "Harry Callahan";
		nacional.numeroPlaca = 1233456;
		nacional.edad = 75;
		nacional.peso = 80;
		
		Municipal municipal = new Municipal();
		municipal.nombre = "Anacleto";
		municipal.numeroPlaca = 9877323;
		municipal.edad = 45;
		municipal.peso = 65;
		
		Bombero bombero = new Bombero();
		bombero.nombre = "Bombero torero";
		bombero.edad = 43;
		bombero.peso = 75;
		
		arrayPersonas[0] = persona;
		arrayPersonas[1] = nacional;
		arrayPersonas[2] = municipal;
		arrayPersonas[3] = bombero;
		
		//polimorfismo
		for(Persona p1 : arrayPersonas){
			p1.presentarse();
		}
		
		try {
			nacional.expedirDni(persona, "11234566Y");
			nacional.expedirDni(bombero, "83838383R");
		} catch (DniMalFormadoException e) {
			System.out.println("main -> " + e.getMessage());
		}
		
		try {
			nacional.expedirDni(persona, "112345669");
		} catch (DniMalFormadoException e) {
			System.out.println("main -> " + e.getMessage());
		}
		
		try {
			nacional.expedirDni(persona, "1123456");
		} catch (DniMalFormadoException e) {
			System.out.println("main -> " + e.getMessage());
		}
		
		try {
			nacional.expedirDni(persona, "11R34566P");
		} catch (DniMalFormadoException e) {
			System.out.println("main -> " + e.getMessage());
		}
		
		try {
			nacional.expedirDni(persona, "11134566%");
		} catch (DniMalFormadoException e) {
			System.out.println("main -> " + e.getMessage());
		}
		
		System.out.println(persona.dni);
		System.out.println(bombero.dni);
	}
}

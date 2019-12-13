package policia;

public class Nacional extends Policia{
	
	/*
	
	switch (caracter) {
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':
	case '0':
			
	default:
		break;
	}*/
	public void expedirDni(Persona p, String dni) throws DniMalFormadoException{
		char caracter = dni.charAt(dni.length()-1);
		
		if(dni.length() != 9){
			throw new DniMalFormadoException("El DNI debe de tener 9 caracteres");
		}
		
		
		if(!Character.isLetter(caracter)){
			throw new DniMalFormadoException("El DNI debe de acabar en una letra normal");
		}
					
		for(int i=0;i<dni.length() -1;i++){
			caracter = dni.charAt(i);
			if(!Character.isDigit(caracter)){
				throw new DniMalFormadoException("El caracter en la posicion " 
						+ (i + 1) + " no es un numero, por favor reviselo");
			}
		}
		
		System.out.println("Soy el nacional " + nombre);
		System.out.println("Voy a expedir el dni " + dni);
		p.dni = dni;
	}
}




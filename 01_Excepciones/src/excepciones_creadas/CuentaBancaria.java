package excepciones_creadas;

public class CuentaBancaria {
	public double saldo;
	
	public CuentaBancaria(double saldo){
		//el saldo pasado por parametro oculta el saldo de atributo
		//por lo que si queremos acceder al saldo como atributo
		//deberemos de usar la palabra reservada "this"
		//"this" es una referencia al propio objeto
		this.saldo = saldo;		
	}
	
	/**
	 * Metodo que extrae dinero del saldo de una cuenta bancaria
	 * 
	 * @param cantidad la cantidad de dinero que queremos sacar
	 * @return la cantidad de dinero sacada
	 * @throws SaldoNegativoException cuando no hay saldo suficiente en la cuenta
	 */
	public double sacarDinero(double cantidad) throws SaldoNegativoException{
		if(cantidad <= this.saldo){
			saldo = saldo - cantidad;
			return cantidad;
		}else{
			SaldoNegativoException sne = new SaldoNegativoException("Fondos insuficientes");
			throw sne;
		}
	}
	
	public double sacarDineroACredito(double cantidad) throws CreditoNegativoException{
		if(cantidad <= this.saldo){
			saldo = saldo - cantidad;
			return cantidad;
		}else{
			CreditoNegativoException sne = new CreditoNegativoException("Dinero sacado, pero la cuenta esta en numeros rojos");
			throw sne;
		}
	}
}

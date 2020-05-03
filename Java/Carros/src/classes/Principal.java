package classes;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro(10,"Fusca",0);
		Carro c2 = new Carro(20,"Corcel",0);
		
		c1.acelerar();
		c1.imprimir();
		
		c1.acelerar();
		c1.acelerar();
		c2.acelerar();
		
		c2.imprimir();

		c2.frear();
		c2.frear();
		c2.imprimir();

	}

}

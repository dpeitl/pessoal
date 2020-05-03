package classes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteCarro {

	@Test
	void testeParado() {
		Carro c = new Carro(10, "GM", 0);
		assertEquals(0, c.getVelocidade());
		
	}
	
	@Test
	void testeAcelerar() {
		Carro c = new Carro(10, "GM", 0);
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	void testeFrear() {
		Carro c = new Carro(10, "GM", 0);
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());

		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
		
	}
	
	

}

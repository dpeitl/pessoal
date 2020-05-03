package classes;

public class Carro {
	int potencia;
	int velocidade;
	String marca;
	
	Carro(int potencia, String marca, int velocidade){
		this.potencia = potencia;
		this.velocidade = velocidade;
		this.marca = marca;
	}
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade /= 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("o carro "+marca+" está a "+getVelocidade()+" km/h");
		
	}
}

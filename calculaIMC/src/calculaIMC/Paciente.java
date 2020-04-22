package calculaIMC;

public class Paciente {

	double peso;
	double altura;
	
	public Paciente(double peso, double altura) {
		this.peso=peso;
		this.altura=altura;
	}
	
	public double calcularIMC() {
		return this.peso / (this.altura*this.altura);
	}
	
	public String diagnostico() {
		double resultado = this.calcularIMC();
		String mensagem = "";
		
		if (resultado < 16) {
			mensagem = "Baixo peso muito grave";
		} else if (resultado >= 16 && resultado < 17) {
			mensagem = "Baixo peso grave";
		} else if (resultado >= 17 && resultado < 18.50) {
			mensagem = "Baixo peso";
		} else if (resultado >= 18.50 && resultado < 25) {
			mensagem = "Peso normal";
		} else if (resultado >= 25 && resultado < 30) {
			mensagem = "Sobrepeso";
		} else if (resultado >= 30 && resultado < 35) {
			mensagem = "Obesidade grau I";
		} else if (resultado >= 35 && resultado < 40) {
			mensagem = "Obesidade grau II";
		} else {
			mensagem = "Obesidade grau III (obesidade mórbida)";
		}
		
		return mensagem;
	}
	
}

package calculaIMC;

public class Principal {

	public static void main(String[] args) {
		Paciente ana = new Paciente(50, 1.73);
		Paciente paulo = new Paciente(78, 1.93);
		Paciente rodrigo = new Paciente(85, 1.68);
		Paciente joao = new Paciente(74.3, 1.72);
		Paciente andre = new Paciente(65, 1.70);
		
		
		System.out.println("Ana possui "+ana.diagnostico()+" com IMC "+ana.calcularIMC());
		System.out.println("Paulo possui "+paulo.diagnostico()+" com IMC "+paulo.calcularIMC());
		System.out.println("Rodrigo possui "+rodrigo.diagnostico()+" com IMC "+rodrigo.calcularIMC());
		System.out.println("João possui "+joao.diagnostico()+" com IMC "+joao.calcularIMC());
		System.out.println("Andre possui "+andre.diagnostico()+" com IMC "+andre.calcularIMC());
	}

}

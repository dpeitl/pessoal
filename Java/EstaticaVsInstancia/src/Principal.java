
public class Principal {

	public static void main(String[] args) {
		Somador s1 = new Somador();
		Somador s2 = new Somador();
		Somador s3 = new Somador();
		s1.nome = "1";
		s2.nome = "2";
		s3.nome = "3";
		
		for (int i=0; i<3; i++) {
			s1.somar();
			s2.somar();
			s3.somar();
		}
		
		s2.somar();
		
		s1.imprimir();
		s2.imprimir();
		s3.imprimir();
	}

}

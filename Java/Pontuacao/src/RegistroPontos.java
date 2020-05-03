
public class RegistroPontos {

	private CalculaBonus bonus;
	
	RegistroPontos(CalculaBonus calc){
		bonus = calc;
	}
	
	public void fazerUmComentario(Usuario user) {
		user.pontos += 3*bonus.bonus(user);
	}
	
	
	public void criarUmTopico(Usuario user) {
		user.pontos += 5*bonus.bonus(user);
	}
	
	public void darLike(Usuario user) {
		user.pontos += 1*bonus.bonus(user);
	}
}

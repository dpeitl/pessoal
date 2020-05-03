
public class CalculaBonus {

	public int bonusDoDia = 1;
	
	public int bonus(Usuario user) {
		int mult = bonusDoDia;
		if (user.vip)
			mult *= 5;
		return mult;
	}
	
}

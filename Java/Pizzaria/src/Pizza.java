import java.util.HashMap;

public class Pizza {
	
	static HashMap<String, Integer> listaIngredientes = new HashMap<>();
	Integer itensPizza = 0;
	double preco;	
	
	public void adicionaIngrediente(String ingrediente) {	
		this.itensPizza++;
		contaIngrediente(ingrediente);
	}	
	
	public void contaIngrediente(String ingrediente) {
		if (listaIngredientes.containsKey(ingrediente)) {
			listaIngredientes.replace(ingrediente, listaIngredientes.get(ingrediente)+1);
		} else { 
			listaIngredientes.put(ingrediente, 1);
		}
	}	
	
	public double getPreco() {	
		if (itensPizza <= 2)
			this.preco = 15;
		else if (itensPizza <= 5)
			this.preco = 20;
		else 
			this.preco = 23;
		return this.preco;
	}
}

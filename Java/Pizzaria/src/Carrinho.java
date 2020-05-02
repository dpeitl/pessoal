import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	List<Pizza> listaPizzas = new ArrayList<>();
	
	public void adicionaPizza(Pizza p) {
		this.listaPizzas.add(p);
	}
	
	public double calculaTotal() {
		double total = 0;
		for(Pizza p:listaPizzas) {
			total += p.getPreco();
		}
		return total;
	}
	
	public void getListaPizzas() {
		System.out.println("Pizzas adicionadas: ");
		int i = 0;
		for(Pizza p:listaPizzas) {
			i++;
			System.out.println("Pizza "+i+": "+p.getPreco());
		}
		System.out.println("Total: "+calculaTotal());
		System.out.println("Ingredientes: "+ Pizza.listaIngredientes);
	}
}

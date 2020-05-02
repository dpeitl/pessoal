
public class Main {

	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("atum");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("queijo");
		p1.adicionaIngrediente("borda recheada");
		p1.adicionaIngrediente("azeitona");
		p1.adicionaIngrediente("massa");
		carrinho.adicionaPizza(p1);
		carrinho.getListaPizzas();		

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("queijo");
		p2.adicionaIngrediente("palmito");
		p2.adicionaIngrediente("abobrinha");
				
		carrinho.adicionaPizza(p2);		
		carrinho.getListaPizzas();

	}

}

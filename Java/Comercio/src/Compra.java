
public class Compra {
	
	int valorTotal;
	int numeroParcelas;
	
	//a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroParcelas = 1;
	}

	//parcelado
	public Compra(int valorParcela, int parcelas) {
		this.valorTotal = valorParcela*parcelas;
		this.numeroParcelas = parcelas;
	}
	
	public int getValorParcela() {
		return valorTotal/numeroParcelas;
	}
		
	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	
}

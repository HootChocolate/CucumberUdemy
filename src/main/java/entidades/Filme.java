package entidades;

public class Filme {

	private int estoque;
	private double preco;
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	public void setPreco(double valor) {
		this.preco = valor;
	}
	
	public double getPreco() {
		return preco;
	}
	@Override
	public String toString() {
		return "== Dados do filmes =="
				+ "\nPreco: " + preco
				+ "\nEstoque: " + estoque
				+ "\n======================";
	}
}

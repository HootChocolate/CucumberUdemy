package entidades;

public class NotaAluguel {

	private int pontos;
	private double valorAluguel;
	private String dataEntrega;
	private String tipo = "comum";

	public void alugar(Filme filme) {
		if(filme.getEstoque() == 0) {
			throw new RuntimeException("Filme sem estoque");
		}
		filme.setEstoque(filme.getEstoque() - 1);
	}
	
	public void setPreco(double valor) {
		this.valorAluguel = valor;
	}
	
	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;		
	}

	public String getDataEntrega() {
		return dataEntrega;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	@Override
	public String toString() {
		return "= = Nota Entrega = ="
				+ "\nValor: " + valorAluguel
				+ "\nTipo: " + tipo
				+ "\nPontos: " + pontos
				+ "\nData entrega: " + dataEntrega
				+ "\n= = = = = = = = = = =";
	}
}

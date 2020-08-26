package steps;

import static org.junit.Assert.*;

import entidades.Filme;
import entidades.NotaAluguel;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import utils.CalendarUtil;
import utils.DateUtils;

public class AlugarFilmeSteps {

	private Filme filme = new Filme();
	private NotaAluguel notaAluguel = new NotaAluguel();
	private String erroEstoque;
	
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int valor) {
		filme.setEstoque(valor);
	}

	@Dado("^que o preço de aluguel seja R\\$ (\\d+)$")
	public void queOPreçoDeAluguelSejaR$(double valor) {
		filme.setPreco(valor);
	}
	@Quando("alugar")
	public void alugar() {
		try {
			notaAluguel.alugar(filme);
		} catch(RuntimeException ex) {
			erroEstoque = ex.getMessage();
		}
	}
	@Então("^o preço do aluguel será R\\$ (\\d+)$")
	public void oPreçoDoAluguelSeráR$(double valor) {
	    notaAluguel.setPreco(valor);
	}
	@Então("^a data de entrega será de (\\d+) dias?$")
	public void aDataDeEntregaSeráNoDiaSeguinte(int dias) {
		
	    notaAluguel.setDataEntrega(
	    		DateUtils.formatddMMyyyy(CalendarUtil.getCalendarMaisQuantidadeDias(dias)));
	}
	@Então("^o estoque do filme será (\\d+) unidades?$")
	public void oEstoqueDoFilmeSeráUnidade(int quantidade) {
	    
		assertEquals("Erro ao validar o estoque do filme", quantidade, filme.getEstoque());
	}
	@Então("não será possível por falta de estoque")
	public void nãoSeráPossívelPorFaltaDeEstoque() {
		assertEquals("Erro ao validar que estoque vazio", "Filme sem estoque", erroEstoque);
	}
	@Dado("^que o tipo do aluguel seja (.*)$")
	public void queOTipoDoAluguelSejaExtendido(String tipo) {
	    notaAluguel.setTipo(tipo);
	}
	@Então("^a data de entrega será em (\\d+) dias$")
	public void aDataDeEntregaSeráEmDias(int dias) {
		notaAluguel.setDataEntrega(
				DateUtils.formatddMMyyyy(CalendarUtil.getCalendarMaisQuantidadeDias(dias)));
	}
	@Então("^a pontuação recebida será de (.*) pontos$")
	public void aPontuaçãoRecebidaSeráDePontos(int pontos) {
		notaAluguel.setPontos(pontos);
	}
}

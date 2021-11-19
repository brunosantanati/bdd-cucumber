package me.brunosantana.bdd.acceptance.steps;

import java.math.BigDecimal;

import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import me.brunosantana.bdd.model.Lance;
import me.brunosantana.bdd.model.Leilao;
import me.brunosantana.bdd.model.Usuario;

public class PropondoLancesSteps {
	
	private Leilao leilao;
	private Lance lance;
	
	@Before
	public void setup() {
		leilao = new Leilao("Tablet XPTO");
	}
	
	@Dado("um lance valido")
	public void dado_um_lance_valido() {
		Usuario usuario = new Usuario("fulano");
		lance = new Lance(usuario, BigDecimal.TEN);
	}
	
	@Quando("propoe ao leilao")
	public void quando_propoe_ao_leilao() {
		leilao.propoe(lance);
	}
	
	@Entao("o lance eh aceito")
	public void entao_o_lance_eh_aceito() {
		Assert.assertEquals(1, leilao.getLances().size());
		Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
	}

}

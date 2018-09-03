package br.com.calc;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicacaoTest {

	private Multiplicacao multiplicacao = new Multiplicacao();
	
	@Test
	public void doisMultiplicaPorDois() {
		Double resultado = multiplicacao.multiplicar(2,2);
		
		Assert.assertEquals(new Double(4), resultado);
	}
	
	@Test
	public void cincoMultiplicaPorMenosSete() {
		Double resultado = multiplicacao.multiplicar(5,-7);
		
		Assert.assertEquals(new Double(-35), resultado);
	}
	
	@Test
	public void menosDoisMultiplicaPorMenosDois() {
		Double resultado = multiplicacao.multiplicar(-2,-2);
		
		Assert.assertEquals(new Double(4), resultado);
	}
	
	@Test
	public void doisMultiplicaPorDoisVirgulaCinco() {
		Double resultado = multiplicacao.multiplicar(2,2.5);
		
		Assert.assertEquals(new Double(5), resultado);
	}
}

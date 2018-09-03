package br.com.calc;

import org.junit.Assert;
import org.junit.Test;

public class SomaTest {

	private Soma soma = new Soma();
	
	@Test
	public void soma1Mais1() {
		Double resultado = soma.somar(1, 1);
		Assert.assertEquals(new Double(2), resultado);
	}
	
	@Test
	public void soma2mais8() {
		Double resultado = soma.somar(2, 8);
		Assert.assertEquals(new Double(10), resultado);
	}
	
	@Test
	public void somaQuebrada() {
		Double resultado = soma.somar(2.5, 8.5);
		Assert.assertEquals(new Double(11), resultado);
	}
	
	@Test
	public void somaNumeroGrande() {
		Double bigNumber = 999999999.0;
		Double resultado = soma.somar(bigNumber, bigNumber);
		Assert.assertEquals(new Double(1999999998), resultado);
	}
	
}

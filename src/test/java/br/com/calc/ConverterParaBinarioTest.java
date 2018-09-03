package br.com.calc;

import org.junit.Test;

import org.junit.Assert;
public class ConverterParaBinarioTest {

	private ConverteBinario converteBinario = new ConverteBinario();
	
	@Test
	public void converterDoisParaI0() {
		Double resultado = (double) converteBinario.converteParaBinario(2);
		Assert.assertEquals(new Double(10), resultado);
	}
	
	@Test
	public void converterDezPara1010() {
		Double resultado = (double) converteBinario.converteParaBinario(2);
		Assert.assertEquals(new Double(1010), resultado);
	}
}

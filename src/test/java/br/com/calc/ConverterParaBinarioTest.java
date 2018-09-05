package br.com.calc;

import org.junit.Test;

import org.junit.Assert;
public class ConverterParaBinarioTest {

	private ConverteBinario converteBinario = new ConverteBinario();
	
	@Test
	public void converterDoisParaI0() {
		int  resultado = converteBinario.convertBinary(2);
		Assert.assertEquals(10, resultado);
	}
	
	@Test
	public void converter10Para1010() {
		int resultado = converteBinario.convertBinary(10);
		Assert.assertEquals(1010, resultado);
	}
	
	@Test
	public void converter22Para10110() {
		int resultado = converteBinario.convertBinary(22);
		Assert.assertEquals(10110, resultado);
	}
	
	@Test
	public void converter0Para0() {
		int resultado = converteBinario.convertBinary(0);
		Assert.assertEquals(0, resultado);
	}
}

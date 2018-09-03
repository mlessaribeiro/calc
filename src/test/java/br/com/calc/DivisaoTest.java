package br.com.calc;

import org.junit.Assert;
import org.junit.Test;

public class DivisaoTest {

	private Divisao divisao = new Divisao();
	
	@Test
	public void doisDivididoPorDois() {
		Double resultado = divisao.dividir(2,2);
		
		Assert.assertEquals(new Double(1), resultado);
	}
	
	@Test
	public void cincoDivididoPorDois() {
		Double resultado = divisao.dividir(5,2);
		
		Assert.assertEquals(new Double(2.5), resultado);
	}
	
	public void menosDoisDivididoPorMenosquatro() {
		Double resultado = divisao.dividir(-2,-4);
		
		Assert.assertEquals(new Double(-0.5), resultado);
	}
	
	
}

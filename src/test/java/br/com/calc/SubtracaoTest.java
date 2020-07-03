package br.com.calc;

import org.junit.Assert;
import org.junit.Test;

public class SubtracaoTest {
	Subtracao subtracao = new Subtracao();
	
	@Test
	public void sbtracaoDezMenosCinco() {
		Double resultado = subtracao.subtrair(10,5);
		Assert.assertEquals(new Double(5), resultado);
	}
	
//	@Test
//	public void sbtracaoNumNegativa() {
//		Double resultado = subtracao.subtrair(-2, -2);
//		Assert.assertEquals(new Double(-4), resultado);
//	}
	
	@Test
	public void subtrcaoCinquentaMenos120() {
		Double resultado = subtracao.subtrair(50, 120);
		Assert.assertEquals(new Double(-70), resultado);
	}
}

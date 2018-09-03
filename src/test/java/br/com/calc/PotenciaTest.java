package br.com.calc;

import org.junit.Assert;
import org.junit.Test;

public class PotenciaTest {
	private Potencia potencia = new Potencia();
	
	@Test
	public void doisPotenciaDeDois() {
		Double resultado = potencia.potenciar(2,2);
		
		Assert.assertEquals(new Double(4), resultado);
	}
	
	@Test
	public void doisPotenciaDeQuatro() {
		Double resultado = potencia.potenciar(2,4);
		
		Assert.assertEquals(new Double(16), resultado);
	}
	
	@Test
	public void cincoPotenciaDeZero() {
		Double resultado = potencia.potenciar(5,0);
		
		Assert.assertEquals(new Double(1), resultado);
	}
	
	@Test
	public void zeroPotenciaDeDois() {
		Double resultado = potencia.potenciar(0,2);
		
		Assert.assertEquals(new Double(0), resultado);
	}
	
	@Test
	public void setePotenciaDeUm() {
		Double resultado = potencia.potenciar(7,1);
		
		Assert.assertEquals(new Double(7), resultado);
	}
}

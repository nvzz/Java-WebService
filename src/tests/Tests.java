package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.tempuri.CalculatorSoapProxy;

public class Tests {
	
	CalculatorSoapProxy client = new CalculatorSoapProxy();

	@Test
	public void testAdd() throws Exception{
		assertEquals(8, client.add(4,4)); //primer parametro es el resultado esperado
	}
	
	@Test
	public void testSubstract() throws Exception{
		assertEquals(0, client.subtract(4,4)); //primer parametro es el resultado esperado
	}
	
	@Test
	public void testDivide() throws Exception{
		assertEquals(1, client.divide(4,4)); //primer parametro es el resultado esperado
	}
	
	@Test
	public void testMultiply() throws Exception{
		assertEquals(16, client.multiply(4,4)); //primer parametro es el resultado esperado
	}
	
}

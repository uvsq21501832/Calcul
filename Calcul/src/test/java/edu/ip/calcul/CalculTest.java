package edu.ip.calcul;

import junit.framework.TestCase;

public class CalculTest extends TestCase {
	public Calcul calcul;

	protected void setUp() throws Exception {
		super.setUp();
		calcul=new Calcul();
	}
	
	public void testSomme(){
		assertTrue(calcul.somme(1,1)==2);
	}
	
	public void testProduit(){
		assertTrue(calcul.produit(1,1)==1);
	}
	

}

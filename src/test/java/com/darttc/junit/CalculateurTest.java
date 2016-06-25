/**
 * 
 */
package com.darttc.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gael
 *
 */
public class CalculateurTest {
	/**
	 * test si la somme un + un egale a deux
	 */
	@Test
	public void testerUnPlusUnEgaleADeux(){
		
		int expected = 2;
		
		Calculateur clc = new Calculateur();
		
		int result = clc.additionner(1, 1);
		
		
		Assert.assertEquals(expected, result);
	}
	@Test
	public void testerUnMoinUnEgaleAZero(){
		
		int expected = 0;
		
		Calculateur clc = new Calculateur();
		
		int result = clc.additionner(1, -1);
		
		
		Assert.assertEquals(expected, result);
	}
}


package myMavenProjectPackage1;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class MultiplicationTest { 
	
	@Test public void testMultiply() { 
		Multiplication multiplication = new Multiplication(); 
		int result = multiplication.multiply(5, 3); 
		assertEquals(15, result); 
	} 
	
}

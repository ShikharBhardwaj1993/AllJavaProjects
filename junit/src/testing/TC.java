package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TC {

	@Test
	public void test() {
		
		square abc = new square() ;
		
		int op = abc.square2(4);
		assertEquals(2, op);
		
		
		
		
	}

}

package task5;

import static org.junit.Assert.*;

import org.junit.Test;

public class task5_JUnit {
	
	 /**
	   * JUnit test for task5
	   *
	   * @author Aran Jannson
	   */

	@Test
	public void testArrayIteration() {
		
		// Task5 Object, will give an error until task4 code is correctly written
		task5 task5Object = new task5();
		
		assertEquals("1, 4, 7, 2, 6", task5Object.arrayIteration());
	}

}

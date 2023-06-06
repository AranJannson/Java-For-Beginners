package task5;

import static org.junit.Assert.*;

import org.junit.Test;

public class task5_example_JUnit {
	
	/**
	   * JUnit test for task5_example
	   *
	   * @author Aran Jannson
	   */

	@Test
	public void testWhileLoopExample() {
		task5_example task5_exampleObject = new task5_example();
		
		assertEquals("0, 1, 2, 3, 4, ", task5_exampleObject.whileLoopExample());
	}

}

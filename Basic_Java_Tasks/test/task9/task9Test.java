package task9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit test for task9
 *
 * @author Aran Jannson
 */


public class task9Test {

    /**
     * Test method to classify animals based on the provided category.
     *
     */

    @Test
    public void testClassifyAnimal() {
        task9 animalManager = new task9();

        // Test classifying an animal into a specific category
        assertEquals("Mammal", animalManager.classifyAnimal(AnimalCategory.MAMMAL));
    }

    /**
     * Test method to describe a specific animal.
     *
     */
    @Test
    public void testDescribeAnimal() {
        task9 animalManager = new task9();

        // Test describing a specific animal
        assertEquals("Lives in water and breathes through gills", animalManager.describeAnimal("Fish"));
    }
}

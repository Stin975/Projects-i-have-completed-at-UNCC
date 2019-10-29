package Shopping;

import DataStructures.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @version Spring 2019
 * @author Paul Franklin, Kyle Kiefer
 */
public class ShoppingListArrayListTest {

    private ShoppingListArrayList instance;

    /**
     * Initialize instance and entries
     */
    @Before
    public void setupTestCases() {
        instance = new ShoppingListArrayList();
    }

    /**
     * Test of add method, of class ShoppingArray.
     */
    @Test
    public void testAdd() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        Grocery entry3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);

        // Test adding a element
        instance.add(entry1);
        assertTrue(instance.contains(entry1));
        
        // Test adding more elements
        instance.add(entry2);
        instance.add(entry3);
        assertTrue(instance.contains(entry1));
        assertTrue(instance.contains(entry2));
        assertTrue(instance.contains(entry3));
        
        // Test adding same item
        assertEquals(entry1.getQuantity(), 1);
        instance.add(entry1);
        assertEquals(entry1.getQuantity(), 2);
    }

    /**
     * Test of remove method, of class ShoppingArrayList.
     */
    @Test
    public void testRemove() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        Grocery entry3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);

        // Test element not found case
        assertFalse(instance.remove(entry1));

        instance.add(entry1);
        assertEquals(1, instance.size());
        assertTrue(instance.contains(entry1));

        instance.remove(entry1);

        // Test general case (size)
        assertEquals(0, instance.size());

        // Test general case (content)
        assertFalse(instance.contains(entry1));
        
        instance.add(entry1);
        instance.add(entry2);
        instance.add(entry3);
        
        // Test remove shifts elements
        // Before shift
        try {
            assertTrue(instance.find(0).equals(entry1));
            assertTrue(instance.find(1).equals(entry2));
            assertTrue(instance.find(2).equals(entry3));
        }
        catch (EmptyCollectionException e) {
            fail("Unexpected ECE - testRemove");
        }
        
        assertTrue(instance.remove(entry1));
        
        // After shift
        try {
            assertTrue(instance.find(0).equals(entry2));
            assertTrue(instance.find(1).equals(entry3));
        }
        catch (EmptyCollectionException e) {
            fail("Unexpected ECE - testRemove");
        }
        
        // Collection bounds changed
        try {
            instance.find(2);
            fail();
        }
        catch (IndexOutOfBoundsException | EmptyCollectionException e) {
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
    }

    /**
     * Test of find method, of class ShoppingArrayList.
     */
    @Test
    public void testFind() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        
        // Test for Empty Collection Exception
        try {
            instance.find(0).equals(entry1);
            
        } catch (EmptyCollectionException ex) {
            assertTrue(ex instanceof EmptyCollectionException);
        }
        
        // Test for out of bounds error
        instance.add(entry1);
        try {
            instance.find(-1);
        } catch (IndexOutOfBoundsException ex) {
            assertTrue(ex instanceof IndexOutOfBoundsException);
        } catch (EmptyCollectionException ex) {
            fail();
        }
        
        // Test for finding element
        try {
            assertTrue(instance.find(0).equals(entry1));
        } catch (IndexOutOfBoundsException ex) {
            fail();
        } catch (EmptyCollectionException ex) {
            fail();
        }
    }

    /**
     * Test of indexOf method, of class ShoppingArrayList.
     */
    @Test
    public void testIndexOf() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        Grocery entry3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);
        
        instance.add(entry1);
        instance.add(entry2);
        
        //test for not finding an element
        try {
            instance.indexOf(entry3);
        } catch (ElementNotFoundException ex) {
            assertTrue(ex instanceof ElementNotFoundException);
        }
        
        // Test for finding the index
        try {
            assertEquals(instance.indexOf(entry2), 1);            
        } catch (ElementNotFoundException ex) {
            fail();
        }
    }

    /**
     * Test of contains method, of class ShoppingArrayList.
     */
    @Test
    public void testContains() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);

        // Test element does not exist case
        assertFalse(instance.contains(entry1));

        instance.add(entry1);

        // Test element exists case
        assertTrue(instance.contains(entry1));
    }

    /**
     * Test of size method, of class ShoppingArrayList.
     */
    @Test
    public void testSize() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);

        assertEquals(0, instance.size());

        instance.add(entry1);

        // Test increment
        assertEquals(1, instance.size());

        assertTrue(instance.remove(entry1));

        // Test decrement
        assertEquals(0, instance.size());
    }

    /**
     * Test of isEmpty method, of class ShoppingArrayList.
     */
    @Test
    public void testIsEmpty() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);

        // Test empty
        assertTrue(instance.isEmpty());

        instance.add(entry1);

        // Test not empty
        assertFalse(instance.isEmpty());
    }

}

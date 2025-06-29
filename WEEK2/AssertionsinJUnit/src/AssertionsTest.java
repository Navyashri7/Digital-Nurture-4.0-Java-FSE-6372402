package WEEK2.AssertionsinJUnit.src;
import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {




        @Test
        public void testAssertions() {
            // Assert equals: 2 + 3 = 5
            assertEquals(5, 2 + 3);

            // Assert true: condition is true
            assertTrue(5 > 3);

            // Assert false: condition is false
            assertFalse(5 < 3);

            // Assert null: value is null
            assertNull(null);

            // Assert not null: object is not null
            assertNotNull(new Object());
        }

}

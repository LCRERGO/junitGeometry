import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PointTest {
    Point p1, p2;

    @BeforeEach
    public void initializePoints() {
        p1 = new Point();
        p2 = new Point();
    }

    @Test
    public void distanceBetweenPoints() {
        p1.setPoint(0, 0);
        p2.setPoint(0, 5);
        assertEquals(5, p1.distance(p2), 0f);
    }

    @Test
    public void distanceSamePoint() {
        p1.setPoint(0, 0);
        assertEquals(0, p1.distance(p1), 0f);
    }

    @Test
    public void testNull() {
        Point p3 = null;
        assertThrows(NullPointerException.class,
                () ->  {assertEquals(0, p1.distance(p3), 0f);});
        //fail("should not get here...");
    }

    @Test
    public void testAbc() {
        try {
            p1.abc();
        } catch (Exception e) {
            if (!(e instanceof NullPointerException)) {
                fail("incorrect exception thrown!");
            }
        }
    }
}

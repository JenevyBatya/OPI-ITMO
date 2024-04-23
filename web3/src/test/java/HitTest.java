
import com.lab3.web3.models.Hit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class HitTest {

    public HitTest(){

    }

    @Test
    public void testCheckPointInCircleQuarter() {
        // Точка внутри четверти круга
        Hit hit = new Hit(0.5, BigDecimal.valueOf(0.5), 1.5f);
        hit.checkPoint();
        assertTrue(hit.getResult(), "Point should be inside the quarter circle");
    }

    @Test
    public void testCheckPointInSquare() {
        // Точка внутри квадрата
        Hit hit = new Hit(-1, BigDecimal.valueOf(-1), 2.0f);
        hit.checkPoint();
        assertTrue(hit.getResult(), "Point should be inside the square");
    }

    @Test
    public void testCheckPointOutside() {
        // Точка вне всех областей
        Hit hit = new Hit(2, BigDecimal.valueOf(2), 1.5f);
        hit.checkPoint();
        assertFalse(hit.getResult(), "Point should be outside all areas");
    }
}

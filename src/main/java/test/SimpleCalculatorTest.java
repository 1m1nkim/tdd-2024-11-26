package test;

import com.program.SimpleCalculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class SimpleCalculatorTest {
    SimpleCalculator simpleCalculator = new SimpleCalculator();
    @Test
    @DisplayName("20 + 10 = 30")
    public void testPlus(){
        int rs = simpleCalculator.plus(20, 10);

        assertEquals(30, rs); //expected 기대값
    }
    @Test
    public void testMinus(){
        int rs = simpleCalculator.minus(20, 10);

        assertEquals(10, rs); //expected 기대값
    }
    @Test
    public void testMul(){
        int rs = simpleCalculator.mul(20, 10);

        assertEquals(200, rs); //expected 기대값
    }
    @Test
    public void testDivide(){
        int rs = simpleCalculator.divide(20, 10);

        assertEquals(2, rs); //expected 기대값
    }


    @Test
    public void testReminder() {
        int rs = simpleCalculator.reminder(20, 10);

        assertEquals(0, rs); //expected 기대값
        //assertThat(rs).isEqualTo(30);
    }
}

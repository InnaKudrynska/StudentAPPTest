import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void checkSummPositive () {
        int a = 25;
        int b = 46;
        int result = 71;
        assertEquals (result, Calculator.summ(a,b));
    }

}

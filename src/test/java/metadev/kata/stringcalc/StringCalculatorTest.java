package metadev.kata.stringcalc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class StringCalculatorTest {

    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate(""), 0);
    }
    @Test
    public void oneNumberShouldReturnItseft() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("3"), 3);
    }
    @Test
    public void twoNumbersShouldBeAdded() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("2,5"), 7);
    }
    @Test
    public void moreDigitsSupported() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("22,55"), 77);
    }

}

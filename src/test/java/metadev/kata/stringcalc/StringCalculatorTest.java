package metadev.kata.stringcalc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class StringCalculatorTest {

    // p1  ----------------
    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculator sut = new StringCalculator();
        assertEquals(0, sut.calculate(""));
    }
    @Test
    public void oneNumberShouldReturnItseft() {
        StringCalculator sut = new StringCalculator();
        assertEquals(3, sut.calculate("3"));
    }
    @Test
    public void twoNumbersShouldBeAdded() {
        StringCalculator sut = new StringCalculator();
        assertEquals(7, sut.calculate("2,5"));
    }
    @Test
    public void moreDigitsSupported() {
        StringCalculator sut = new StringCalculator();
        assertEquals(77, sut.calculate("22,55"));
    }
    // p2  ----------------
    @Test
    public void allowNnumersAsInput() {
        StringCalculator sut = new StringCalculator();
        assertEquals(45, sut.calculate("1,2,3,4,5,6,7,8,9"));
    }
    // p3 ------------------
    @Test
    public void supportNewLineAsSeparator() {
        StringCalculator sut = new StringCalculator();
        assertEquals(6, sut.calculate("1\n2,3"));
    }
    // p3 ------------------
    @Test
    public void supportForCustomDelimiter() {
        StringCalculator sut = new StringCalculator();
        assertEquals(10, sut.calculate(";\n1;2;3;4"));
    }
    
    // p4 ------------------
    @Test
    public void negativeNotSupported() {
        StringCalculator sut = new StringCalculator();
        try {
            sut.calculate("-1;4");
            fail("exception should have been thrown");
        }
        catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed -1", e.getMessage());
        }
    }
}

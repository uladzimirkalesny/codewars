package multiply;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(new Double(4.0), Multiply.multiply(2.0, 2.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomethingWithThrowIllegalArgumentExceptionWhenOneParameterHaveNullableValue() {
        assertEquals(new Double(4.0), Multiply.multiply(null, 2.0));
    }
}

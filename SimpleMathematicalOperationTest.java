package myMavenProjectPackage3;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains test cases for the SimpleMathematicalOperation class 
 * to validate the correctness of mathematical operations.
 */
public class SimpleMathematicalOperationTest {

    /**
     * Test case to validate the mathematical operations using the first set of inputs.
     * This test uses assertions to verify the expected output matches the actual output.
     */
    @SuppressWarnings("static-access")
    @Test
    public void testOperation1() {
        // Create an instance of SimpleMathematicalOperation
        SimpleMathematicalOperation operation = new SimpleMathematicalOperation();

        // Validate addition operation with inputs 5 and 3
        Assert.assertEquals(8, operation.add(5, 3));

        // Validate subtraction operation with inputs 67 and 18
        Assert.assertEquals(49, operation.sub(67, 18));

        // Validate multiplication operation with inputs 13 and 12
        Assert.assertEquals(156, operation.mul(13, 12));

        // Validate division operation with inputs 9 and 4.5
        Assert.assertEquals(2.0, operation.div(9, 4.5));
    }

    /**
     * Test case to validate the mathematical operations using the second set of inputs.
     * This test uses assertions to verify the expected output matches the actual output.
     */
    @SuppressWarnings("static-access")
    @Test
    public void testOperation2() {
        // Create an instance of SimpleMathematicalOperation
        SimpleMathematicalOperation operation = new SimpleMathematicalOperation();

        // Validate addition operation with inputs 15 and 25
        Assert.assertEquals(40, operation.add(15, 25));

        // Validate subtraction operation with inputs 90 and 45
        Assert.assertEquals(45, operation.sub(90, 45));

        // Validate multiplication operation with inputs 7 and 8
        Assert.assertEquals(56, operation.mul(7, 8));

        // Validate division operation with inputs 50 and 10
        Assert.assertEquals(5.0, operation.div(50, 10));
    }
}

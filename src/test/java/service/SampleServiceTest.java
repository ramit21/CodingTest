package service;

import model.SampleModel;
import org.junit.Assert;
import org.junit.Test;

public class SampleServiceTest {

    @Test
    public void testSampleService() {
        SampleModel model = new SampleService().getMessage();
        Assert.assertEquals(model.getMessage(), "Hello World");
    }

    @Test
    public void testNegativeNumberThrowsException() {
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class,  () -> {
            new SampleService().squarePositiveNumber(-1);
        });
        Assert.assertEquals("Invalid value for number", exception.getMessage());
    }
}

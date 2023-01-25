import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBase {

    @Test
    public void validateHelloWorld(){
        String testString = "Hello World!";
        Assert.assertEquals(testString, "Hello World!", "Test string did not match.");
    }
}

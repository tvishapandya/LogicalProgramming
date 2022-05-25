import junit.framework.Assert;
import org.junit.Test;

public class fizzBuzzTest {

    @Test
    public void fizzBuzzFunction() {
        fizzBuzz fizBuz = new fizzBuzz();
        String fizzStr = fizBuz.fizzBuzzMethod(5);
        System.out.println(fizzStr);
        Assert.assertEquals("Buzz",fizzStr);
    }
}

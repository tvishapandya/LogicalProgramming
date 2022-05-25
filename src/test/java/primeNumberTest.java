import junit.framework.Assert;
import org.junit.Test;

public class primeNumberTest {

    @Test
    public void primeNumberMethod(){

        primeNumber prime = new primeNumber();
        int f = prime.checkPrimeNumberMethod(7);
        Assert.assertEquals(0,f);
    }
}
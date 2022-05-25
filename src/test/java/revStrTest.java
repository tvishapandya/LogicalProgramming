import junit.framework.Assert;
import org.junit.Test;

public class revStrTest {

    @Test
    public void revStringMethod(){
        reverseString revStr = new reverseString();
        String revString = revStr.reverseStringMethod("Test");
        Assert.assertEquals("tseT", revString);
    }
}

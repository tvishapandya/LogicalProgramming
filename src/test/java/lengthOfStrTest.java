import junit.framework.Assert;
import org.junit.Test;

public class lengthOfStrTest {

    @Test
    public void checkLengthOfStr(){

        lengthOfStr lStr = new lengthOfStr();
        int lenStr = lStr.lengthOfStrMethod("test200");
        Assert.assertEquals(7,lenStr);
    }
}

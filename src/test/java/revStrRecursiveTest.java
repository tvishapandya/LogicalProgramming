import jdk.jfr.Frequency;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class revStrRecursiveTest {

    @Test
    public void revStrRecursiveMethod(){

        revStringRecursion revStrRecurObj = new revStringRecursion();
        String str = "Good";
        StringBuilder strrev = new StringBuilder(str);
        strrev.reverse();
        int i = str.length();
        char[] revArray = new char[i];
        revArray = revStrRecurObj.revStrRecursion(str, i, revArray);
        Assert.assertEquals(strrev.toString(), new String(revArray));
    }
}

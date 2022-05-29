import org.junit.Test;

public class largeNumberTest {

    @Test
    public void checkLargeNumber(){

        largestNumber lrgNumber = new largestNumber();
        int[] myArray = {2,9,3,90,45};
        int lrgstNum = lrgNumber.largestNumberMethod(myArray);
        System.out.println("Largest Number is:" + lrgstNum);
    }
}
import java.util.Arrays;

public class largestNumber {

    public int largestNumberMethod(int[] elements){

        Arrays.sort(elements);
        int largeNum = elements[elements.length - 1];

        return largeNum;
    }
}

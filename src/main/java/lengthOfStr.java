public class lengthOfStr {

    public int lengthOfStrMethod(String str) {
        char[] strArray = str.toCharArray();
        int i = 0;
        for(char ch:strArray) {
                i = i + 1;
        }
        return (i);
    }

}
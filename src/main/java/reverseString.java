
public class reverseString {

    public String reverseStringMethod(String str){
        StringBuilder strbuilder = new StringBuilder(str);
        strbuilder.reverse();
        System.out.println(strbuilder);
        return strbuilder.toString();
    }
}

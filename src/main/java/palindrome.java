
public class palindrome {

    public void palindromMethod(String str){

        StringBuilder strbuilder = new StringBuilder(str);
        strbuilder.reverse();
        System.out.println(str + " " + strbuilder);
        if (str.equals(strbuilder.toString())) {
            System.out.println("number is Palindrome");
        }
        else {
            System.out.println("number is not Palindrome");
        }
    }
}

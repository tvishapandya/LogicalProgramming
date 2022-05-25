import java.util.ArrayList;

public class revStringRecursion {
    int j = 0;
    public char[] revStrRecursion(String str,int i, char[] revArray){
        char[] strArray = str.toCharArray();

        if(i>0)
        {
            revArray[j] = strArray[i-1];
            System.out.print(revArray[j]);
            i--;
            j++;
            str = str.substring(0,i);
            revStrRecursion(str,i,revArray);
        }
        return revArray;
    }

}

import java.util.Arrays;

public class revOrderSentence {

    public void revOrderStnceMethod(String sentence){

        String[] new_sentence = sentence.split(" ");
        for(int i = new_sentence.length-1; i >= 0; i--) {
            System.out.print(new_sentence[i] + " ");
        }
    }
}

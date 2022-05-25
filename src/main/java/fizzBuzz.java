public class fizzBuzz {

    public String fizzBuzzMethod(int n){

        if (n%15 == 0){
            return ("Fizz-Buzz");
        }
        else if (n%3 == 0){
            return ("Fizz");
        }
        else if (n%5 == 0){
            return ("Buzz");
        }
        else{
            return (Integer.toString(n));
        }
    }
}

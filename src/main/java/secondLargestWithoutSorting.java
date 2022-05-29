public class secondLargestWithoutSorting {

    public static void main(String[] args) {

        int[] myArray = {40, 10, 20, 50, 70};

        for(int i =0; i < myArray.length; i++){

            for(int j = i+1; j<myArray.length;j++){

                if(myArray[i]>myArray[j]){
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

            System.out.println(myArray[(myArray.length)-2]);
        }
    }

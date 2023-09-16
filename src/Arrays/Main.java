package Arrays;

import java.util.Arrays;
import java.util.Random;

/*
Create a program using arrays,  that sorts a list of integers,
in descending order.  Descending order  means from the highest value to lowest.
In other words, if the array has the values  50, 25, 80, 5, and 15, your program should
return an array, with the values in the  descending order: 80, 50, 25, 15,  and 5.
First, create an array of  randomly generated integers.
*/
public class Main {
    public static void main(String[] args) {
        int[] unsortedArray= getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortIntegers(unsortedArray)));
    }

    public static int[] getRandomArray(int len){
        Random random= new Random();
        int[] randomArray= new int[len];
        for (int i=0;i<len;i++){
            randomArray[i]=random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag=false;
            for (int i=0;i<sortedArray.length-1;i++) {
                if( sortedArray[i]< sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]= temp;
                    flag=true;
                }

            }
        }
        return sortedArray;
    }
}

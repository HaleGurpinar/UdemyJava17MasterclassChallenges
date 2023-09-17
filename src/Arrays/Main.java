package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Create a program using arrays,  that sorts a list of integers,
in descending order.  Descending order  means from the highest value to lowest.
In other words, if the array has the values  50, 25, 80, 5, and 15, your program should
return an array, with the values in the  descending order: 80, 50, 25, 15,  and 5.
First, create an array of  randomly generated integers.

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
*/
//-------------------------------------------------------------------------------------------------------------------------------

/*
This is the MINIMUM ELEMENT CHALLENGE. Here is what you need to do:
Write a method called readIntegers, that reads a comma delimited list of numbers, entered by
the user from the console, and then returns an array, containing those numbers that were entered.
Next, write a method called findMin, that takes the array as an argument, and returns the minimum
value found in that array. In the main method Call the method readIntegers, to get the array
of integers from the user, and print these out, using a method found in java.util.Arrays. ; Next,
call the findMin method, passing the array, returned from the call to the readIntegers method.
Print the minimum element in the array, which should be returned from the findMin method.
A tip here. Assume that the user will only enter numbers - so you don't need
to do any validation for the console input.

public class Main {
    public static void main(String[] args) {
    int [] returnedArray= readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        System.out.println("Min: "+(findMin(returnedArray)));
    }

    private static int[] readIntegers(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a list of numbers, seperated by commas:");
        String input=scanner.nextLine();

        String[] splits= input.split(",");
        int[] values = new int[splits.length];
        for (int i=0; i<splits.length;i++){
            values[i]= Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array){
    int min=Integer.MAX_VALUE;
        for (int el:array) {
            if (el<min){
                min=el;
            }
        }
    return min;
    }
}
 */

//-------------REVERSE ARRAY--COULD USE reverseCopy() method----------------------
public class Main {
    public static void main(String[] args) {

        int[] array={12,25,5,84,36};
        int[] array2={37,81,17,56,3};
        System.out.println("Array-->"+Arrays.toString(array));
        reverse(array);
        System.out.println("Array-->"+Arrays.toString(array2));
        System.out.println("Reversed Array2-->"+Arrays.toString(reverseCopy(array2)));

    }
    public static void reverse(int[] array){
        int maxIndex= array.length-1;
        int halfLength= array.length/2;
        for (int i=0;i<halfLength;i++){
        int temp= array[i];
        array[i]=array[maxIndex-i];
        array[maxIndex-i]= temp;

        }
        System.out.println("Reversed Array-->"+ Arrays.toString(array));
    }

    private static int[] reverseCopy(int[] array){
        int[] reversedArray= new int[array.length];
        int maxInddex= array.length-1;
        for (int el:array) {
            reversedArray[maxInddex--]=el;
        }
        return reversedArray;
    }
    }


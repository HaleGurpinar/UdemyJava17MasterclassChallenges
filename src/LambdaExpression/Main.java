package LambdaExpression;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };


        Consumer<String> printWordsLambda= sentence -> {
            String[] parts= sentence.split(" ");
            for (String part: parts){
                System.out.println(part);
            }
        };

        Consumer<String> printWordsForEach= sentence -> {
            String[] parts= sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        Consumer<String> printWordsBestCase= sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printWordsLambda.accept("Lets split this up into an array");
        printWordsForEach.accept("Lets split this up into an array");
        printWordsBestCase.accept("Lets split this up into an array");


        UnaryOperator<String> everySecondChar= source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i=0; i<source.length();i++){
                if (i%2==1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();

        };

        System.out.println(everySecondChar.apply("1234567890"));


        String result= everySecondChar(everySecondChar,"1234567890");
        System.out.println(result);

        Supplier<String > iLoveJava = () -> "I love Java";
        System.out.println(iLoveJava.get());

    }

    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for (int i=0; i<source.length();i++){
            if (i%2==1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondChar(Function<String,String> func,
                                         String source){
        return func.apply(source);
    }
}

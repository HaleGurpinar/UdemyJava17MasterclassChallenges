package List.ArrayListChallenge;

import java.util.Scanner;
import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceryList = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 0 -> flag = false;
                case 1 -> addItem(groceryList);
                case 2 -> removeItem(groceryList);
                default -> flag = true;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    public static void addItem(ArrayList<String> grocery) {
        System.out.println("Add item(s) [separate items by comma]: ");
        String[] items= scanner.nextLine().split(",");
        //grocery.addAll(List.of(items));
        for (String i : items){
            String trimmed = i.trim();
            if (grocery.indexOf(trimmed)< 0){
                grocery.add(trimmed);
            }
        }
    }

    public static void removeItem(ArrayList<String> grocery) {
        System.out.println("Delete item(s) [separate items by comma]: ");
        String[] items= scanner.nextLine().split(",");
        for (String i : items){
            String trimmed = i.trim();
            grocery.remove(trimmed);
        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                                 0 - Shutdown
                                 1 - Add item(s) to list (comma delimited)
                                 2 - Remove item(s) (comma delimited)
                                 Enter a number of you choice:""";
        System.out.print(textBlock + " ");
    }
}



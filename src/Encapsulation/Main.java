package Encapsulation;


public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count: " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.println("Total printer pages count: " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(4);
        System.out.println("Total printer pages count: " + printer.getPagesPrinted());

    }
}

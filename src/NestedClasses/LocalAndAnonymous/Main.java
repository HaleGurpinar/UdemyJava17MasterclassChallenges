package NestedClasses.LocalAndAnonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Minnie","Mouse","01/02/2015");
        Employee e2 = new Employee("Minnie","Mouse","05/08/2000");
        Employee e3 = new Employee("Daffy","Duck","11/02/2011");
        Employee e4 = new Employee("Daisy","Duck","05/02/2013");
        Employee e5 = new Employee("Goofy","Dog","23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));

    }
}

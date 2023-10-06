// 2.b Create a class called Main with a main method.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

// 2.g In the main method create a new instance of the Cafe class and call its loadMenuData() -method.

    Cafe kaf = new Cafe();

    kaf.loadMenuData();

// 2.h Still in the main method, print all the elements of the attribute coffeeMenu of the Cafe instance you just created.
    kaf.printMenu();
    
    }
}
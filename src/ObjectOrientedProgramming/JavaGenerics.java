package ObjectOrientedProgramming;

import java.lang.reflect.Method;

/**
 * Created by William Morgan on 7/12/17.
 * Created at 3:26 PM.
 */

class Printer {
    public static < E > void printArray(E [] inputArray) {
        for(E element: inputArray) {
            System.out.println(element);
        }
    }
}

public class JavaGenerics {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}

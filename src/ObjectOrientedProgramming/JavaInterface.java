package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by William Morgan on 7/13/17.
 * Created at 9:52 AM.
 */
interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = n;

        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

public class JavaInterface {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    private static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}

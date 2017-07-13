package ObjectOrientedProgramming;

/**
 * Created by William Morgan on 7/13/17.
 * Created at 9:42 AM.
 */

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

public class JavaInheritance1 {

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}

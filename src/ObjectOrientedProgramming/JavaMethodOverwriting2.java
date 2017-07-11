package ObjectOrientedProgramming;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 3:49 PM.
 */

class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is "+ temp );
    }
}

public class JavaMethodOverwriting2 {

    public static void main(String []args){
        MotorCycle M = new MotorCycle();
    }
}

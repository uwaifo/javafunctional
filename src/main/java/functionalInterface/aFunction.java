package functionalInterface;

import java.util.function.Function;

public class aFunction {
    public static void main(String[] args) {

        int increment = increment(1);
        System.out.println(increment);
        //
       int callBetter = incrementBetter.apply(1);
        System.out.println(callBetter);

    }

    //the bellow can either be in the main method or be made static outside the method but in the class
    static Function<Integer, Integer> incrementBetter = numberArg -> numberArg + 1;


    //normal function
    static int increment(int number) {
        return number + 1;
    }
}

package functionalInterface.mine;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        System.out.print("Normal function : ");
        System.out.println("N"+ dollarToNaira(100));

        System.out.print("Interface function : ");
        Float newMoney = nairaToDolar.apply((float) 100.00);
        System.out.println("N" + newMoney);



    }

    static Function<Float, Float> nairaToDolar = ammount -> ammount / 350;

    static int dollarToNaira(Integer ammount) {
        return ammount * 350;
    }
}

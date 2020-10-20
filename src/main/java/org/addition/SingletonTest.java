package org.addition;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("Hello");
        Singleton second = Singleton.getInstance("Bye"); //значение не изменится

        System.out.println(first == second);
        System.out.println(first.getValue());
        System.out.println(second.getValue());
    }
}

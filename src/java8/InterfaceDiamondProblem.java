package java8;

public class InterfaceDiamondProblem implements InterfaceDiamondProblemA, InterfaceDiamondProblemB{

    /*This is to avoid diamond problem in java.
    We need to implement this method if a class implements moer than one interface and it has default methods.*/
    public void m1() {
        // This is default implementation
        System.out.println("Main class m1 method");

        //If we want interface A method to execute
        InterfaceDiamondProblemA.super.m1();

        //If we want interface B method to execute
        InterfaceDiamondProblemB.super.m1();
    }

    public static void main(String[] args) {

        InterfaceDiamondProblem obj = new InterfaceDiamondProblem();
        obj.m1();

        // Calling static method of Interface
        InterfaceDiamondProblemA.m2();

        // Static method of Interface is not directly available to implemented class
        // Have to call this method using Interface name only.

        /*InterfaceDiamondProblem.m2();
        m2();
        InterfaceDiamondProblem obj1 = new InterfaceDiamondProblem();
        obj1.m2();*/
    }
}

interface InterfaceDiamondProblemA {
    default void m1() {
        System.out.println("Interface 1 method");
    }

    // Can't write any method in interface using default keyword which are already present in Object class
    /*default int hashCode() {
        return 1;
    }*/

    static void m2() {
        System.out.println("static method called");
    }
}

interface InterfaceDiamondProblemB {
    default void m1() {
        System.out.println("Interface 2 method");
    }
}
package java8;


interface A {
    void show();
    //void hide();
}

/*class Aimp implements A {

    @Override
    public void show() {
        System.out.println("Show called");
    }
}*/

public class LambdaDemo {

    public static void main(String[] args) {

        //Using implemented class
        /*A obj1 = new Aimp();
        obj1.show();*/

        //Using Anonymous inner class
        A obj2 = new A() {
            public void show() {
                System.out.println("show called via Anonymous inner class");
            }

            //If we have multiple methoids in interface then provide implementation for all.
            /*public void hide () {
                System.out.println("Inside hide method");
            }*/
        };
        obj2.show();
        //obj2.hide();

        //Using lambda expression
        A obj3 = () -> System.out.println("show called via Lambda expression");
        obj3.show();

        /*
        Important : The functional interface also known as Single Abstract Method Interface was introduced to facilitate Lambda functions.
        Since a lambda function can only provide the implementation for 1 method it is mandatory for the functional interface to have ONLY one abstract method.
        
        Writing Lambda expression meaning we are implementing the interface that is functional interface.
        It should have one abstract method because at the time of lambda expression, we can provide only one implementation at once.
        So in the code snippet posted in the question,
        at any time we are giving only one implementation while declaring Lambda where we will have to implement for two abstract methods.*/
    }
}

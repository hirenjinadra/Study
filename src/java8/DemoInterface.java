package java8;

class iPhone implements Phone{

    @Override
    public void call() {
        System.out.println("Calling from iPhone");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        Phone obj = new iPhone();
        obj.call();
        obj.message();
    }
}

interface Phone {
    void call();
    default void message() {
        System.out.println("Messaging from iPhone");
    }
}

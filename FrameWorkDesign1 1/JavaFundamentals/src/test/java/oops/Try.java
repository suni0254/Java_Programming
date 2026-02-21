package oops;

public interface Try {
    default void greet() {
        System.out.println("default method");
    }
}

interface extending extends Try {
    default void sayHello() {
        System.out.println("Hello");
    }
}

class Hi implements Try, extending {
    public void sayHello() {

    }
}
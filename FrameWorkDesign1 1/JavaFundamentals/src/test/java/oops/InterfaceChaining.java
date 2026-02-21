package oops;

public interface InterfaceChaining {
    public static void main(String[] args) {
        D d = new D();
        d.greet();
    }
}

interface A {
    default void greet() {
        System.out.println("Greet from A");
    }
}

interface B extends A {
    default void greet() {
        A.super.greet();
        System.out.println("Greet from B");
    }
}

interface C extends B {
    default void greet() {
        System.out.println("Greet from C");
        B.super.greet();
    }
}

class D implements A, B, C {
    static {
        System.out.println("Static variable");
    }
    public void greet() {
        C.super.greet();
        System.out.println("Greet from D");
    }
}



package oops;

public class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }

    void showMessage() {
        System.out.println("Message from parents");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor called");
    }

    void showMessage() {
        System.out.println("Message from child");
    }
}

class MainMethod {
    public static void main(String[] args) {
        Parent p = new Child();
        p.showMessage();
    }
}

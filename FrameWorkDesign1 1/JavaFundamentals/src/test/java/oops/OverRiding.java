package oops;

public class OverRiding {
    String vehicle;
    int riders;

    OverRiding(int riders, String ride) {
        this.vehicle = ride;
        this.riders = riders;
        System.out.println("Parent constructor called " + ride + " " + riders);
    }

    void horseRiding() {
        System.out.println("Riding a horse");
    }

    void bikeRiding() {
        System.out.println("Riding a bike");
    }

    void cycleRiding() {
        System.out.println("Riding a cycle");
    }

    void flyHelo() {
        System.out.println("Flying a helicopter");
    }

    void numberOfRiders(int riders) {
        System.out.println(riders);
    }
}

class Drive extends OverRiding {
    Drive(int riders, String ride) {
        super(3, "bike");
        this.vehicle = ride;
        this.riders = riders;
        System.out.println("Child constructor called " + ride + " " + riders);
    }
}

//class Fly extends Drive{
//    public static void main(String[] args) {
//        Fly fly = new Fly();
//    }
//    Fly() {
//        super(4, "Car");
//        this.riders = 4;
//        this.vehicle = "Helicopter";
//        System.out.println("sub Child constructor called " + vehicle + " " + riders);
//    }
//}

class ParentClass {
    private static class NestedClass {
        void innerClassMethod() {
            System.out.println("Nested class1 method called");
        }
    }

    void outerMethod() {
        System.out.println("Outer method called");
        NestedClass nc = new NestedClass();
        nc.innerClassMethod();
    }

    public class NestedClass2 {
        void innerClassMethod2() {
            System.out.println("Nested class2 method called");
        }
    }
}
class childClass extends ParentClass {
    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        pc.outerMethod();
        ParentClass.NestedClass2 pnc2 = pc.new NestedClass2();
        pnc2.innerClassMethod2();

    }
}


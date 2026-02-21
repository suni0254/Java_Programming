package oops;

public class OOPs {
    public static void main(String args[]) {
//        Student student = new Student();
//        student.name = "Imran";
//        student.id = 202210309;
//        student.role = "kali";
//
//        student.studentInfo();
//        Student student2 = new Student();
//        student2.id = 202210308;
//        student2.name = "Khan";
//        student2.studentInfo(student2.name);

        pen();
    }

    public static void pen() {

        Constructors constructors = new Constructors("cello", 10, "gel");

        constructors.name = "montex";
        constructors.type = "ballPoint";
        constructors.cost = 20;

        constructors.printInfo();
        new Constructors();

        Constructors constructors1 = new Constructors(constructors);
    }
}

class Student {
    String name;
    int id;
    String role;

    public void studentInfo() {
        System.out.println(this.name);
        System.out.println(this.id);
    }
    public void studentInfo(String name) {
        System.out.println(this.name);
        System.out.println(this.id);

    }
}

class Constructors {
    String name;
    int cost;
    String type;

    Constructors(String name, int cost, String type) {
        System.out.println("Parameterised Constructor called");
        System.out.println(this.name=name);
        System.out.println(this.cost=cost);
        System.out.println(this.type=type);
    }
    Constructors(){
        System.out.println("Non parameterised Constructor called");
    }

    Constructors(Constructors constructors) {
        System.out.println("Copy Constructor called");
        System.out.println(this.name = constructors.name);
        System.out.println(this.cost = constructors.cost);
        System.out.println(this.type = constructors.type);
    }

    public void printInfo() {
        System.out.println("printInfo called");
        System.out.println(this.name=name);
        System.out.println(this.cost=cost);
        System.out.println(this.type=type);
    }
}






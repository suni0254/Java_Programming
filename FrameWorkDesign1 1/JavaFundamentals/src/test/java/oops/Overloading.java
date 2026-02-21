package oops;

public class Overloading {
    int age;
    String name;
    Overloading(int age, String name){
        System.out.println("Parameterized constructor called");
        System.out.println(this.age=age);
        System.out.println(this.name= name);
    }
    Overloading(){}
    public void overLoading() {
        System.out.println("1");
    }
    public void overLoading(String name) {
        System.out.println(this.name = name);
        System.out.println("2");
    }
    public void overLoading(Overloading overloading) {
        System.out.println(this.age = overloading.age);
        System.out.println("3");
    }
    public void overLoading(String name, int age) {
        System.out.println("4");
    }
    public String overLoading(int age, String name) {
        System.out.println("5");
        return age + name;
    }

    public static void main(String[] args) {

        Overloading overloading = new Overloading();
        new Overloading(28, "imran");

        overloading.name = "Mohd";
        overloading.age = 29;

        overloading.overLoading(overloading);

        overloading.overLoading("Khan", overloading.age);
    }
}

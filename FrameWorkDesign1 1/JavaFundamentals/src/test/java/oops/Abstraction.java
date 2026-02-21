package oops;

public class Abstraction {
    public static void main(String[] args) {
        Tortoise t = new Tortoise("Tortoise");
        t.walk();
        t.eat();
    }
}

abstract class Animal {
    Animal(String animal){
        System.out.println(animal + " constructor created from Animal Constructor");
    }
    void walk(int legs) {
        System.out.println("Animal walk");
    }
    abstract void eat();
}

class Tiger extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
    Tiger(String animal) {
        super(animal);
        System.out.println(animal + " constructor created from Tiger Constructor");
    }
    void eat() {
        System.out.println("Carnivorous - " + "mammals");
    }
}

class Tortoise extends Tiger {
    Tortoise(String animal) {
        super(animal);
        System.out.println(animal + " constructor created from Tortoise Constructor");
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
    void eat() {
        System.out.println("Herbivorous - " + "Plants");
    }
}

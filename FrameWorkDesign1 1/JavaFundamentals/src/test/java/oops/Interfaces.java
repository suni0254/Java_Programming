package oops;

public interface Interfaces {
    public static void main(String[] args) {
        Cub c = new Cub();
        c.walks();
    }
}

abstract class Cheetah {
    void roars() {
        System.out.println("Cheetah roars");
    }
}

interface Animals {
    void walks();
    void eats();
}

interface Lion extends Animals {

    @Override
    default void walks() {
        System.out.println("walks on 4 legs");
    }

    default void eats(){
        System.out.println("Eat other animals");
    }
}

class Cub extends Cheetah implements Lion, Animals {
    public void walks() {
        System.out.println("walks on 4 legs");
    }
    public void eats() {
        System.out.println("Eat other animals, drink milk");
    }
}

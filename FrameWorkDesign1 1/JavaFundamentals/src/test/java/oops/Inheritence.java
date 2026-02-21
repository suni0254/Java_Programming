package oops;

public class Inheritence {

    String color;   //instance variable

    static int size;  //class variable

    static void area(int a, int b, int h) {  //class method
        System.out.println("Area of the given figure is " +  (a * b * h));
    }

    void shape() {} //instance method
}

class Triangle extends Inheritence{
    static void area(int a, int b, int h){

    }
}

class EquilateralTriangle extends Triangle {
    static void area(){}
}

class Main {
    public static void main(String[] args) {
        EquilateralTriangle.area();
    }
}

/*Parent Method	  Child Method	  Result	      Type
static	           static	      ✅ Compiles	  Method hiding
instance	       instance	      ✅ Compiles	  Overriding
static	           instance	      ❌ Error	      Illegal override
instance	       static	      ❌ Error	      Illegal override*/



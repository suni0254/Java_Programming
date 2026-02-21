package accessModifiers;

import oops.AccessModifiers;

public class SubClasses {

}
class ProtectedSubClass1 extends Protected{
    public void samePackage(String name) {
        System.out.println(this.protectedName = name);
    }
}

class ProtectedSubClass2 extends AccessModifiers {
    public void differentPackage(int size) {
        System.out.println(this.size = size);
    }
}

//class nonSubClass {
//    public void nonSubClassSamePackage() { //won't work
//        System.out.println(this.name = name);
//    }
//}

class defaultSubClass1 extends Default{
    public void samePackage(String name) {
        System.out.println(this.defaultName = name);   //same package
    }
}

//class defaultSubClass2 extends AccessModifiers{
//    public void differentPackage(String name) {
//        System.out.println(this.name1 = name);  //won't work different package
//    }
//}



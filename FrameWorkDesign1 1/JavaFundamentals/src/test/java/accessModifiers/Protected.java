package accessModifiers;

public class Protected {

    protected String protectedName;

    public void sameClassSamePackage() {
        System.out.println(protectedName);
    }
}

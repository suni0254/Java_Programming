package oops;

public class AccessModifiers {

    public String color;
    private String name;
    protected int size;
    String name1;
    float height;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name =  name;
    }
}

class Details extends AccessModifiers{
    public void details(int size, float height, String color, String name) {
        this.size = size;
        this.height = height;
        this.color = color;

        setName(name);
        System.out.println(getName());
    }
}

class Mains{
    public static void main(String[] args) {
        Details det = new Details();
        det.details(4, 5.5f, "White", "Tiger");
    }
}

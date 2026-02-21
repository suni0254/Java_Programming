package collections;
import java.util.ArrayList;

public class AL{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(7);

        System.out.println(list);

        System.out.println(list.get(2));

        list.set(3, 10);

        list.remove(1);

        System.out.println(list.size());

        for(int i : list) {
            System.out.print(i + " " );
        }
    }
}

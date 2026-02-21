package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HS {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(4);
        hs.add(3);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);

        System.out.println(hs.size());

        hs.remove(3);

        System.out.println(hs.contains(3));

        System.out.println(hs.add(9));



         Iterator<Integer> it = hs.iterator();

//        while (it.hasNext()) {
//            it.next();
//            it.remove();
//        }

        for (Integer i : hs) {
            System.out.print(i + " ");
        }
        hs.clear();

        System.out.println("\n" + hs.add(1));

        System.out.println(hs.size());
    }
}


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add element in array list
        list.add(9);
        list.add(6);
        list.add(7);
        list.add(2);
        System.out.println(list);
        // get element
        System.out.println(list.get(2));
        // delite
        list.remove(1);
        System.out.println(list);
        // set
        list.add(1, 4);
        System.out.println(list);
        // sorting
        Collections.sort(list);
        System.out.println(list);
        // sizs of array list
        System.out.println(list.size());
        // itration or loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }
}

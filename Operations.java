
import java.util.ArrayList;

public class Operations {

    public static void main(String args[]) {
        //Classname objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //add: O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //adding a value at a specified index: O(n)
        list.add(1, 9);

        System.out.println(list);

        //Get operation
        // int element = list.get(2);
        // System.out.println(element);
        //Delete:- delete the value of particular index
        // list.remove(2);
        // System.out.println(list);
        //Set :- sets the value at the specified index
        // list.set(2,10);
        // System.out.println(list);
        //contains :- check wheather the element present in the list or not
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }

}

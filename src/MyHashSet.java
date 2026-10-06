import java.util.HashSet;

public class MyHashSet {


    static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(20);
        set.add(10);
        set.add(50);
        set.add(30);


        for (int val: set){
            System.out.println(val);
        }

        if (set.contains(40)){
            System.out.println("Element Found");
        }
        else {
            System.out.println("Not Found");
        }


        // set shallow copy

        //set = { 30, 50, 10, 60 }

        // set2 = deepCopy(set);

        // set2 = { 30, 50, 60 }
        // set2.remove(10)


    }



}

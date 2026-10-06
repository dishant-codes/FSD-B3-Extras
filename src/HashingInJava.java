import java.util.HashMap;

public class HashingInJava {


    static void main(String[] args) {


        // target = 20

        // 20
        // 45
        // 11
        // 34
        // Searching = O(n)

        // key = 0 -> 20
        // key = 5 -> 45
        // key = 1 -> 11
        // key = 4 -> 34
        // get(key) = get(0) -> 20
        // get(key) = get(4) -> 34
        // Searching = O(1)



        // Collision
        // "dishant" -> 4
        // "vishal"  -> 4


        String key = "Dishant";

        int rawHash = key.hashCode();

        String key2 = "Dish";

        int rawHash2 = key2.hashCode();

        System.out.println(rawHash +" : "+ rawHash2);


        // Login

        // password = dishant@123  -> hash 8567687734

        // input_password = dishant@12 -> hash 967897923

        // if( password_hash.equals(input_password_hash))



        // HashMap - > Node<Key, Value>[]


        HashMap<String, Integer> list = new HashMap();


        list.put("Dishant", 98);
        list.put("Vishal",99);
        list.put("Rafe",87);
        list.put("Ranveer",88);
        list.put("Ranjeet", 86);


        System.out.println(list.get("Rafe"));




        // Hashing - cannot reverse
           // passwords
        // Encryption - need secret key
           // End to End Encryption
           // HTTPS, chat messages
        // Encoding - reversible
           // email


    }

}

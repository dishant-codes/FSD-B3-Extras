import java.lang.*;

public class StringsPrograms {

    static void main(String[] args) {

        StringBuilder name = new StringBuilder("Dishant");

        name.append(" Aarak");

        System.out.println(name);

        System.out.println(name.toString().toUpperCase());

        StringBuilder sentance =new StringBuilder("Hello, My Name is Shubham");

        String[] words = sentance.toString().split(" ");

        System.out.println("Words in this sentence :"+words.length);

        for (String word: words){
            if (word.equals("Dishant")){
                System.out.println("Dishant Found");
            }
        }

        // String Builder   VS   String Buffer

        // not thread safe   :     thread safe
        // fast              :     slow
        // not synchronous   :     synchronous



    }

}

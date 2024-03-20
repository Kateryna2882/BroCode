import java.util.ArrayList;

public class ExampleForEach {
    public static void main(String[] args) {
//        for each = traversing technique to iterate through the elements in an array/collection
        // less step, more readable
//        less flexible

        String []animals = {"cat", "dog", "rat", "bird"};

        System.out.println(animals);   // [Ljava.lang.String;@3feba861

        ArrayList<String>animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("rat");
        animals2.add("bird");

        System.out.println(animals2);  // [cat, dog, rat, bird]
        for (String i : animals2){
            System.out.println(i);
        }


    }
}

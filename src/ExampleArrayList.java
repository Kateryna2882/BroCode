import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
//        ArrayList = a resizable arrAy
//        Elements can be added and removed after compilation phase
//        store reference data types
        ArrayList<String>food = new ArrayList<>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.set(0, "sushi");
        food.remove(2);
        food.clear();
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String>bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        ArrayList<String>produceList = new ArrayList<>();
        produceList.add("tomato");
        produceList.add("zucchini");
        produceList.add("peppers");
    }
}

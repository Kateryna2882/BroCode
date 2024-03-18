import java.util.ArrayList;

public class Example2DArrayList {
    public static void main(String[] args) {

ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("chess");
        System.out.println(bakeryList);
        System.out.println(bakeryList.get(1));

        ArrayList<String> productList = new ArrayList<>();
        productList.add("peppers");
        groceryList.add(bakeryList);
        groceryList.add(productList);
        System.out.println(groceryList);
    }
}
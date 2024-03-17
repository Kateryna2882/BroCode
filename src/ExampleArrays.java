public class ExampleArrays {
    public static void main(String[] args) {
        String[]cars = {"bvd", "id", "bmv"};
        cars[0] = "mustang";
        System.out.println(cars[2]);
        String[] duck = new String[3];
        duck[0] = "Duck";
        duck[1] = "Rubber";
        duck[2]= "Toy";
        for (int i = 0; i < duck.length; i++) {
            System.out.println(duck[i]);

        }
    }
}

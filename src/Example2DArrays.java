public class Example2DArrays {
    public static void main(String[] args) {
//        2D array = an array of arrays
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "BMW";
        cars[1][0] = "Mazda";
        cars[1][1] = "Mercedes";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Mustang";
        cars[2][1] = "Toyota";
        cars[2][2] = "BYD";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {

                System.out.println(cars[i][j] + " ");

            }
        }
    }
}

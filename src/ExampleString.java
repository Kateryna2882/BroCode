public class ExampleString {
    public static void main(String[] args) {
//        String a reference data type that can store one or more characters
//        reference data types have access to useful methods
        String name = "Bro";
        String name2 = "Kateryna";
        boolean result = name.equalsIgnoreCase("Bro");
        boolean result1 = name2.equals("kateryna");
        int result2 = name2.length();
        char result3 = name2.charAt(2);
        int result4 = name2.indexOf("a");
        boolean result5 = name2.isEmpty();
        String result6 = name2.toUpperCase();
        String result7 = name2.toLowerCase();
        String result8 = name2.trim();
        String result9 = name2.replace('r', 'm');
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
    }
}

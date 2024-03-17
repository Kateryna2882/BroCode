public class WrapperClass {
    public static void main(String[] args) {
        // wrapper class = provides a way to use primitive data types as reference data types
        // reference data types contain useful methods can be used with collections (ex. ArrayList)
        // primitive      //wrapper
        //__________      //--------
        //boolean         * Boolean
        // char           * Character
        // int            * Integer
        //double          * Double
        // autoboxing = the automatic conversion that the Java compiler makes the primitive
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double k = 28.11;
        String d = "Kateryna";
        if(a==true){
//        if(b=='@'){
            System.out.println("This is a true ");
        }
    }
}


/**
* making a class with private variables
 */
class a {
    private int pint = 9;
    /*or a method*/
    private int add(int b) {
        return b+b;
    }    
}
/**
 * private data methods and datapoints can only be accessed in the same class.
 * THe class and interface cannot be declared private.
 * private constructor cannot be used outside the class.
 */
public class class1 {
    public static void main(String[] args) {
        a objct = new a();
        System.out.println(objct.pint);
        System.out.println(objct.add(7));
    }    
}
/**
 * equalshi
 */
public class equalshi {

    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = new String("hi");

        System.out.println(s1 == s2);
        System.out.println("second decision is: " + (s1.equals(s2)));
    }
}
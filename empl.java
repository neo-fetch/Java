/**
 * Create an employee class
 * create 8 employee objects
 * print the employee whose salary is > 5000
*/

/**
 * creating empl class
 */
public class empl {
    int esal;
    int eroll;
    String ename;
    empl(int sal, int roll, String name)
    {
        esal = sal;
        eroll = roll;
        ename = name;
    }

    void display()
    {
        System.out.println("\nSalary: " + esal);
        System.out.println("\nroll: " + eroll);
        System.out.println("\nename: " + ename);
    }
    public static void main(String[] args) {
        empl e[] = new empl[8];
        e[0] = new empl(4500, 21231, "Dinesh S");
        e[1] = new empl(4300, 21232, "Koushal M");
        e[2] = new empl(5100, 21233, "Pawan C");
        e[3] = new empl(5200, 21234, "Neha R");
        e[4] = new empl(10000, 21235, "Prafulla");
        e[5] = new empl(9200, 21236, "Mayank");
        e[6] = new empl(9200, 21237, "Abhay");
        e[7] = new empl(9200, 21238, "Murtuza");
        
        System.out.println("\nSalaries > 5000: \n");
        for (empl i : e) {
            if (i.esal>5000) {
               i.display();
               System.out.println("\n\n\n"); 
            }
        }
    }

}
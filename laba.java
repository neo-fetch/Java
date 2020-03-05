import java.util.*;
class Token 
{
	public static void main(String[] args) 
	{
	System.out.println(args[0] + args[1]);
	}
}
class Inte
{
	public static void main(String[] args)
	{
	int number = 42;
	Integer n = new Integer(number);
	System.out.println(n.intValue());
	}

}

/**
 * laba
 */
class scanit 
{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		String b = inp.next();
		String c = inp.nextLine();
		System.out.print( a + b + c); 
	}	
}

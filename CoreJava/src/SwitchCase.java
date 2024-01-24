import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		a=sc.nextInt();
		System.out.println("Enter B");
		b=sc.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
		System.out.println("Enter Your choice");
		d=sc.nextInt();
		
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addtion "+c);
			break;
		
		case 2:
			c=a-b;
			System.out.println("Sub "+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiple "+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Div "+c);
			break;
	     
	    default:
	    	System.out.println("Invalid choice");
	    	break;
			
		}
		
		
	}
}


import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		int i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		i=sc.nextInt();
		
		do
		{
		
			sum = sum + i;
			
			i=i-1;
		}while(i>0);
		System.out.println("Sun "+sum);
	}

}

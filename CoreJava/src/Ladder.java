import java.util.Scanner;

public class Ladder {
	
public static void main(String[] args) {
		
		int rno,s1,s2,s3,total;
		String sname;
		double per;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student");
		sname=sc.next();
		
		System.out.println("Enter Roll number of student");
		rno=sc.nextInt();
		
		System.out.println("Enter marks of subnject 1");
		s1=sc.nextInt();
		
		System.out.println("Enter marks of subnject 2");
		s2=sc.nextInt();
		
		System.out.println("Enter marks of subnject 3");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Student Name " +sname);
		System.out.println("Roll No " +rno);
		System.out.println("Total " +total);
		System.out.println("Student Name " +per);
		
		if(per>=70)
		{
			System.out.println("Dist");
			
		}
		else if(per>=60)
		{
			System.out.println("First class");
			
		}
		else if(per>=50)
		{
			System.out.println("second");
			
		}
		else if(per>=40)
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
		
		}
		
		

}

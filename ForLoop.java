import java.util.Scanner;

public class ForLoop 
{
public static void main(String[] args)
{
	int r,n;
	Scanner c = new Scanner(System.in);
	
	System.out.print("Enter the range = ");
	r = c.nextInt();
	
	System.out.print("Enter the number = ");
	n = c.nextInt();
	
	System.out.print("The Multiplication table of " + n + " is \n");
	
	for(int i = 1;i<=r;i++)
	{
		System.out.println(n + "*" + i +"="+ i*n);
	}
	
	c.close();
	
}
}

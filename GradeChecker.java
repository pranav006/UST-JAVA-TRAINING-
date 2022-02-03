
import java.util.Scanner;

public class GradeChecker {
public static void main(String[] args)
{
	int mark, f=0;;
	
	Scanner c = new Scanner(System.in);
	
	System.out.print("Enter the Aggregate % = ");
	mark = c.nextInt();
	
	System.out.print("Enter the mark of Physics  = ");
	int p = c.nextInt();
	
	System.out.print("Enter the mark of Chemistry  = ");
	int ch = c.nextInt();
	
	System.out.print("Enter the mark of Mathematics  = ");
	int m = c.nextInt();
	
	
	
	if(mark>=90)
	{
		if(p>85 && ch>85 )
		{
			if(m>85)
			{
				System.out.print("Honours  awarded");
				f=1;
			}
			
		
		}
		
				 if(f==0)
		System.out.print("Honours not awarded");
	}
	else
		System.out.print("Honours not awarded");
	c.close();
}
}



public class DoWhile 
{
	public static void main(String[] args)
	{
		int num = 0;
		do
		{
			if(num%3==0)
			{
				num++;
				continue;
			}
			System.out.print(num++ + " ");
			
		}
			while(num<=10);
		
	}
}

 class Test 
{
int a;
public int b;
private int c;
 void setc(int i)
{
	c=i;
}
int getc()
{
	return c;
}
}
 class Access
{
	public static void main(String [] args)
	{
		Test Ob = new Test();
		Ob.a = 100;
//		Ob.c = 20;
		Ob.setc(100);
		System.out.println(Ob.a);
		System.out.println(Ob.getc());
		
	}}

	

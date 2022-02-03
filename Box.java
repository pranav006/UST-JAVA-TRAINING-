public class Box
{
	int l,b,h;
 Box(int l, int b , int h) 
{
	this.l = l;
	this.b = b;
	this.h = h;
}
	int volume()
	{
		return l*b*h;
	}
	
	public static void main(String[] args)
	{
		Box b1 = new Box(10,20,30);
		
		System.out.print("Volume = " + b1.volume());
				
	}

}

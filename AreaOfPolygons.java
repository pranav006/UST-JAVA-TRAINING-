import java.util.Scanner;

class Dimensions{
	void area(double r) 
	{
		double A = Math.PI*r*r;
		A=Math.round(A*1000.0)/1000.0;
		 System.out.println("Area of circle is = " + A  );
	}
	void area(int l, int b)
	{
		System.out.println("Area of rectangle is = " + l*b );
	}
	void area(int a, int b, int c) {
		float s = (a+b+c)/2;
		double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		A=Math.round(A*1000.0)/1000.0;
		System.out.println("Area of Triangle is = " + A );
	}
}
public class AreaOfPolygons {
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		Dimensions D = new Dimensions();
		System.out.print("Enter the radius = ");
		double r =c.nextDouble();
		D.area(r);
		
		System.out.print("Enter the length of rectangle  = ");
		int l=c.nextInt();
		System.out.print("Enter the breadth of rectangle  = ");
		int b=c.nextInt();
		D.area(l,b);
		
		System.out.print("Enter the dimesions of triangle   ");
		System.out.print("\nEnter a = ");
		int a1 = c.nextInt();
		
		System.out.print("Enter b = ");
		int b1 = c.nextInt();
		System.out.print("Enter c = ");
		int c1 = c.nextInt();
		
		D.area(a1,b1,c1);
		c.close();

}}

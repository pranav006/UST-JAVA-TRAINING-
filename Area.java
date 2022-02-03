import java.util.Scanner;

class Circle
{
	double r;
	Circle(double r)
	{
		this.r=r;
	}


	double AreaOfCircle()
{
double a= 2*(22/7);
return a*r*r;	
}
	
	class Rectangle
	{
		int l,b;
		Rectangle(int l,int b)
		{
			this.l=l;
			this.b=b;
		}
	
	
	int AreaOfRectangle()
	{
		return l*b;
	}
	}
class Triangle
{
	int s,a,b,c;
	Triangle(int a, int b, int c)
	{
		this.s=s;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double AreaofTriangle()
	{
		s = (a+b+c)/2;
		double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return A;
	}
}
	
	
public class Area
{
public static void main(String[] args)
{
	Scanner c = new Scanner(System.in);
	
	System.out.print("Enter the radius = ");
	double r =c.nextDouble();
	Circle C = new Circle(r);
	
	System.out.print("Area of Circle is " + C.AreaOfCircle());
	
	System.out.print("Enter the length of rectangle  = ");
	int l=c.nextInt();
	
	System.out.print("Enter the breadth of rectangle  = ");
	int b=c.nextInt();
	
	Rectangle R= new Rectangle(l,b);
	
	System.out.print("Area of rectangle  = " + R.AreaOfRectangle());
	
	Triangle T = new Triangle(13,25,4);
	
	System.out.print("Area of triangle is =" + T.AreaofTriangle());
	
	c.close();
}
}}

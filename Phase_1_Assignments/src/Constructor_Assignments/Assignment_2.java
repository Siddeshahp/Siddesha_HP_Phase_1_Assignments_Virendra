/*Assignment 2:(method + constructors)
i want to calculate the area of the different shapes - square, rectangle, circle
1. create 4 constructors - default + three constructors for the shapes (using constructor overloading)
2. create 3 methods for (square, rectangle, circle) display which will display the value of the area calculated
3. calculate the area of the rhombus and triangle using the method overloading concept 

*/
package Constructor_Assignments;
public class Assignment_2 
{

	int a;
	int b,l;
	float r;
	float pi=3.14f;
	int a1,a2;
	float a3;
	public Assignment_2()
	{
		
	}
	public Assignment_2(int side)
	{
		side=a;
		 a1=side*side;
	}
	public Assignment_2(int breadth,int length)
	{
		breadth=b;
		length=l;
		 a2=length*breadth;
	}
	public Assignment_2(float radius)
	{
		radius=r;
		 a3=pi*radius*radius;
	}
	public void calculate()
	{
		System.out.println("square:"+a1);
		System.out.println("rectangle:"+a2);
		System.out.println("circle:"+a3);
		
	}
	public int area(int p,int q)
	{
		int a4=p*q/2;
		return a4;
	}
	public int area(float b,int h)
	{
		float a5=(float) (0.5*b*h);
		int a6=(int) a5;
		return a6;
	}
	

	public static void main(String[] args) 
	{
		Assignment_2 bb=new Assignment_2(12);
		Assignment_2 cc=new Assignment_2(12,13);
		Assignment_2 dd=new Assignment_2(12.3f);
		bb.calculate();
		System.out.println(bb.area(12, 13));
		System.out.println(bb.area(12.3f, 5));
		
		
		
		
		
		
	}


}

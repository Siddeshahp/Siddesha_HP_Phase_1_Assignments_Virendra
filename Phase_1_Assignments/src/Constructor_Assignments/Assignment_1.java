/*assignment 1: (function overloading)

Note **: create function name as "calculate"
create three functions in a class
1) create method of return type int
   - add two numbers

2) one of return type float
  to calculate the area of the circle

3) one of return type int 
   area of the rectangle*/

package Constructor_Assignments;
public class Assignment_1 
{

	float pi=3.14f;
	public int calculate(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int calculate(int r)
	{
		float area=pi*r*r;
		int b1=(int) area;
		return b1;
	}
	public int calculate(float l,float b)
	{
		float c=l*b;
		int c1=(int) c;
		return c1;
		
	}
	

	public static void main(String[] args) 
	{
		Assignment_1 a1=new Assignment_1();
		System.out.println("c="+a1.calculate(12,13));
		System.out.println("area="+a1.calculate(15));
		System.out.println("c="+a1.calculate(13.3f, 8.9f));
		

	}

}

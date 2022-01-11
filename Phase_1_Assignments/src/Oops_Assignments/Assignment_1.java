/*Assignment 1:

Vehicle:(Parent)
- create two abstract methods  - run() and stop()
- create three methods of public void fuel - 1st method will take int / 2nd method will float and string  / 3rd method will take char and int (method overloading)
- declare two variables - int speed and long distance
- create two constructors also- default and parameterized

2W:
- override the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vehicle
- declare one more variable as int num_of_tire = 2
- create methods here also as display() --> this will print the three variables of 2W  + all the variable of the parent Vehicle  (hint: super.variable_name)

3W:
- override the two methods - run() and stop()
- - create default constructor
- declare two variables - int speed and long distance with different values from the parent vehicle
- declare one more variable as int num_of_tire = 3
- create methods here also as display() --> this will print the three variables of 3W  + all the variable of the parent Vehicle

4W:
- override the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vehicle
- declare one more variable as int num_of_tire = 4
- create methods here also as display() --> this will print the three variables of 4W  + all the variable of the parent Vehicle

8W:
- override the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vehicle
- declare one more variable as int num_of_tire = 8
- create  methods here also as display() --> this will print the three variables of 8W  + all the variable of the parent Vehicle

  Main()
  - call all the methods using dynamic/runtime polymorphism here
  - all the methods of all the child classes.
  - call all the methods of the fuel of Vehicle class

*/
package Oops_Assignments;

abstract class vehicle
{
	abstract void run();
	abstract void stop();
	abstract void display();
	int speed=65;
	long distance=5432l;
	public void fuel(int a)
	{
		System.out.println("a="+a);
	}
	public void fuel(float b,String c)
	{
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	public void fuel(char d,int e)
	{
		System.out.println("d="+d);
		System.out.println("e="+e);
	}
	vehicle()
	{
		System.out.println("default constructor for vehicle");
		
	}
	vehicle(int x,long y)
	{
		speed=x;
		distance=y;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
class Two_wheeler extends vehicle
{
	int speed=75;
	long distance=4532l;
	int nos_of_tyre=2;
	public void run()
	{
		System.out.println("run method for vehicle");
		
	}
	public void stop()
	{
		System.out.println("stop method for vehicle");
	}
	Two_wheeler()
	{
		System.out.println("default constructor for Two wheeler");
	}
	public void display()
	{
		System.out.println("speed="+speed);
		System.out.println("distance="+distance);
		System.out.println("nos_of_tyre="+nos_of_tyre);
		System.out.println("speed="+super.speed);
		System.out.println("distance="+super.distance);
	}
}
class Three_wheeler extends vehicle
{
	int speed=78;
	long distance=7652l;
	int nos_of_tyre=3;
	public void run()
	{
		System.out.println("run method for two wheeler");
		
	}
	public void stop()
	{
		System.out.println("stop method for two wheeler");
		
	}
	Three_wheeler()
	{
		System.out.println("default constructor for three wheeler");
	}
	public void display()
	{
		System.out.println("speed="+speed);
		System.out.println("distance="+distance);
		System.out.println("nos_of_tyre="+nos_of_tyre);
		System.out.println("speed="+super.speed);
		System.out.println("distance="+super.distance);
	}
	
}
class Four_wheeler extends vehicle
{
	int speed=45;
	long distance=5652l;
	int nos_of_tyre=4;
	public void run()
	{
		System.out.println("run method for four wheeler");
		
	}
	public void stop()
	{
		System.out.println("stop method for four wheeler");
		
	}
	Four_wheeler()
	{
		System.out.println("default constructor for four wheeler");
	}
	public void display()
	{
		System.out.println("speed="+speed);
		System.out.println("distance="+distance);
		System.out.println("nos_of_tyre="+nos_of_tyre);
		System.out.println("speed="+super.speed);
		System.out.println("distance="+super.distance);
	}
	
}
class Eight_wheeler extends vehicle
{
	int speed=99;
	long distance=1252l;
	int nos_of_tyre=8;
	public void run()
	{
		System.out.println("run method for Eight wheeler");
		
	}
	public void stop()
	{
		System.out.println("stop method for eight wheeler");
		
	}
	Eight_wheeler()
	{
		System.out.println("default constructor for eight wheeler");
	}
	public void display()
	{
		System.out.println("speed="+speed);
		System.out.println("distance="+distance);
		System.out.println("nos_of_tyre="+nos_of_tyre);
		System.out.println("speed="+super.speed);
		System.out.println("distance="+super.distance);
	}
}

public class Assignment_1 {

	public static void main(String[] args) 
	{
		vehicle v1;
		v1=new Two_wheeler();
		v1.display();
		v1=new Three_wheeler();
		v1.display();
		v1=new Four_wheeler();
		v1.display();
		v1=new Eight_wheeler();
		v1.display();
		
		
	}

}


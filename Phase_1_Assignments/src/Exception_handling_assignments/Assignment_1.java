/*Assignment 1:

You need to check the salary of the person and based on that need to return the output from the program.
if salary < 2100  then return custom exception message as "you need to work hard"
if salary is between 2100 and 5000 then return custom exception message as "you salary is somehow good"
if salary is between 5100 and 9000 then return custom exception message as "salary is very good"

Design the custom exception class in this*/
package Exception_handling_assignments;

import java.util.Scanner;

public class Assignment_1 
{
	static void check(int salary)throws SalaryCheckException
	{
		if(salary<2100)
		{
			throw new SalaryCheckException("you need to work hard");
			
		}
		else if(salary>=2100 && salary<=5000)
		{
			throw new SalaryCheckException("your salary is some how good");
		}
		else if(salary>=5100 && salary<=9000)
		{
			System.out.println("salary is very good");
		}
		
		
	}

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary:");
		int salary=sc.nextInt();
		try
		{
			check(salary);
		}
		catch(Exception m)
		{
			System.out.println(m.getMessage());
		}
	}

}
class SalaryCheckException extends Exception
{
	SalaryCheckException(String s)
	{
	super(s);
	}
	

}

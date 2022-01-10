/*Assignment 1:
Stack 
1) add 5 fruits
2) add 4 cities
3) add 4 integer variables
4) add two char variables
operations:
1- print stack
2- remove 5 elements
3- peek element
4- remove 2 elements
5- poll 2 elements
6- check top of stack and print
7- check index of "Apple" and "Delhi"*/
package Data_Structers_Assignments;

import java.util.Stack;

public class Assignment_1 {

	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		s1.push("pine apple");
		s1.push("orange");
		s1.push("grapes");
		s1.push("apple");
		s1.push("banana");
		s1.push("bangalore");
		s1.push("delhi");
		s1.push("mumbai");
		s1.push("pune");
		s1.push(13);
		s1.push(12);
		s1.push(9);
		s1.push(76);
		s1.push('M');
		s1.push('F');
		System.out.println(s1);
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		System.out.println("after removing 5 element:"+s1);
		System.out.println("peek element is:"+s1.peek());
		s1.pop();
		s1.pop();
		System.out.println("after removing 2 element:"+s1);
		s1.pop();
		s1.pop();
		System.out.println("top of the stack:"+s1.lastElement());
		System.out.println("index of apple is:"+s1.indexOf("apple"));
		System.out.println("index of delhi is:"+s1.indexOf("delhi"));
		
		

	}

}

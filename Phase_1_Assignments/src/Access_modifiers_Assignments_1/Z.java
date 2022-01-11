/*Z class  -->
 call all the methods of the N, M, P class and call all the variables of the class X

*/
package Access_modifiers_Assignments_1;

import Access_modifier_Assignments.M;
import Access_modifier_Assignments.N;
import Access_modifier_Assignments.P;


public class Z extends M {

	public static void main(String[] args) 
	{
		M m1=new M();
		N n1=new N();
		P p1=new P();
		X x1=new X();
		Z z1=new Z();
		
		m1.public_method();
		m1.method();
		System.out.println("c="+z1.c);
		n1.method();
		System.out.println("e="+n1.e);
		n1.method1();
		z1.public_method();
		z1.method();
		System.out.println("c="+z1.c);
		n1.method();
		System.out.println("e="+n1.e);
		n1.method1();
		x1.public_method();
		System.out.println("h="+x1.h);
		System.out.println("i="+x1.i);
		System.out.println("j="+x1.j);
		

	}

}

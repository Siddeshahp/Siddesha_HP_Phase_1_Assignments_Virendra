package Access_modifiers_Assignments_1;
import Access_modifier_Assignments.M;
import Access_modifier_Assignments.N;



public class Y extends M
{
	public static void main(String[] args) 
	{
		M m1=new M();
		Y y1=new Y();
		N n1=new N();
		X x=new X();
		m1.public_method();
		m1.method();
		System.out.println("c="+y1.c);
		n1.method();
		System.out.println("e="+n1.e);
		n1.method1();
		x.public_method();
		System.out.println("h="+x.h);
		System.out.println("i="+x.i);
		System.out.println("j="+x.j);
		
		
		

	}


}

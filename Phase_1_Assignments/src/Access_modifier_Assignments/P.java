package Access_modifier_Assignments;



public class P 
{
	public static void main(String[] args) 
	{
		M e=new M();
		e.public_method();
		System.out.println("b="+e.b);
		System.out.println("c="+e.c);
		N n=new N();
		System.out.println("d="+n.d);
		System.out.println("e="+n.e);
		System.out.println("f="+n.f);
	}

	
}

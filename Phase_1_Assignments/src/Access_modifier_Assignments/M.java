/*M class  --> 
 private  int 
 default long
 protected float*/

package Access_modifier_Assignments;

public class M 
{
	private int a=10;
	long b=12345L;
	protected float c=5.6f;
	
	private void private_method()
	{
		System.out.println("a="+a);
	}
	 void default_method()
	{
		System.out.println("b="+b);
	}
	public void public_method()
	{
		private_method();
		
	}
	public void method()
	{
		default_method();
	}


}

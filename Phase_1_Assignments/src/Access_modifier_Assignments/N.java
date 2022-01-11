/*N class  --->
  protected long 
  public int
  default double*/

package Access_modifier_Assignments;

public class N 
{
	protected long d=123456l;
	public int e=32;
	double f=45.76;
	protected void protected_method()
	{
		System.out.println("d="+d);
		
	}
	public void method()
	{
		protected_method();
	}
	void default_method()
	{
		System.out.println("f="+f);
	}
	public void method1()
	{
		default_method();
	}

}

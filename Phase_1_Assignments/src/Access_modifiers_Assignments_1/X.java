package Access_modifiers_Assignments_1;

public class X 
{
	private int g=14;
	long h=123578l;
	protected float i=5677;
	public char j='D';
    private void private_method()
    {
    	System.out.println("g="+g);
    }
    public void public_method()
    {
    	private_method();
    }

}

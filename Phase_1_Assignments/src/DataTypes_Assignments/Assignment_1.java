package DataTypes_Assignments;

public class Assignment_1 
{
	public static void main(String[] args) 
	{
		boolean status=true;
		System.out.println("status="+ status);
		
		float pi=3.142f;
		System.out.println("pi="+pi);
		
		long mobile_number=987654667L;
		System.out.println("mobile_number="+mobile_number);
		
		int id=12;
		System.out.println("id="+id);
		
		char gender='M';
		System.out.println("gender="+gender);
		
		String name="siddesh";
		System.out.println("name="+name);
		
		//type cast between int and long
		int i=100;
		long l=i;
		System.out.println("l="+l);
		int o=(int) l;
		System.out.println("o="+o);
		char t=(char) i;
		System.out.println("t="+t);
		
		//typecast between double and float
		double d=112233445.67789998767;
		float r=(float) d;
		System.out.println("r="+r);
		System.out.println("d="+d);
		
		//typecast from double--->long--->int 
		double d2=12345678.76543224;
		long l2=(long)d2;
		int i2=(int) l2;
		System.out.println("d2="+d2);
		System.out.println("l2="+l2);
		System.out.println("i2="+i2);
		
		//typecast between long and float
		float f=l;
		System.out.println("f="+f);
		
		//typecast between byte,int and double
		byte b;
		int ii=257;
		double dd=323.142;
		b=(byte) ii;//conversion of int to byte  ii%256 will happen
		System.out.println("b="+b);
		b=(byte) dd;//conversion of double to byte  dd%256 will happen
		System.out.println("b="+b);
	}
}

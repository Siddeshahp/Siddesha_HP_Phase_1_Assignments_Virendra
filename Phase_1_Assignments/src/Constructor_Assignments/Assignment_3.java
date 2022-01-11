/*Calculate the number of objects created inside the string pool and heap.
Also compare the below objects using the equals and ==

String t= "Delhi";   
String o = "Mumbai"; 
String k= "delhi";   
String y= new String ("Mumbai");   
String l= new String ("delhi");  
String p = new String("Hello");  

equals and ==
(1) o with l
(2) y with p
(3) t with o
(4) k with y
(5) p with y

*/
package Constructor_Assignments;

public class Assignment_3 {

	public static void main(String[] args) 
	{
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		System.out.println("o.equals(l):"+o.equals(l));
		System.out.println("o==l:"+o==l);
		System.out.println("y.equals(p)"+y.equals(p));
		System.out.println("y==p:"+y==p);
		System.out.println("t.equals(o):"+t.equals(o));
		System.out.println("t==o:"+t==o);
		System.out.println("k.equals(y):"+k.equals(y));
		System.out.println("k==y:"+k==y);
		System.out.println("p.equals(y):"+p.equals(y));
		System.out.println("p==y:"+p==y);
		
	}

}

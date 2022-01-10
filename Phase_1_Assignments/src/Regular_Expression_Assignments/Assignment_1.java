/*(Pattern Matching):
(1) validate the given email id (that shoud have pattern with @ and .com    
    (a)  firstname@gmail.com
    (b)  virendra@gmail.com
    (c)  test123prepare@co.edu.com
(2) validate the phone number with country code +91 pattern mathing
(3) password with 10 length that shoud have - first letter caps  / contain 3 digits / contains any number of alpahbets also */ 
package Regular_Expression_Assignments;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment_1 {

	public static void main(String[] args) 
	{
		System.out.println (Pattern.matches("^[a-z]+@.+","firstname@gmail.com")); 
		System.out.println (Pattern.matches("^[a-z]+@.+","vireandra@gmail.com")); 
		System.out.println (Pattern.matches("^[a-zA-Z0-9]+@.+","test123prepare@co.edu.com")); 
		
		System.out.println (Pattern.matches("\\d{10}","9732546576"));
		System.out.println (Pattern.matches("[A-Z]?+[0-9]{3}+[a-z]{6}","S123iddesg"));

	}

}

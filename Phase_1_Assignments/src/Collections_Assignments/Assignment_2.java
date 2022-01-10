/*Use LinkedList only in the below program
   - Add 6 months (May, June, July, August, April, November)
   - Add 'December' month as last
   - Add 'January' month as first
   - Add 'March' and then add 'Febuary' using the index based 
   - Add 'Septemeber' and then add 'October' using the index based
(1) Print the linkedlist in such a way that proper order of months are displayed
(2) Get all the even months and print them 
(3) Get all the odd months and print them
(4) Use iterator to fetch and print all months 
(5) Print the first and last month of the year together
(6) remove your birthday month from the linkedList and print it
(7) Check whether this linkedList contains any winter month inside it or not?*/

package Collections_Assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment_2 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add("April");
		l1.add("May");
		l1.add("June");
		l1.add("July");
		l1.add("August");
		l1.add("November");
		l1.addLast("December");
		l1.addFirst("January");
		l1.add(1, "February");
		l1.add(2, "March");
		l1.add(8, "September");
		l1.add(9, "October");
		System.out.println(l1);
		
		ListIterator it=l1.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.remove("March");
		System.out.println(l1);
		System.out.println(l1.contains("November"));
		System.out.println(l1.contains("DEcember"));
	}
}

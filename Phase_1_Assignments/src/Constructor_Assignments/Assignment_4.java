package Constructor_Assignments;
public class Assignment_4 
{
	String a1;
	int a2;
	char a3;
	char a4;
	int a5;
	int a6;
	int a7;
	int a8;
	float a9;
	
	
	
	public Assignment_4(String name,int age,char section,char gender,int sub1,int sub2,int sub3)
	{
		name=a1;
		age =a2;
		section=a3;
		gender=a4;
		sub1=a5;
		sub2=a6;
		sub3=a7;
		 int total=a8;
		 float percentage=a9;
		
		 total=sub1+sub2+sub3;
		 percentage=total/100*100;
		
	}
	public void display()
	{
		System.out.println("name:"+a1+""+"age:"+a2+""+"gender:"+a3+""+"section:"+a4+""+"sub1:"+a5+""+"sub2:"
	+a6+""+"sub3:"+a7+""+"total:"+a8+""+"percentage:"+a9);
	}
	
	

	public static void main(String[] args) 
	{
		Assignment_4 s1=new Assignment_4("siddesh",12,'c','M',67,67,98);
		Assignment_4 s2=new Assignment_4("gagan",13,'d','F',0,87,67);
		Assignment_4 s3=new Assignment_4("kumar",23,'a','M',0,76,56);
		Assignment_4 s4=new Assignment_4("vikas",21,'b','F',56,76,45);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}

	

}

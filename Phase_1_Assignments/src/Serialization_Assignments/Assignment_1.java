package Serialization_Assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Assignment_1 
{

	public static void main(String[] args) throws IOException 
	{
		Employee emp1=new Employee("siddesh",123,32,"IT","sidd@gmail.com",9876345214l,'M');
		Employee emp2=new Employee("kiran",345,34,"HR","kiran@gmail.com",9876543333l,'M');
		 FileOutputStream fos= null;
		    ObjectOutputStream oos= null;
		    
		    try
		    { 
		      fos = new FileOutputStream("D:\\Siddesha HP Resume\\sss.ser"); 
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(emp1);
		     oos.writeObject(emp2);
		      System.out.println("Serialzation Done!!");
		   }
		    catch(IOException ioe)
		    {
		      System.out.println(ioe);
		    }
		    
		    
		    finally
		    {
			      oos.close();
			      fos.close();
		    }
		    
		     Employee o=null;
		     Employee o1=null;
		     try
		     {
		       FileInputStream fis = new FileInputStream("D:\\Siddesha HP Resume\\sss.ser");
		       ObjectInputStream ois = new ObjectInputStream(fis);
		       o = (Employee)ois.readObject();
		       
		       ois.close();
		       fis.close();
		     }
		     catch(IOException ioe)
		     {
		        ioe.printStackTrace();
		        return;
		     }
		     catch(ClassNotFoundException cnfe)
		      {
		        System.out.println("Student Class is not found.");
		        cnfe.printStackTrace();
		        return;
		      }
		     System.out.println("Employee Name:"+o.getName());
		     System.out.println("Employee id:"+o.getId());
		     System.out.println("Employee Age:"+o.getAge());
		     System.out.println("Employee deptname:"+o.getDeptName());
		     System.out.println("employee email:"+o.getEmail());
		     System.out.println("employee contact: "+o.getContact());
		     System.out.println("Employee gender:"+o.getGender());
		  }
		
	}




class Employee implements java.io.Serializable{
	  
	  private String name;
	  private int id;
	  private int age;
	  private String DeptName;
	  private String email;  
	  private long contact;
	  private char gender;
	  
	  public Employee(String Emp_name, int Emp_id,int Emp_age, String Emp_Deptname,String Emp_email,long Emp_contact,char Emp_gender) 
	  {
		  this.name=Emp_name;
		  this.id=Emp_id;
		  this.age=Emp_age;
		  this.DeptName=Emp_Deptname;
		  this.email=Emp_email;
		  this.contact=Emp_contact;
		  this.gender=Emp_gender;
	  }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
	  
	



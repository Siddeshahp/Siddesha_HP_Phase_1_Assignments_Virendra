package File_handling_Assignments;
import java.io.IOException;
import java.io.File;

public class Assignment_1 
{
	 public static void main(String[] args) {
		   try {  
	            File file = new File("D:\\Siddesha HP Resume\\sss"); 
	            
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(file.exists())
	                {
	                    System.out.println("File already exists.");	
	                    System.out.println("File path:" + file.getAbsolutePath());
	                    System.out.println("File name:  " + file.getName());
	                    System.out.println("File class:  " + file.getClass());
	                    System.out.println("File parent:  " + file.getParent());
	                    System.out.println("File space allocated:  " + file.getUsableSpace());
	                    System.out.println("File length: " + file.length());
	                    System.out.println("File list:   " + file.list());
	                    
	                }
	                else
	                {
	                	System.out.println("File doesnot exists.");
	                }
	               
	               
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  	  

}

}

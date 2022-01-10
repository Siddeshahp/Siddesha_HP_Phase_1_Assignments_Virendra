package Threads_Assignments;
import java.io.*;
	class test
	{
		public static test t;
		synchronized public void test1()
		{
			for(int i=1;i<=3;i++)
				
			{  
				System.out.println("Running Thread name is:"+Thread.currentThread().getName());
				System.out.println("running thread state is:"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().getState());
				System.out.println("my thread is alive or not:"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().isAlive());
				System.out.println("The thread id is:"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().getId());
			    try{
			    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
			    	}
			    catch(InterruptedException e)
			    {
			    	System.out.println(e);
			    }
			}
			
		}
	}
	class role extends Thread
	{
		test t;
		role(test t)
		{
			this.t=t;
		}
		//@Override
		public void run()
		{
			t.test1();
		}
	}
	public class Assignment_3 
	{

		public static void main(String[] args) 
		{
			test t1=new test();
			
			role s1=new role(t1);
			role s2=new role(t1);
			role s3=new role(t1);
			
			s1.setName("IT");
			s2.setName("Finance");
			s3.setName("HR");
			s1.start();
			s2.start();
			s3.start();
		}
		
	}
		





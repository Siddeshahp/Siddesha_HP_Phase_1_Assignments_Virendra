package Threads_Assignments;

import java.io.IOException;

 class thread
{
	synchronized public void test() 
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Running Thread name is:"+Thread.currentThread().getName());
			System.out.println("running thread state is:"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().getState());
			System.out.println("my thread is alive or not:"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().isAlive());
			System.out.println("The thread id is:"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().getId());
		    try
		    {
		    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    } 
		}
		
	}
}
public class Assignment_1 extends Thread 
{
		
	
	thread a1;
	Assignment_1(thread a1 )
	{
		this.a1=a1;
		
	}
	@Override

	public void run()
	{
		
		a1.test();
	}
	

	public static void main(String[] args) 
	{
		thread t=new thread();
		Assignment_1 t1=new Assignment_1(t);
		Assignment_1 t2=new Assignment_1(t);
		Assignment_1 t3=new Assignment_1(t);
		t1.setName("IT");
		t2.setName("Finance");
		t3.setName("HR");
		t1.start();
		t2.start();
		t3.start();

	}


}

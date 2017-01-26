package com.acad.timer;

public class Timecounter {
	
 static  Thread t = new Thread();

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Timer starts now :");

		for(int i=0;i<=50;i++)
	{
		t.sleep(1000);

		System.out.println(i);
		
	}
	System.out.println("Timer Ends.");
	}
}

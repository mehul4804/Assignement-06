package com.acad.primeno;

public class TypetwoThread 
{
	
	public static void main(String[] args)
	{			 
			Prime p = new Prime();
			 p.start();	
			 Notprime p1= new Notprime();
			 p1.start();
			 
		}
	}


//final variable

class Inherit5
{  
	final int speedlimit=90;//final variable  
	void run()
	{  
		//speedlimit=400;
		System.out.println(speedlimit);
	}
	
	public static void main(String args[])
	{  
		Inherit5 obj=new  Inherit5();  
		obj.run();  
	}  
}
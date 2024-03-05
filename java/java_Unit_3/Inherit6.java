//final class

 class Bike
  {
	final int r;
  }
	  
      
    class Inherit6
   {  
	void run()
	   {
		   System.out.println("running safely with 100kmph");
	   }  
        
      public static void main(String args[])
     {  
            Inherit6 honda= new Inherit6();  
            honda.run();  


            Bike b = new Bike();
            b.r = 100;

            System.out.println(b.r);
      }  
    }  
    
    
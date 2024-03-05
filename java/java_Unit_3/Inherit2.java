    //Hierarchical Inheritance
    
    class Animal
    {  
		void eat()
		{	
			System.out.println("eating...");
		}  
    }  
    
    class Dog extends Animal
    {  //eat
		void bark()
		{
			System.out.println("barking...");
		}  
    }  
    
    class Cat extends Animal
    {  //eat
		void meow()
		{
			System.out.println("meowing...");
		}  
    }  
    
    
    class Inherit2
    {  
	public static void main(String args[])
	{  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		
		Dog d = new Dog();
		d.bark();
		d.eat();
    
	}
}  
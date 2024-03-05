class Black{
    Black(){
        System.out.println("Color : Black");
    }

}
class White{
    White(){
        System.out.println("Color : White");
    }

}
class Car1 extends Black{

    Car1(){//Constructer of Car1 (It will be called automatically when an object of Car1 is created)

        //super(); implicitly(automatically) calling extended class's constructer
        //super must be first statement in constructor    
        //You cant use super(); outside CONSTRUCTER

        System.out.println("Car1 : BMW");
    }

}
class Car2 extends White{

    Car2(){//Constructer of Car2

        super();//Explicitly calling extended class's constructer

        System.out.println("Car2 : FORTUNER");   
    
    }

  

}
class Inherit1{
    /*This is our main class , which will give us access to whole program
    Just because our main function is static ,we cant use any function of same or different class,
    Without creating any object of that class. 
    Because those function of same/different classes would be NON-Static
    And The RULE is: You cant use non-static func inside static func :)  
    */
    public static void main(String a[]){

        Car1 objOfCar1 = new Car1();//It will call contructer of Car1

        Car2 objOfCar2 = new Car2();//It will call contructer of Car2

    }
}
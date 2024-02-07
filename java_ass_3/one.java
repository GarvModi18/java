/*Define a class MotorVehicle to take modelName, modelNumeber, modelPrice, and a
method display() to display these details. Create another class Car which inherits the
class MotorVehicle and has the member discountRate and having display() method to
display details. Test this class with suitable constructor. If necessary use the super
keyword.*/
import java.util.*;
class motorVehicle{
	String modelName;
	int modelNum;
	float modelPrice;

	
	motorVehicle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter model Name,Num,Price");
		modelName=sc.next();
		modelNum=sc.nextInt();
		modelPrice=sc.nextFloat();
	}

	void display(){
		System.out.println("--------Details--------\nModelName: "+modelName+"\nModelNum: "+modelNum+"\nModelPrice: "+modelPrice);
	}
}
class car extends motorVehicle{

	int discount_rate=10;
	
	car(){
	super();
	super.display();
	
	modelPrice-=(modelPrice*discount_rate)/100;
	}

	void display(){
	System.out.println("--------After Discount Details--------\nModelName: "+modelName+"\nModelNum: "+modelNum+"\nModelPrice: "+modelPrice);

	}

		public static void main(String[] args) {
		
		car obj=new car();
		
		obj.display();
	}
}
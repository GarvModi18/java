import java.util.Scanner;
class superClass{
    String name;
    superClass(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Name");
        name=sc.next();
    }
    void display(){

        System.out.println("Hello! "+name+" Good Morning!!");

    }
}
class subClass extends superClass{

    subClass(){
        super();//called implicitly //not compulsory 
        super.display();
    }

}
class seven{

    public static void main(String a[]){

        subClass obj=new subClass();
    }
}
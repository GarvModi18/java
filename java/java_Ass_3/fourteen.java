import java.util.Scanner;
class shape{

    void display(){
        System.out.println("This is Shape");
    }
}
class rectangle extends shape{
    void display(){
        System.out.println("This is Rectangle");
        super.display();
    }

}
class circle extends shape{
    void display(){
        System.out.println("This is Circle");
    }


}
class square extends rectangle{

    void display(){
        System.out.println("Square is a Rectangle");
        super.display();
    }

}
class fourteen {

    public static void main(String a[]){

        square obj=new square();
        obj.display();
   } 
}
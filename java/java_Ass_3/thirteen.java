import java.util.Scanner;
class rectangle{
    double length,breadth;
    Scanner sc=new Scanner(System.in);

    rectangle(double length,double breadth){
   
        this.length=length;
        this.breadth=breadth;

    }
    void area(){
        System.out.println("Area : "+ (length*breadth));
    }
    void perameter(){
        System.out.println("Perameter : "+2*(length+breadth));
    }

}
class square extends rectangle{

    square(double side){
        super(side,side);
        
    }

}
class thirteen {
    public static void main(String a[]){

        double length,breadth,side;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length and breadth of Rectangle");
        length=sc.nextDouble();
        breadth=sc.nextDouble();

        rectangle obj1=new rectangle(length,breadth);
        obj1.area();
        obj1.perameter();

        System.out.println("Enter length of Square");
        side=sc.nextDouble();

        square obj2=new square(side);
        obj2.area();
        obj2.perameter();
    }
}
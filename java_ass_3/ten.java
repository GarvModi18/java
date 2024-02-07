import java.util.Scanner;
class rectangle{
    double length,Width,a,p;

    rectangle(double length,double Width){

        this.length=length;
        this.Width=Width;
    }

    void calculation(){
        System.out.println("Area : "+(length*Width)+"\nPerameter : "+(2(length+Width)));
    }
}
class ten extends rectangle{

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Length and Width");
        rectangle obj=new rectangle(sc.nextDouble(),sc.nextDouble());
    
    
    
    }
}
import java.util.Scanner;
interface area{
    float PI=3.14f;

    void compute(float a,float b);

}
class eleven implements area{

    public void compute(float r1,float r2){

        System.out.println("Area of Circle : "+(PI*r1*r2));        
    }
    
    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        float radius;

        System.out.println("Enter Radius");
        radius=sc.nextFloat();

        eleven obj=new eleven();
        obj.compute(radius,radius);

    }

}
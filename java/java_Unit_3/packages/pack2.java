import package1.pack1;//package->class name
//if you use * then save the first file in the package which is created by first file :)
import java.util.Scanner;

class pack2{

    public static void main(String a[]){

        pack1 obj=new pack1();//class name

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name=sc.nextLine();

        obj.printData(name);


    }

}
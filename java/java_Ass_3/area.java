package pack15;
//PACKAGE LINE MUST BE WRITTEN IN FIRST LINE
//creating package pack15 for area

import java.util.Scanner;
public class area{

    public void display(){
        double lenght,width;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter lenght and width");
        lenght=sc.nextDouble();
        width=sc.nextDouble();
        System.out.println("The Area : "+(lenght*width));
    }

}
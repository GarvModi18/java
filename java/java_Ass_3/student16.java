package mypackage;
//created first package-mypackage
import java.util.Scanner;
public class  student16{

    String fn,ln,address;
    int rollno,age;

    public void set_data(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First,Last Name and Address");
        fn=sc.next();
      //  sc.next();//For accepting Enter(whitespace)
        ln=sc.next();
        address=sc.next();

        System.out.println("Enter Age and RollNo");
        age=sc.nextInt();
        rollno=sc.nextInt();

    }

    public void get_data(){

      System.out.println("First Name : "+fn+"\nLast Name : "+ln+"\nAddress : "+address);
      System.out.println("Age : "+age+"\nRollno : "+rollno);

    }

}
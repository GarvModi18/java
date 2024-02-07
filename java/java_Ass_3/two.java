/*Consider an employee class, which contains fields such as name and designation. And a
subclass, which contains a field salary. Write a program for inheriting this relation. */
import java.util.Scanner;
class employee_info{
    float salary;

        employee_info(){
             Scanner sc=new Scanner(System.in);

        System.out.println("Enter Salary");
        salary=sc.nextFloat();
        }
    }
class employee extends employee_info{

    String name;
    String designation;
    employee(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name & designation");
        name=sc.next();

        sc.nextLine();
/*The issue you're facing is related to how nextLine behaves after using next for input. 
When you use next to read a string, it only captures the next token,
stopping at whitespace. The newline character after entering the salary is still in the input buffer, 
and when you use nextLine later, it consumes that newline character, resulting in unexpected behavior.
*/
        designation=sc.nextLine();
    }
    void display(){
        System.out.println("Name : "+name+"\nDesignation : "+designation+"\nSalary : "+salary);

    }
    public static void main(String args[]){

        employee obj=new employee();
        obj.display();
    }
}
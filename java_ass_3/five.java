import java.util.Scanner;
interface numbers{
    int process(int x,int y);
}
class sum implements numbers{

    public int process(int x,int y){
        return x+y;
    }
}
class average implements numbers{

    public int process(int x,int y){
        return (x+y)/2;
    }
}
class five{
    public static void main(String args[]){

        int a,b,sum,avg;
        
        sum sum_obj=new sum();
        average avg_obj=new average();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
        sum=sum_obj.process(a,b);
        avg=avg_obj.process(a,b);

        System.out.println("Sum : "+sum+"\nAverage : "+avg);

    }
}
interface sports {
    double total=0;
    double sportsMarks=0;
    double percentage=0;
    void getData();
    void display();
}
//INCOMPLETE : ITS UNABLE TO USE VAR OF INTERFACE INTO OTHER CLASSES
class result implements sports{
    Scanner sc=new Scanner(System.in);
    public void getData(){

        System.out.println("Enter total of 3 Subjects");
        total=sc.nextDouble();

        System.out.println("Enter Sports Marks");
        sportsMarks=sc.nextDouble();
        percentage=(total/3)+sportsMarks;
    }
    public void display(){
       
        System.out.println("Percentage : "+percentage);

       if(percentage>90){
        System.out.println("Grade : O");
       }
       else if(percentage>70){
        System.out.println("Grade : A");
       }
        else if(percentage>50){
        System.out.println("Grade : B");
       }
       else{
        System.out.println("Grade : C");
       }

    }

}
class twelve {

    public static void main(String a[]){

        result obj=new result();

        obj.getData();
        obj.display();
    }
}
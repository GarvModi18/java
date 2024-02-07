import java.util.Scanner;
class book{
    String title;
    int num_of_pages;

    void set_data(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter title and num of pages");
        title=sc.nextLine();
        num_of_pages=sc.nextInt();
    }

    String get_title(){
        return title;
    }
    int get_num_of_pages(){
        return num_of_pages;
    }

}
class textbook extends book{

    char grade_level;

    void set_grade_level(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Grade level");
        grade_level=sc.next().charAt(0);
    }
    char get_grade_level(){
        return grade_level;
    }
}
class six extends textbook{

    public static void main(String args[]){
        book book1=new book();
        textbook textbook1=new textbook();
        
        book1.set_data();                
        textbook1.set_grade_level();

        System.out.println("Title : "+book1.get_title()+"\nNum of Pages : "+book1.get_num_of_pages());
        System.out.println("Grade Level : "+textbook1.get_grade_level());
    }
}
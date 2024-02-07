class Super{

    void display_Super(){
        System.out.println("This is parent class");
    }
}
class Sub extends Super{

    void display_Sub(){
        System.out.println("This is child class");
    }
}
class nine{

    public static void main(String a[]){

        Super parent_obj=new Super();
        parent_obj.display_Super();

        Sub child_obj=new Sub();
        child_obj.display_Super();
        
        child_obj.display_Sub();


    }
}

interface interface1{
    void fun1(); 
}
interface interface2{
    void fun2();
}
class child implements interface1 , interface2 {

    public void fun1(){
        System.out.println("Its Function 1 of Interface 1");
    }
    public void fun2(){
        System.out.println("Its Function 2 of Interface 2");
    }

}
class eight{
    public static void main(String a[]){

        child obj=new child();

        obj.fun1();
        obj.fun2();
    }
}
//Multiple Inheritance Error

class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg1() {
        System.out.println("Welcome");
    }
}

class C extends A extends B{
//Class cant inherit multiple classes
//Instead you can use INTERFACES    

}

class Inherit3 {
    public static void main(String args[]) {
        C obj = new C();
        obj.msg();
    }
}
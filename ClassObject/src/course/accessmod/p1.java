package course.accessmod;

import course.accessmod2.C;

class A{
    public void sayhello(){
        System.out.println("Hello from A: ");
    }
}

public class p1 extends C {
    public static void main(String[] args) {
        A a = new A();
        a.sayhello();

        p1 c = new p1();
        c.sayhello();
    }
}

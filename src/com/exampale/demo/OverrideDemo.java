package com.exampale.demo;

/**
 * @author Ray.Ma
 * @date 2019/10/16 10:19
 */
public class OverrideDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        a.show(a);
        a.show(b);
        b.show(c);
        b.show(d);
        A ab = new B();

        ab.show(c);
        ab.show(d);
    }
}


class A {
    public void show(A obj) {
        System.out.println("a");
    }

    public void show(C obj) {
        System.out.println("c");
    }
}

class B extends A {
    @Override
    public void show(A obj) {
        System.out.println("b");
    }
}

class C extends B {

}

class D extends C {

}

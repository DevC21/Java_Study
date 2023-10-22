package JAVA.ch7;

public class Ex7_3 {
    public static void main(String[] args){
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 { 
    int x = 10; // super.x와 this.x 둘 다 가능
}

class Child2 extends Parent {
    void method(){
        System.out.println("x = " + x); // 가까운쪽 즉, 조상의 멤버 x = 10
        System.out.println("this.x = " + this.x); // 조상의 멤버 x = 10
        System.out.println("super.x = " + super.x); // 조상의 멤버 x = 10
    }
}

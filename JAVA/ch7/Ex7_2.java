package JAVA.ch7;

public class Ex7_2 {
    public static void main(String[] args){
        Child c = new Child();
        c.method();
    }
}

class Parent { 
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20; // this.x

    void method(){
        System.out.println("x = " + x); // 가까운쪽 x = 20
        System.out.println("this.x = " + this.x); // 이 클래스의 x = 20
        System.out.println("super.x = " + super.x); // 조상의 멤버 x = 10
    }
}

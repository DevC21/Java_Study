package JAVA.ch7;

public class Ex7_3 {
    public static void main(String[] args){
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 { 
    int x = 10; // super.x�� this.x �� �� ����
}

class Child2 extends Parent {
    void method(){
        System.out.println("x = " + x); // ������� ��, ������ ��� x = 10
        System.out.println("this.x = " + this.x); // ������ ��� x = 10
        System.out.println("super.x = " + super.x); // ������ ��� x = 10
    }
}

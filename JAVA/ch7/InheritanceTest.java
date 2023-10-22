package JAVA.ch7;

class MyPoint2 { // 상속을 하지 않으면 extends Object가 컴파일러에 의해 추가됨
    int x;
    int y;
}

// class Cricle extends MyPoint { // 상속
//     int r;
// }

class Circle { // 포함
    MyPoint2 p = new MyPoint2();
    int r;
}


public class InheritanceTest {
    public static void main(String[] args){
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
        System.out.println("c.p.x = " + c.p.x);
        System.out.println("c.p.y = " + c.p.y);
        System.out.println("c.r = " + c.r);
        System.out.println(c.toString()); // JAVA.ch7.Circle@5b2133b1
        System.out.println(c); // c.toString()과 같음
        Circle c2 = new Circle();
        System.out.println(c2.toString()); // JAVA.ch7.Circle@72ea2f77
    }
}

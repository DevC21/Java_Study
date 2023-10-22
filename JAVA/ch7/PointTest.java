package JAVA.ch7;

class Point {
    int x;
    int y;

    // 항상 기본 생성자를 추가 해주는 것이 권장된다.
    // Point() { this(0, 0); }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point {
    int z;



    // Point3D(int x, int y, int z) { // 에러발생
    // ***모든 생성자는 첫줄에 다른 생성자를 호출해야 하므로
    // 컴파일 과정에서 첫줄에 super();가 추가되어 
    // Point 클래스에 존재하지 않는 기본 생성자 Point()를 호출하므로 에러가 발생한다.
    // 해결방법 1. Point 클래스에 기본 생성자 Point() { } 를 추가
    //     this.x = x;
    //     this.y = y;
    //     this.z = z;
    // }

    Point3D(int x, int y, int z) {
    // 해결방법 2. 조상의 생성자 Point(int x, int y)를 호출
        super(x, y);
        this.z = z;
    }

    String getLocation() { // 오버라이딩
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}


public class PointTest {
    public static void main(String[] args){
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

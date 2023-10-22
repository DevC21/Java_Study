package JAVA.ch7;

class Point {
    int x;
    int y;

    // �׻� �⺻ �����ڸ� �߰� ���ִ� ���� ����ȴ�.
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



    // Point3D(int x, int y, int z) { // �����߻�
    // ***��� �����ڴ� ù�ٿ� �ٸ� �����ڸ� ȣ���ؾ� �ϹǷ�
    // ������ �������� ù�ٿ� super();�� �߰��Ǿ� 
    // Point Ŭ������ �������� �ʴ� �⺻ ������ Point()�� ȣ���ϹǷ� ������ �߻��Ѵ�.
    // �ذ��� 1. Point Ŭ������ �⺻ ������ Point() { } �� �߰�
    //     this.x = x;
    //     this.y = y;
    //     this.z = z;
    // }

    Point3D(int x, int y, int z) {
    // �ذ��� 2. ������ ������ Point(int x, int y)�� ȣ��
        super(x, y);
        this.z = z;
    }

    String getLocation() { // �������̵�
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}


public class PointTest {
    public static void main(String[] args){
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

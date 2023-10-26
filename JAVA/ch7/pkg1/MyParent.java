package JAVA.ch7.pkg1;

public class MyParent { // ���� �����ڰ� (public)
    private     int prv; // ���� Ŭ����
                int dft; // ���� ��Ű��
    protected   int prt; // ���� Ŭ���� + �ڼ�(�ٸ� ��Ű��)
    public      int pub; // �������� ����

    public void printMembers() {
        System.out.println(prv); // OK
        System.out.println(dft); // OK
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}

class MyParentTest { // ���� �����ڰ� (default)
    public static void main(String[] args){
        MyParent p = new MyParent();
//      System.out.println(p.prv); // ����
        System.out.println(p.dft); // OK
        System.out.println(p.prt); // OK
        System.out.println(p.pub); // OK
    }
}

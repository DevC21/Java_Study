package JAVA.ch7;

class AAA { /// AAA�� BBB�� �ܺ� Ŭ����
    int i = 100;
    BBB b = new BBB();

    class BBB { // BBB�� AAA�� ���� Ŭ����
        void method() {
//          AAA a = new AAA();
//          System.out.println(a.i);
            System.out.println(i); // ��ä �������� �ܺ� Ŭ������ ��� ���ٰ���

        }
    }
}



// class CCC {
//     BBB b = new BBB();
// }


public class InnerTest {
    
    public static void main(String[] args){
        
    }
}

package JAVA.ch14;

public class Ex14_0 {
    public static void main(String[] args) {
        // Object obj = (a, b) -> a > b ? a : b; // ���ٽ�. �͸�ü
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        // Object���� max��� �޼��尡 ���⶧���� ����� �� ����.
        // ���� �Լ��� �������̽��� �ʿ���.
        int value = obj.max(3, 5);
    }
}

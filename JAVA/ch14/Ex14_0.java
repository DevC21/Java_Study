package JAVA.ch14;

public class Ex14_0 {
    public static void main(String[] args) {
        // Object obj = (a, b) -> a > b ? a : b; // 람다식. 익명개체
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        // Object에는 max라는 메서드가 없기때문에 사용할 수 없음.
        // 따라서 함수형 인터페이스가 필요함.
        int value = obj.max(3, 5);
    }
}

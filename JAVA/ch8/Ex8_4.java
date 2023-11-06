package JAVA.ch8;

public class Ex8_4 {
    public static void main(String[] args){
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
//          System.out.println(0 / 0); // ArithmeticException
            System.out.println(args[0]); // ArrayIndexOutOfBoundsException
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException ie) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) { // ��� ���ܸ� ó�� �� �� �ִ�. ���� �� �������� �־����
            System.out.println("Exception");
        } // try-catch�� ��
        System.out.println(6);
    } // main�޼����� ��    
}

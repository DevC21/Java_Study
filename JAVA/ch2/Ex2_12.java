package JAVA.ch2;
public class Ex2_12 {
    public static void main(String args[]){
        String str = "3";

        System.out.println(str.charAt(0) -  '0'); // integer 3
        System.out.println(str.charAt(0) -  '0' + 1); // integer 4
        System.out.println(Integer.parseInt(str) - 1); // integer 4
        System.out.println("3" + 1); // String 31 ("3" + "1") �� ����
        System.out.println(3 + '0'); // '0'�� ���ڷ� 48 ��, 3 + 48 integer 51
        System.out.println((char)(3 + '0')); // ���� '0'�� + 3 �� ���� char�� ����ȯ �ϸ� '3'
    }
}

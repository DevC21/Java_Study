package JAVA.ch5;

public class Ex5_tmp_5 {
    public static void main(String[] args){
        String str = "ABCDE";
        char ch = str.charAt(2); // C
        String str2 = str.substring(1, 4);
        // to ������ ���� �ε������� ������ 
        // to�� str.length�� �����Ͱ� ����
        String str3 = str.substring(1); 
        System.out.println(ch);
        System.out.println(str2); // BCD
        System.out.println(str3); // BCDE
    }
}

package JAVA.ch9;

public class EX9_7 {
    public static void main(String[] args){
        String s1 = "AAA"; // 같은 내용의 문자열 리터럴은 하나만 만들어진다(주소 공유)
        String s2 = "AAA"; // 같은 내용의 문자열 리터럴은 하나만 만들어진다(주소 공유)
        String s3 = "AAA"; // 같은 내용의 문자열 리터럴은 하나만 만들어진다(주소 공유)
        String s4 = "BBB";
    }
}

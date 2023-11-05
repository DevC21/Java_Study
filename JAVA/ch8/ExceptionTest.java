package JAVA.ch8;

/* 
자바 컴파일러가 하는 일
1. 구문 체크
2. 번역
3. 최적화 - 생략된 코드 추가, 간단한 상수끼리의 연산등등
*/ 

/*
프로그램 오류
1. 컴파일 에러(compile-time error) : 컴파일 할 때 발생하는 에러
2. 런타임 에러(runtime error) : 실행 할 때 발생하는 에러 (프로그램이 종료되는 에러)
3. 논리적 에러 (logical error) : 작성 의도와 다르게 동작 (프로그램이 종료되지 않을 수 있음) 
 */

/*
자바의 에러 종류
1. 에러(Error) - 코드로 고칠 수 없는 심각한 에러 예) out of memory
2. 예외(Exception) - 코드로 고칠 수 있는 에러
 */

public class ExceptionTest {
    public static void main(String[] args){
        System.out.println(args[0]); // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }
}

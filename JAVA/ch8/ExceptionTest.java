package JAVA.ch8;

/* 
�ڹ� �����Ϸ��� �ϴ� ��
1. ���� üũ
2. ����
3. ����ȭ - ������ �ڵ� �߰�, ������ ��������� ������
*/ 

/*
���α׷� ����
1. ������ ����(compile-time error) : ������ �� �� �߻��ϴ� ����
2. ��Ÿ�� ����(runtime error) : ���� �� �� �߻��ϴ� ���� (���α׷��� ����Ǵ� ����)
3. ���� ���� (logical error) : �ۼ� �ǵ��� �ٸ��� ���� (���α׷��� ������� ���� �� ����) 
 */

/*
�ڹ��� ���� ����
1. ����(Error) - �ڵ�� ��ĥ �� ���� �ɰ��� ���� ��) out of memory
2. ����(Exception) - �ڵ�� ��ĥ �� �ִ� ����
 */

public class ExceptionTest {
    public static void main(String[] args){
        System.out.println(args[0]); // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }
}

package JAVA.ch5;

public class Ex5_tmp_2 {
    public static void main(String[] args){
        int[] arr = new int[10]; // �迭�� ����� ������ ���ÿ�
        System.out.println("arr.length = " + arr.length);

        for(int i = 0; i < arr.length; i++){
            arr[i] = i * 10 + 50;
            System.out.println("arr["+i+"] = " + arr[i]);
        }
    }    
}

package JAVA.ch5;

import java.util.Arrays;

public class Ex5_tmp_6 {
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 0, 4}; // 1���� �迭 arr

        Arrays.sort(arr); // �迭 arr�� ������������ ����
        System.out.println(Arrays.toString(arr));

        int[][] arr2D = {{11, 12}, {21, 22}}; // 2���� �迭

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        // �������� ���� ���ϴ� �����̶� �ùٸ��� �۵����� ����
        // �� �迭�� ���� �޸� �ּҿ� ������ �� ����.
        // System.out.println(str2D == str2D2);
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        int[] arr2 = Arrays.copyOf(arr, arr.length); // 0 1 2 3 4
        int[] arr3 = Arrays.copyOfRange(arr, 2, 4); // 2 3
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }    
}

package JAVA.ch5;

import java.util.Arrays; // VSCODE �ڵ� importŰ�� Alt + Shift + O

public class Ex5_tmp_3 {
    public static void main(String[] args){
        int[] iArr = {100, 95, 80, 70, 60}; // ���̰� 5�� int �迭

        for(int i = 0; i < iArr.length; i++){
            System.out.println(iArr[i]);
        }

        System.out.println(Arrays.toString(iArr));
    }
}

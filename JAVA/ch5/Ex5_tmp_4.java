package JAVA.ch5;

import java.util.Arrays;

public class Ex5_tmp_4 {
    public static void main(String[] args){
        String[] strArr = {"����", "����", "��"};
        System.out.println(Arrays.toString(strArr));

        for(int i = 0; i < 10; i++){
            System.out.println(strArr[(int)(Math.random() * 3)]);
        }
    }
}

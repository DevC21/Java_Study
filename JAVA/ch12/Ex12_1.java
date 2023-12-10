package JAVA.ch12;

import java.util.ArrayList;

class Product {}
class Tv2 extends Product {}
class Audio2 extends Product {}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv2> tvList = new ArrayList<Tv2>();
        productList.add(new Tv2());
        productList.add(new Audio2());

        tvList.add(new Tv2());
        tvList.add(new Tv2());

        printAll(productList);
//      printAll(tvList); // 컴파일 에러가 발생
    }

    public static void printAll(ArrayList<Product> list) {
        for(Product p : list)
            System.out.println(p);
    }
}

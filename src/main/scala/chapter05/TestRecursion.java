package org.ebay.scala.chapter05;

public class TestRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    // 1
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }

    // 2
    public static int fact(int n){
        if (n == 0){
            return 1;
        } else {
            return fact(n -1) * n;
        }
    }
}

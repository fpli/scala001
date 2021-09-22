package org.ebay.scala.chapter03;

public class TestOperator {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        final boolean isEqual = str1 == str2;
        System.out.println(isEqual);
        System.out.println(str1.equals(str2));
    }
}

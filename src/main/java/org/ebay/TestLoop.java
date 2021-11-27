package org.ebay.scala.org.ebay;

public class TestLoop {
    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);
    }
}

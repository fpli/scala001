package org.ebay.scala.org.ebay;

import java.util.Arrays;

public class TestLoop {
    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);

        int[] array = {23, 56, 21, 90, -12, 32, 100, -100, -321, 500, 52, 58};
        mergeSort(array, 0, array.length - 1, new int[array.length]);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int start, int end, int[] temporaryArray){
        if (start < end){
            int middle = (start + end) >>> 1;

            mergeSort(array, start, middle, temporaryArray);

            mergeSort(array, middle + 1, end, temporaryArray);

            merge(array, start, middle, end, temporaryArray);
        }
    }

    public static void merge(int[] array, int start, int middle, int end, int[] temporaryArray){
        int i = start, j = middle + 1, t = 0;

        while (i <= middle && j <= end){
            if (array[i] <= array[j]){
                temporaryArray[t++] = array[i++];
            } else {
                temporaryArray[t++] = array[j++];
            }
        }

        while (i <= middle){
            temporaryArray[t++] = array[i++];
        }

        while (j <= end){
            temporaryArray[t++] = array[j++];
        }

        System.arraycopy(temporaryArray, 0, array, start, t);
    }
}

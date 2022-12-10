package com.javacource.HW;

public class Ticket6 {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,444,56,78,66,9};
        arrConstrAndReturn(arr);
    }
    public static void arrConstrAndReturn(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if (i >= 3 && i <= 7) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

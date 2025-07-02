package arrRevers;

import java.util.Arrays;
import java.util.Scanner;

public class findSconedGreatNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your array size : ");
        int size = input.nextInt();
        if (size < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        int[] arr = new int[size];
        System.out.print("enter your array element : ");
        int n = 0;
        while (n < size) {
            arr[n] = input.nextInt();
            n++;
        }
//        Arrays.sort(arr);
//        System.out.println(arr[size-2]);
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second greatest number (all elements are same)");
        } else {
            System.out.println("Second greatest number: " + secondMax);
        }
    }
}
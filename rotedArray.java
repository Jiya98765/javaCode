package arrRevers;

import java.util.Scanner;

public class rotedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter k values :");
        int K = input.nextInt();

        System.out.print("enter array size");
        int size = input.nextInt();

        int[] arr = new int[size];
        for(int i= 0;i<size;i++){
            arr[i] = input.nextInt();
        }

        K = K%size;

        reverse(arr ,0,size-1);

        reverse(arr,0,K-1);
        reverse(arr,K,size-1);

        System.out.print("your output : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}

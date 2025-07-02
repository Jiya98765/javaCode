package arrRevers;

import java.util.Scanner;

public class arrRevarse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your array size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int n=0;
        while(n<size){
            arr[n] = input.nextInt();
            n++;
        }

        for(int i=0 ; i<size;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println(" ");

        for(int j=size-1;j>=0;j--){
            System.out.print(arr[j] +" ");
        }
    }
}

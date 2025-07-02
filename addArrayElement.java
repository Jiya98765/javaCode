package arrRevers;

import java.util.Scanner;

public class addArrayElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your array size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int sum =0 ;
        int n=0;
        while(n<size){
            arr[n] = input.nextInt();
            n++;
        }

        for(int i=0 ; i<size;i++){
            sum += arr[i];
        }

        System.out.println("your array element sum :" + sum);

    }
}

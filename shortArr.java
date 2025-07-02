package arrRevers;

import java.util.Arrays;
import java.util.Scanner;

public class shortArr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your array size");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("enter your array elements : ");
        int i=0;
        while(i<size){
            arr[i] = input.nextInt();
            i++;
        }

//        int tamp ;
//        for(int a =0;a<size;a++){
//            for(int b=a+1;b<size;b++){
//                if(arr[a] > arr[b]){
//                   tamp = arr[a];
//                   arr[a] = arr[b];
//                   arr[b]  =  tamp;
//                }
//            }
//            System.out.print(arr[a] +" ");
//        }

        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}

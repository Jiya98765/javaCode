package arrRevers;

import java.util.Scanner;

public class MaxProductOfATriplet {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("enter product");
        int product = input.nextInt();
        System.out.print("enter your array size : ");
        int size = input.nextInt();
        if (size < 3) {
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

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                for(int k=j+1;j<size;j++){
                    if(arr[i] + arr[j]+arr[k]== product){
                        System.out.println(i + " " +j+" "+k);
                    }
                }
            }
        }
    }
}

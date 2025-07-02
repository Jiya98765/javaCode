package arrRevers;

import java.util.Scanner;

public class three_largeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int n=0;
        while(n<size){
            arr[n] = input.nextInt();
            n++;
        }
        int first=0, second=0, third=0 ;
        for(int i=0;i<size;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];

            }else if(arr[i]>second){
                third = second;
                second = arr[i];
            }

        }
        System.out.print(third);
    }
}

package arrRevers;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size : ");

        int size = input.nextInt();
        int[] Arr =  new int[size];
        System.out.print("enter your array element : ");
        int i = 0 ;
        while(i<size){
             Arr[i] = input.nextInt();
            i++;
        }
        int max = Arr[0];
        int min = Arr[0];
        for(int j=0; j<size; j++){
            if(max<Arr[j]){
                max = Arr[j];
            }
            if(min>Arr[j]){
                min = Arr[j];
            }
        }
        System.out.println("min :" + min);
        System.out.println("max :" + max);

    }
}

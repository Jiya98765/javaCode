package arrRevers;

import java.util.Scanner;

public class countEvenOdd {
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
        int Even = 0;
        int Odd = 0;
        for(int j= 0;j<size;j++){
            if(Arr[j] % 2 ==0 ){
                Even ++;
            }
            else {
                Odd ++;
            }
        }
        System.out.println("total even number : "+Even);
        System.out.println("total odd number"+Odd);

    }
}

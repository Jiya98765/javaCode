package arrRevers;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number :");
        int number = input.nextInt();
        System.out.print("enter array size : ");
        int size = input.nextInt();
        int[] Arr = new int[size];
        System.out.print("enter your array element : ");
        int i = 0;
        while (i < size) {
            Arr[i] = input.nextInt();
            i++;
        }
        for(int j= 0;j<size;j++){
            if(Arr[j] == number){
                System.out.println("your index number :" + j +"-" + Arr[j]);
                return;
            }
        }
        System.out.println("number is not exist in this array !");
    }
}

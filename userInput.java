import java.util.Scanner;
// import java.util.scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please inter your name :");
        String name = input.nextLine();
        System.out.println("good morning " + name);

        System.out.println("hello "+name + " enter your age :");
        
        int age = input.nextInt();
        System.out.println("your age is = "+ age);
    }
}

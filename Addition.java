import java.util.Scanner;
public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to addition of two number: ");
        System.out.print("Please enter First number: ");
        int FirstNum = input.nextInt();
        System.out.print("please enter Second number: ");
        int SecondNum = input.nextInt();
        int sum = FirstNum + SecondNum;
        System.out.println("Sum of your number " + sum);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne;
        int numTwo;
        System.out.println("Please enter a number");
        numOne = scan.nextInt();
        System.out.println("Now please enter a second number");
        numTwo = scan.nextInt();
        if (numOne > numTwo) {
            System.out.println("The first number, " + numOne + ", is greater than your second number, " + numTwo + ".");
        }
        else if (numOne < numTwo) {
            System.out.println("The first number, " + numOne + ", is less than your second number, " + numTwo + ".");
        }
        else if (numOne == numTwo) {
            System.out.println("The first number, " + numOne + ", is equal to your second number, " + numTwo + ".");
        }

    }
}
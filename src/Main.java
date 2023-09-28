import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        System.out.println("Please enter a number");
        if (scan.hasNextInt()) {
            numOne = scan.nextInt();
            System.out.println("Now please enter a second number");
            if (scan.hasNextInt()) {
                numTwo = scan.nextInt();
                if (numOne > numTwo) {
                    System.out.println("The first number, " + numOne + ", is greater than your second number, " + numTwo + ".");
                } if (numOne < numTwo) {
                    System.out.println("The first number, " + numOne + ", is less than your second number, " + numTwo + ".");
                } if (numOne == numTwo) {
                    System.out.println("The first number, " + numOne + ", is equal to your second number, " + numTwo + ".");
                }
            }
        }
        else {
            System.out.println("You have entered an invalid integer value");
            System.exit(0);
        }

    }
}
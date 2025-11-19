import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(number < 1 || number > 10){
            System.out.print("Enter an integer for the multiplication table(1 to 10): ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number < 1 || number > 10)
                    System.out.println("Error: Number must be in the range of 1 to 10.");
            }else {
                System.out.println("Error. Please enter an integer.");
                scanner.next();
            }
        }

        System.out.println("Multiplication table for " + number + ":");

        for(int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
        System.out.println("Done.");
    }
}

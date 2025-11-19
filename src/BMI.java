import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight , height , bmi;

        System.out.print("Enter your weight in kilograms(e.g. 75.2): ");
        weight = scanner.nextDouble();

        System.out.print("Enter your height in meters (e.g. 1.85): ");
        height = scanner.nextDouble();

        scanner.close();

        System.out.print("Your Body Mass Index(BMI) is: ");
        bmi = weight / (height * height);
        System.out.println(bmi);

        if(bmi < 18.5) System.out.println("Underweight.");
        else if (bmi >= 18.5 && bmi < 25.0) System.out.println("Normal weight.");
        else if (bmi >= 25.0 && bmi < 30.0) System.out.println("Overweight.");
        else System.out.println("Obesity.");
    }
}

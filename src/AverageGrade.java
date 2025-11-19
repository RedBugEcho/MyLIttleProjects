import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] grades = new int[5];
        int totalSum = 0;
        int numberOfSubjects = grades.length;

        System.out.println("Enter your grades for 5 subjects(integers from 1 to 5).");

        for(int i = 0; i < numberOfSubjects ; i++){
            System.out.print("Enter grade for subject № " + (i + 1) +  " : ");

            if (scanner.hasNextInt()){
                int grade = scanner.nextInt();

                if (grade < 1 || grade > 5) {
                    System.out.println("Invalid grade. Value must be between 1 and 5. Try again.");
                    i--;
                }else{
                    grades[i] = grade;
                    totalSum += grade;
                }

            } else{
                System.out.println("Input error. Please enter an integer.");
                scanner.next();
                i--;
            }
        }

        double avarage = (double)totalSum / numberOfSubjects;

        System.out.println("----------------------------");
        System.out.println("\tTotal score: " + totalSum );
        System.out.println("\tAvarage grade: " + avarage );
        System.out.println("----------------------------");
    }
}

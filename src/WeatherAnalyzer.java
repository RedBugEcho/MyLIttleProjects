import java.util.Scanner;

public class WeatherAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temps = new double[7];
        double totalSum = 0;

        int dayOfTheWeek = temps.length;

        System.out.println("Welcome to the Weather Analyzer. Please enter the temperature for 7 days");
        for(int i = 0 ; i < dayOfTheWeek ; i++ ){
            System.out.print("Enter the temperature for Day #" + (i + 1) + " : ");
            if (scanner.hasNextDouble()){
                double temp = scanner.nextDouble();
                temps[i] = temp;
                totalSum += temp;

            } else {
                System.out.println("Input error. Please enter a numerical value.");
                scanner.next();
                i--;

            }

        }
        scanner.close();

        double maxTemp , minTemp;

        maxTemp = temps[0];
        minTemp = temps[0];

        for (int i = 1 ; i < temps.length; i++ ){
            if(temps[i] > maxTemp) {
                maxTemp = temps[i];

            }
            if (temps[i] < minTemp){
                minTemp = temps[i];
            }
        }

        double average = totalSum / temps.length;
        System.out.println("RESULTS:");
        System.out.println("Maximum temperature: " + maxTemp);
        System.out.println("Minimum temperature: " + minTemp);
        System.out.println("Average temperature: " + average);





    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TEMP CONVERSION

        Scanner scanner = new Scanner(System.in);

        //Declare variables

        double temp;
        double newTemp;
        String choice;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit: ");
        choice = scanner.next().toUpperCase();

        newTemp = choice.equals("C") || choice.equals("CELSIUS") ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        String unit = choice.equals("C") || choice.equals("CELSIUS") ? "C" : "F";
        System.out.printf("%.1f°%s", newTemp, unit);




        scanner.close();


    }
}

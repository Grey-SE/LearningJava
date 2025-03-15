import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("The hypotenuse of this triangle is " + c);

        scanner.close();


    }
}

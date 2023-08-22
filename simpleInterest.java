import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Interest Calculator");
        System.out.println("--------------------------");

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R) in percentage: 
");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the time period (T) in years: ");
        double timeInYears = scanner.nextDouble();

        scanner.close();

        double simpleInterest = (principal * rateOfInterest * timeInYears) 
/ 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}


public class simpleInterest {

    public static void main(String[] args) {

        System.out.println("Simple Interest Calculator");
        System.out.println("--------------------------");

        double principal = 1000.00;

        double rateOfInterest = 50.00;

        double timeInYears = 21.00;

        double simpleInterest = (principal * rateOfInterest * timeInYears) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}


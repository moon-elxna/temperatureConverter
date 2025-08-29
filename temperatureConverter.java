import java.util.Scanner;

public class temperatureConverter {

    public static String inputFromUnit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("From which temperature unit do you want to convert?(C/F/K)");
        String fromUnit = scanner.nextLine();
        return fromUnit;
    }

    public static String inputToUnit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To which temperature unit do you want to convert?(C/F/K)");
        String toUnit = scanner.nextLine();
        return toUnit;
    }

    public static double inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number!");
        String userInput = scanner.nextLine();
        double number = Double.parseDouble(userInput);
        return number;
    }

    public static double convert(String u, double n) {
        double answer = 0;
        double x;
        if (u.equals("CF")) {
            x = (n * 1.8);
            answer = x + 32;

        } else if (u.equals("CK")) {
            answer = n + 273.15;

        } else if (u.equals("FC")) {
            x = n - 32;
            answer = x * 0.5555555556;

        } else if (u.equals("FK")) {
            x = n + 459.67;
            answer = x * 0.5555555556;

        } else if (u.equals("KC")) {
            answer = n - 273.15;

        } else if (u.equals("KF")) {
            x = n * 1.8;
            answer = x - 459.67;

        } else if (u.equals("CC") || u.equals("KK") || u.equals("FF")) {
            System.out.println("You can't convert in the unit you coverting from!");

        } else {
            System.out.println("Error!");

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(convert((inputFromUnit() + inputToUnit()), inputNumber()));

    }

}

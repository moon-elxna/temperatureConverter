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

    public static double convert(String Unit, double n) {
        double answer = 0;
        switch (Unit) {
            case "CF":
                answer = ((n * (9 / 5)) + 32);
                break;
            case "CK":
                answer = n + 273.15;
                break;
            case "FC":
                break;
            case "FK":
                break;
            case "KC":
                break;
            case "KF":
                break;
            default:
                System.out.println("Error!");
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        String fromUnit = inputFromUnit();
        String toUnit = inputToUnit();
        String Unit = fromUnit + toUnit;
        System.out.println(Unit);
        double number = inputNumber();
        double answer = convert(Unit, number);
        System.out.println(answer);

    }

}

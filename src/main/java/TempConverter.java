import java.util.Scanner;

public class TempConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // ✅ Main method (entry point)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Kelvin to Celsius");
        System.out.print("Choose option: ");

        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        double result;

        switch (choice) {
            case 1:
                result = celsiusToFahrenheit(temp);
                System.out.println("Fahrenheit: " + result);
                break;
            case 2:
                result = fahrenheitToCelsius(temp);
                System.out.println("Celsius: " + result);
                break;
            case 3:
                result = kelvinToCelsius(temp);
                System.out.println("Celsius: " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
package challenge1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Temperature Converter");
                System.out.println("1.Fahrenheit to Celsius");
                System.out.println("2.Celsius to Fahrenheit");
                System.out.println("Choose an option (1 or 2):");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        //Fahrenheit to Celsius conversion
                        System.out.println("Enter temperature in Fahrenheit: ");
                        double fahreneit = scanner.nextDouble();
                        double celsius = (fahreneit - 32) * 5 / 9;
                        System.out.println(fahreneit + " F is equal to" + celsius + " C.");
                        break;

                    case 2:

                        //Celsius to Fahrenheit conversion
                        System.out.println("Enter the temperature in Celsius");
                        celsius = scanner.nextDouble();
                        fahreneit = (celsius * 9 / 5) + 32;
                        System.out.println(celsius + "C is equal to" + fahreneit + "F.");

                        break;

                    default:
                        //Handle invalid input
                        System.out.println("Invalid Choice!Please choose 1 or 2");

                }
                //Close the scanner
        scanner.close();






    }
}

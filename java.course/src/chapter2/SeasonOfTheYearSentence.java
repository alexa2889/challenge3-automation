package chapter2;

import java.util.Scanner;

public class SeasonOfTheYearSentence {

public static void main(String[] args) {

//Create a scanner object to read input
Scanner scanner = new Scanner(System.in);

    //1.Get the season of the year
    System.out.println("Enter a season of the year.");
    String season =scanner.nextLine();

    //2.Get a whole number
    System.out.println("Enter a whole number.");
    int number = scanner.nextInt();//Consume the leftover newline

    //3.Get an adjective
    System.out.println("Enter an adjective.");
    String adjective = scanner.nextLine();

    //4.Output the completed sentence

    System.out.println("On a " +adjective +" " +season + "day, I drink a minimum of " + number + " cups of coffe.");
                       //Close the scanner scanner.close
}
}

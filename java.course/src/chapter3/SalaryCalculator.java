package chapter3;
/*
If Statements
All salespeople get a payment of $1000 a week.
Sales people who exceed 10 sales get an additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        //Initialize known values
        int salary =1000;
        int bonus =50;
        //Get values for the unknown
        System.out.println("How many sales did the employee did this week?");
        Scanner scanner=new Scanner (System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > 10){
            salary = salary + bonus;

        }
        //Output
        System.out.println("The employee's pay is $" + salary);

    }
}

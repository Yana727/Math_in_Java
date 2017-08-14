package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // everytime you want to read from the console
        Scanner scanner = new Scanner(System.in);


        System.out.println("Must input two numbers");

        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();

        System.out.println("You have enter " + number1 + " and " + number2);
        showResults(number1, number2);
    }

    public static void showResults(String number1, String number2){
        double operand1 = Double.parseDouble(number1);
        double operand2 = Double.parseDouble(number2);
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        boolean isEven = false;

        if ((operand1 % operand2) == 0) {
            isEven = true;
        }
        System.out.println("the sum is " + sum);
        System.out.println("the difference is " + difference);
        System.out.println("the miltiplication is " + multiplication);
        System.out.println("the division is " + division );
    }
}


package com.training;

import java.util.Scanner;

import static com.training.MathTasks.*;


public class Main {

    public static boolean appRun = true;


    public static void menu() {
        System.out.println(" = = = ");
        System.out.println("Co chcesz obliczyć? ");
        System.out.println("   ---   ");
        System.out.println("1 - silnia");
        System.out.println("2 - ciag Fibonacciego");
        System.out.println("3 - mediana");
        System.out.println("4 - FizzBuzz");
        System.out.println("0 - wyjscie");
    }

    public static void main(String[] args) {

        boolean appRun = true;


        while (appRun) {

            menu();
            Scanner scan = new Scanner(System.in);
            int key = scan.nextInt();
            switch (key) {
                case 0:
                    appRun = false;
                    break;

                case 1:
                    factorial();
                    break;

                case 2:
                    fibonacci();
                    break;

                case 3:
                    medium();
                    break;

                case 4 :
                    fizzbuzz();


                default:
                    System.out.println("Wybierz jedna z opcji");
            }
        }
    }
}

package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathTasks {

    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj dla jakiej liczby mam obliczyć silnię: ");
        int factorial = scan.nextInt();
        int expected = 1;
        for (int x = 1; x <= factorial; x++) {
            expected = expected * x;
        }
        String outFac = ("Silnia z " + factorial + " wynosi " + expected);
        System.out.println(outFac);
    }

    public static void fizzbuzz() {
        System.out.println("Podaj liczbę w zakresie 1-100: ");
        Scanner scan = new Scanner(System.in);
        int param = scan.nextInt();
        if (param % 3 == 0 && param % 5 != 0) {
            System.out.println("Fizz - liczba podzielna jest przez 3");
        } else if (param % 5 == 0 && param % 3 != 0) {
            System.out.println("Buzz - liczba podzielna jest przez 5");
        } else if (param % 3 == 0 && param % 5 == 0) {
            System.out.println("FizzBuzz - liczba podzielna jest przez 3 i 5");
        } else {
            System.out.println("Liczba jest niepodzielna ani przez 3 ani przez 5");
        }
    }

    public static void medium() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dla ilu wartości mam obliczyc medianę? ");
        int med_length = scan.nextInt();
        List<Integer> medianList = new ArrayList<>();
        for (int x = 0; x < med_length; x++) {
            System.out.println("Podaj wartość do obliczenia mediany: ");
            Integer list_val = scan.nextInt();
            medianList.add(list_val);
        }
        medianList.sort(null);
        if (!(med_length % 2 == 0)) {
            double median = medianList.get((med_length + 1) / 2 - 1);
            System.out.println("Dla ciągu wartości: " + medianList.toString() + " mediana wynosi: " + median);
        } else {
            double median = ((double) medianList.get(med_length / 2 - 1) + (double) medianList.get(med_length / 2)) / 2;
            System.out.println("Dla ciągu wartości: " + medianList.toString() + " mediana wynosi: " + median);
        }
    }

    public static int fib(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void fibonacci() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Którą liczbę w ciągu Fibonacciego mam obliczyć: ");
        int n = scan.nextInt();
        String outFib = (n + "liczba w ciagu fibonacciego to liczba " + fib(n));
        System.out.println(outFib);

    }
}

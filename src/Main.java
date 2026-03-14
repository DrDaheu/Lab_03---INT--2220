//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Bishop Daheu
Lab - 03
03/14/2026
Recursion in Java
 */


public class Main {

    // Recursive method to compute the series
    public static double m(int i) {

        if (i == 1) {           // Base case
            return 1.0;
        }

        return (1.0 / i) + m(i - 1);   // Recursive case
    }

    // Method to display the series
    public static void displaySeries() {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("m(%d) = %.4f\n", i, m(i));
        }
    }

    public static void main(String[] args) {

        displaySeries();
    }

}
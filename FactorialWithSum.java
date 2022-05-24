/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial.with.sum;

import javax.swing.JOptionPane;

/**
 *
 * @author Aldous
 */
public class FactorialWithSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number:", "Factorial Calculator", JOptionPane.PLAIN_MESSAGE));
        long factorial = 1;

        if (number < 0) {
            System.out.println("Cant find the factorial of negative number");
        } else if (number <= 1) {
            System.out.printf("%d! = %d", number, factorial);
        } else {
            for (int count = number; count >= 2; count--) {
                factorial = factorial * count;
            }
            JOptionPane.showMessageDialog(null, number + "! = " + factorial);
        }

        long num = factorial;
        long rem;
        long sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        JOptionPane.showMessageDialog(null, "The sum of the numbers in factorial is " + sum);
    }

}

package org.Pyramid;

import java.util.Scanner;

public class PyramidFor_1X_WhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter Number of Rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter X: ");
        int x = sc.nextInt();

        int row = 0;
        int number_multiplyBy = 0;  // Start from 0

        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print(number_multiplyBy + "\t");
                number_multiplyBy = number_multiplyBy + x;  // Increment by X
                col++;
            }
            System.out.println();
            row++;
        }
    }
}

package Pyramid_Programs;

import java.util.Scanner;

public class PyramidFor_1X_For_Loop {
    public static void main(String[] args) {
        System.out.println("Enter Number of Rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter X: ");
        int x = sc.nextInt();

        int row = 0;
        int number_multiplyBy = 0;  // Start from 0

        for (row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(number_multiplyBy + "\t");
                number_multiplyBy = number_multiplyBy + x; //1
            }
            System.out.println();
        }
    }
}


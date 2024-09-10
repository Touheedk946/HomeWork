package JavaSimple.Pyramid;

import java.util.Scanner;

public class PyramidFor_1X_DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter Number of Rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter X: ");
        int x = sc.nextInt();

        int row = 0;
        int number_multiplyBy = 0;  // Start from 0

        do {
            int col = 0;
            do {
                System.out.print(number_multiplyBy + "\t");
                number_multiplyBy = number_multiplyBy + x; //1
                col++;     //1
            } while (col <= row);
            System.out.println();
            row++;
        } while (row < n);
    }
}

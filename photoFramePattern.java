package star_pattern;

import java.util.*;

public class photoFramePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int N = sc.nextInt();
        System.out.println();

        for (int row=1; row<=N; row++) {
            for (int col=1; col<=N; col++) {
                if (row == 1 || row == N || col == 1 || col == N) {
                    System.out.print("*");
                }
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
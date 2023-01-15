package class8;

import java.util.Scanner;

public class Repil63 {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner fetch=new Scanner(System.in);
        int x=fetch.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(i+ " ");// this print numbers on the same line
        }
        System.out.println();
    }
}

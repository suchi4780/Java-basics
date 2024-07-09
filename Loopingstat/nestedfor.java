package Loopingstat;

import java.util.Scanner;

public class nestedfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of i and j: ");
        int k = sc.nextInt();
        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            for(int j=0;j<k;j++) {
                System.out.println(i);
            }
            System.out.println();    
        }
    }
}

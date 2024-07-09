package Loopingstat;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int n = sc.nextInt();
        System.out.println("Even numbers upto "+ n +" : \n");
        for(int i=0; i<=n;i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}

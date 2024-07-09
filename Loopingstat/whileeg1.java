package Loopingstat;

import java.util.Scanner;

public class whileeg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i =0;

        while (i <= num) {
            if(i%2 == 0) {
                System.out.println(i);
            }
            i++;    
        }
    }
}

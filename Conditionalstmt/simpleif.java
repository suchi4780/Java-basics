package Conditionalstmt;

import java.util.Scanner;

public class simpleif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if(num >= 10) {
            System.out.println(num+" is greater than or equal to 10");
        }
    }
}

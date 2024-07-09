package functions;

import java.util.Scanner;

public class argretuen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition result is: "+add(a,b));
    }

    public static void add(int num1, int num2) {
        return num1+num2;
    }

}    

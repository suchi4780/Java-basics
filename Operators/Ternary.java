package Operators;

public class Ternary {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int max = a<b ? a:b;
         System.out.println("sum = "+ max );
         System.out.println("sum = "+ (a>b || a==b ) );
         System.out.println("sum = "+ (!true) );
         System.out.println("sum = "+ (a<=b) );
         System.out.println("sum = "+ (!(a==b)) );
         System.out.println("sum = "+ (a!=b) );
    }
}

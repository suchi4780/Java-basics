package functions;

public class recursivefunc {
    public static void main(String[] args) {
        view();
    }
    public static void view() {
        int a=10, b = 20;
        System.out.println(a+b);
        view();
    }
}

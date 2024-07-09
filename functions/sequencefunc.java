package functions;

public class sequencefunc {
    static int val;
    public static int add(int num) {
        val = val+num;
        return val;
    }

    public static int sub(int num) {
        val = val-num;
        return val;
    }
    public static void main(String[] args) {
        System.out.println(add(num:10));
        System.out.println(sub(num:5));
    }
}

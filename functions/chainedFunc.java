package functions;

public class chainedFunc {
   
    static int val;
        public static void add(int num) {
            val = val+num;
            sub(num:5);
        }

        public static void sub(int num) {
            val = val-num;
            System.out.println(val);
        }
        public static void main(String[] args) {
            add(num:10);
        }
}

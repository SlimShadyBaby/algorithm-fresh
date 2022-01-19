package code;

public class BitCode {

    public static void print(int num) {
        for (int i = 31; i>=0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void negate() {
        int a = -123;
        print(a);
        print(~a);
        System.out.println(-5);
        System.out.println(~-5);

    }

    public static void main(String[] args) {
        negate();
    }
}
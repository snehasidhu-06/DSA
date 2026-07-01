public class BitwiseOperator {

    static void main() {

        int a = 5;
        int b = 6;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        int n = 1;
        for (int i = 1; i <= 32; i++) {
            n = n << 1;// left shit
            System.out.println(n);
            System.out.println();
        }

        // >> - right shift
        int m = 100;
        for (int i = 1; i <= 10; i++) {
            m = m >> 1;
            System.out.println(n);
            System.out.println();

        }
    }

}

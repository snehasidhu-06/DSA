public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 6; // Binary: 0110

        // Bitwise operations
        System.out.println(a & b); // Bitwise AND: 4 (0100)
        System.out.println(a | b); // Bitwise OR: 7 (0111)
        System.out.println(a ^ b); // Bitwise XOR: 3 (0011)

        // Left shift loop
        int n = 1;
        for (int i = 1; i <= 32; i++) {
            n = n << 1; // Multiplies by 2
            System.out.println(n);
        }

        // Right shift loop
        int m = 100;
        for (int i = 1; i <= 10; i++) {
            m = m >> 1; // Divides by 2
            System.out.println(m);
        }

        // Even/Odd check
        int p = 11;
        if ((p & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // To check power of 2 - count the set bit
        int q = 5;
        int count = 0;
        while (q != 0) {
            if ((q & 1) == 1) {
                count++;
            }
            q = q >> 1; // Right Shift to remove this bit
        }
        System.out.println("Set bit count : " + count);

        // Direct power of 2 check
        int k = 16;
        if ((k & (k - 1)) == 0) {
            System.out.println("yes, power of 2 ");
        } else {
            System.out.println("No");
        }
    }
}

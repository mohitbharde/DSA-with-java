package Recursion;

public class PowerOfN {
    static int powerOfN(int x, int n) {
        if (n == 0)
            return 1;
        int halfpow = powerOfN(x, n / 2);
        if (n % 2 != 0) {
            return x * halfpow * halfpow;
        } else {
            return halfpow * halfpow;
        }
    }

    public static void main(String[] args) {
        System.out.println(powerOfN(2, 4));
    }
}

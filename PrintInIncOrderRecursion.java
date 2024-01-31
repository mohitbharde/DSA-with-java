public class PrintInIncOrderRecursion {
    public static void incOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        incOrder(n - 1);
        System.out.print(n + " ");
        return;
    }

    public static void main(String[] args) {
        incOrder(10);
    }
}

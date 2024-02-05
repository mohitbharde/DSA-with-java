public class NumberToStringRecursion {
    static void numberToString(int n) {
        if (n <= 0) {
            return;
        }
        int word = n % 10;
        switch (word) {
            case 0:
                numberToString(n / 10);
                System.out.print("zero ");
                return;
            case 1:
                numberToString(n / 10);
                System.out.print("one ");
                return;
            case 2:
                numberToString(n / 10);
                System.out.print("two ");
                return;
            case 3:
                numberToString(n / 10);
                System.out.print("three ");
                return;
            case 4:
                numberToString(n / 10);
                System.out.print("four ");
                return;
            case 5:
                numberToString(n / 10);
                System.out.print("five ");
                return;
            case 6:
                numberToString(n / 10);
                System.out.print("six ");
                return;
            case 7:
                numberToString(n / 10);
                System.out.print("seven ");
                return;
            case 8:
                numberToString(n / 10);
                System.out.print("eight ");
                return;
            case 9:
                numberToString(n / 10);
                System.out.print("nine ");
                return;

            default:
                return;
        }
    }

    public static void main(String[] args) {
        numberToString(2000);
    }
}

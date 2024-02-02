public class BinaryStringRecursion {
    static void binaryString(int length, char lastIndex, String str2) {
        if (length == 0) {
            System.out.println(str2);
            return;
        }
        binaryString(length - 1, '0', str2 + "0");
        if (lastIndex == '0') {
            binaryString(length - 1, '1', str2 + "1");
        }
    }

    public static void main(String[] args) {
        String str = new String();
        binaryString(4, '0', str);
    }
}

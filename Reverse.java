public class Reverse {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Give a String of min 1 letter");
            return;
        }
        String x = args[0];
        int a = x.length() - 1;
        int y = a / 2;
        char z = x.charAt(y);
        String b = "";

        while (a >= 0) {
            b += x.charAt(a);
            a -= 1;
        }

        System.out.println(b);
        System.out.println("The middle character is " + z);
    }
}

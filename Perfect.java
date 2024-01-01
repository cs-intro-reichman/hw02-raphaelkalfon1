public class Perfect {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }

        if (sum == N) {
            System.out.println(N + " is a perfect number since " + N + " = " + sum);
        } else {
            System.out.println(N + " is not a perfect number");
        }
    }
}

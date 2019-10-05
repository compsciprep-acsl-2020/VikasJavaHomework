public class Exercise2 {

    public static void main (String[] args) {
        fibonacci(1, 2);
    }

    static int sum = 0, fibonacciSequence = 0;

    public static void fibonacci (int i, int j) {

        fibonacciSequence = j;
        if (fibonacciSequence <= 4000000) { // 4 million
            if (j % 2 == 0) {
                sum += j;
            }
            fibonacci(j, i + j);
        } else {
            System.out.println(sum);
        }
    }
}

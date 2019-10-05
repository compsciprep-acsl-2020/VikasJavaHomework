public class Excercise1 {
    int i;
    public static int sumMupltiple(int num, int limit) {
        int Mulitples = (limit - 1) / num;
        return num * (Mulitples * (Mulitples + 1) / 2);
    }

    public static void main(String[] args) {
        System.out.println(
                sumMupltiple(3, 1000) + sumMupltiple(5, 1000) - sumMupltiple(15, 1000));

    }
}
}

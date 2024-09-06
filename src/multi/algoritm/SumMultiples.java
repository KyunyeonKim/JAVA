package multi.algoritm;

public class SumMultiples {
    public static void main(String[] args) {
        int a = 1000;
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("1000보다 작은 3 또는 5의 배수의 합: " + sum);
    }
}

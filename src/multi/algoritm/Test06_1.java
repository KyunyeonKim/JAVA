package multi.algoritm;

public class Test06_1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i <=a; i++) {
            sum1 += i*i;
        }

        for (int i = 0; i <=b ; i++) {
            sum2 += i;
        }
        int sum3 = sum2 * sum2;

        int sum4 = sum3 - sum1 ;


        System.out.println(sum1);
        System.out.println(sum3);
        System.out.println(sum4);


    }
}

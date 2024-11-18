package ThisJava.ch02;

public class FloatDoubleExample {
    public static void main(String[] args) {

        //double타입이 float타입보다 약 2배정도의 길이를 가진다
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1= " + var1);
        System.out.println("var2= " + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6f;
        double var5 = 2e-3;
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}

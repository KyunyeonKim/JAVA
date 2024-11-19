package ThisJava.ch02;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("int Value:"+intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드:"+intValue);

        int Value = 50;
        long longValue=intValue;
        System.out.println("long Value:"+longValue);

        longValue = 100;
        float floatValue=longValue;
        System.out.println("float Value:"+floatValue);

        floatValue = 100.5F;
        double doubleValue=floatValue;
        System.out.println("double Value:"+doubleValue);
    }
}

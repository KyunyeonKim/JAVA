package multi.testt;

import java.math.BigInteger;

public class Main07BigIntegerBigDemical {
    public static void main(String[] args) {


        int money = 1000000;
        int ea = 1000000;
        System.out.println(money+ea);
        System.out.println(money-ea);
        System.out.println(money*ea);
        System.out.println(money/ea);
        System.out.println(money%ea);

        BigInteger bmoney = new BigInteger("2100000000");
        BigInteger bea = new BigInteger("200000000");
        System.out.println(bmoney.add(bea));

    }
}

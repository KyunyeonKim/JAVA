package multi.hello;

public class Hello {

    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("hello\n");
        System.out.println("hello");
        System.out.println("");
        System.out.println("kim");

        System.out.println("hello");


        int a = 10;
        double b = 99.99;
        System.out.println("a" + a + "b" + b);
        System.out.println("a" + a);
        System.out.printf("a:%d,b:%f\n",a,b);

        String name ="kim";
        System.out.println("name" + name);
        System.out.printf("name:%s\n", name);

        System.out.printf("boolean :%b\n",true);
        System.out.printf("boolean :%B\n",true);

        System.out.printf("name:%5s, age:%d\n","lee",33);
        System.out.printf("name:%-5s, age:%d\n","lee",33);

        System.out.printf("10진수:%d,%d,%d,%d,%d,%d",10,11,12,13,14,15);
        System.out.printf("16진수:%x,%x,%x,%x,%x,%x",10,11,12,13,14,15);
        System.out.printf("8진수:%o,%o,%o,%o,%o,%o",10,11,12,13,14,15);

        System.out.println(Integer.toBinaryString(10)); // 1010 이진비트단위
        System.out.println(Integer.toHexString(10)); // 1010 이진비트단위
        System.out.println(Integer.toOctalString(10)); // 1010 이진비트단위

    }
}

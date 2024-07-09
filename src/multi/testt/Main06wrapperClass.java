package multi.testt;

public class Main06wrapperClass {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);

        //10진수 >> 8진수
        System.out.println(Integer.toString(12,2));
        System.out.println(Integer.toOctalString(15));

        //10진수>>16진수
        System.out.println(Integer.toString(15,16));
        System.out.println(Integer.toHexString(15));

        System.out.println(Integer.toString(12,2));
        System.out.println(Integer.toOctalString(15));


        //integer타입에 정수가 할당되었을때 주의할점
        //1byte 범위(-124~124)범위를 넘어가면 equals을 사용해서 비교해야한다.
        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

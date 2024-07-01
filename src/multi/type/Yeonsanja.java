package multi.type;

public class Yeonsanja {
    public static void main(String[] args) {

        //1.산술연산자
        System.out.println(10+3);
        System.out.println(10-3);
        System.out.println(10*3);
        System.out.println(10/3);
        System.out.println(10%3);
        System.out.println(Math.round(10/3.0)); //소숫점이하 반올림
        System.out.println(Math.ceil(10/3.0)); //소숫점이하 올림
        System.out.println(Math.floor(10/3.0)); // 소숫점이하 버림

        System.out.println(10%3.0);

        //2. 증감연산자 ++,--
        int a = 100;
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println("===============");
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        //3.복합대입연산자
        int x =10;
        System.out.println(x+=10);
        System.out.println(x-=10);
        System.out.println(x*=10);
        System.out.println(x/=10);
        System.out.println(x%=10);
        System.out.println("===============");

        //4.비트연산자
        System.out.println(10&3);
        System.out.println(10|3);
        System.out.println(10^3);

        x=10;
        System.out.println(x &= 3);

        x=10;
        System.out.println(x &= 3);

        x=10;
        System.out.println(x |= 3);

        x=10;
        System.out.println(x ^= 3);

        //5.비교연산자 ==,!=,>,<,>=,<=
        System.out.println(5==5);
        System.out.println(5!=5);
        System.out.println(5>5);
        System.out.println(5>=5);
        System.out.println(5<=5);
        System.out.println("=============");


        //6.논리연산자 &,|,&&,||
        //연산자 좌우츨은 반드시 boolean타입만 적용

        System.out.println(true & true);
        System.out.println(true | true);
        System.out.println(true && true);
        System.out.println(true || true);

        System.out.println("==============");


        //7. 쉬프트 연산자 >>,<<,>>>
        System.out.println(8>>1); //*1/2
        System.out.println(8>>2); //*1/4
        System.out.println(8<<1); //*2
        System.out.println(8<<2); //*4
        System.out.println(-8>>>1); //*4


        //8. 조건 연산자(제어연산자, 삼항연산자)
        double avg = 90.0;
        System.out.println(avg >= 90? "A":"B");
        System.out.println(avg >= 90?"A" :avg>=80?"B":"C");

        //9. 기타연산자() , .... [] new instaneof

    }
}

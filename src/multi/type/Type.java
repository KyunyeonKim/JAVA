package multi.type;

public class Type {
    public static void main(String[] args) {
        //1.기본 타입(8개)
        //byte,short,int,long,float,double,boolean


        //byte - 1byte : 정수(0,양수,음수)
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        byte bt = 127;
        System.out.println(bt);
        System.out.println(++bt);
        System.out.println(++bt);

        //short -2byte 정수 : 0000 0000 0000 0000
        System.out.println(Short.MIN_VALUE+"~"+ Short.MAX_VALUE);
        short st = 32767;
        System.out.println(st);
        System.out.println(++st);
        System.out.println(++st);

        //int -4byte 정수:0000 0000 * 4
        //자바의 기본정수타입
        System.out.println(Integer.MIN_VALUE+"~"+ Short.MAX_VALUE);
        int i = 2147483647;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(++i);

        //long -8byte 정수:0000 0000 * 8
        //기본정수 int 와 구분학 위해서 또는 int범위값을 벗어날때 l을추가로담\
        System.out.println(Long.MIN_VALUE+"~"+ Short.MAX_VALUE);
        long l = 922323233L;
        System.out.println(l);
        System.out.println(++l);
        System.out.println(++l);

        //boolean - 1byte : true,false
        System.out.println(Boolean.FALSE+","+Boolean.TRUE);
        boolean bool = true;
        System.out.println(bool);
        System.out.println(!bool);

        //float - 4byte
        //실수의 기본타입 double과 구분하기위해 f를 표기한다
        System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
        float f = 3.14f;
        System.out.println(f);

        //double - 8byte
        System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
        double d = 3.14;
        System.out.println(d);


        //char - 2byte
        System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
        char c = 65;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(++c);

        char c2 = 'A';
        System.out.println(c2);
        System.out.println((int)c2);


        //2.참조 타입(무한대) - new 연산자로 주소를 생성할수있는 모든타입
        //문자열,배열,객체

        String name = "kim";
        String name2 = new String("kim");
        System.out.println(name);
        System.out.println(name2);

        String[] names = {"kim","lee","han"};
        System.out.println(names);

        int [] sus = new int[]{11,22,33};
        System.out.println(sus);

        String txt = "99";
        System.out.println(txt+88);
        System.out.println(Integer.parseInt(txt+88));

        txt = "3.14";
        System.out.println(txt+ 3.14);
        System.out.println(Double.parseDouble(txt)+3.14);

        //타입별 기본값(default value)
        //byte,short,char,int,long = 0
        //boolean = false
        //float,double = 0.0f, 0.0
        //참조 타입 = null(new 연산이 발생되기전 메모리 주소가 없는 상태)

        //자주쓰는 char 정리 0~9, a~z , A~Z ,+,-,*,/
        System.out.println((int)'0');
        System.out.println((int)'a');
        System.out.println((int)'A');
        System.out.println((int)'+');

        for(int x = 40; x<200; x++){
            System.out.println((char)x+ " ");
        }
    }
}

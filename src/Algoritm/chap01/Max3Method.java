package Algoritm.chap01;

public class Max3Method {

    static int max3(int a, int b ,int c){
        int max= a;
        if(b>max)
            max = b;
        if(c>max)
            max=c;
        return max;
    }


    public static void main(String[] args) {
        System.out.println("max(3,2,1)=" + max3(3,2,1));
        System.out.println("max(3,2,1)=" + max3(3,2,2));
        System.out.println("max(3,2,1)=" + max3(3,1,2));
        System.out.println("max(3,2,1)=" + max3(3,2,3));
        System.out.println("max(3,2,1)=" + max3(2,1,3));
        System.out.println("max(3,2,1)=" + max3(3,3,2));
        System.out.println("max(3,2,1)=" + max3(3,3,3));
        System.out.println("max(3,2,1)=" + max3(2,2,3));
        System.out.println("max(3,2,1)=" + max3(2,3,1));
        System.out.println("max(3,2,1)=" + max3(2,3,2));
        System.out.println("max(3,2,1)=" + max3(1,3,2));
        System.out.println("max(3,2,1)=" + max3(2,3,3));
        System.out.println("max(3,2,1)=" + max3(1,2,3));

    }
}

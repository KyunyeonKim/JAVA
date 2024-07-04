package multi.array;



public class Main {

    public static void main(String[] args) {
        int a= 10;
        int b = 22;
        int c = 33;

        int [] arr = new int[]{11,22,33};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("arr.length:"+arr.length);


        for(int i=1; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int x : arr){
            System.out.println(x);
        }

        //1.2,2.2,33을 데이터로 하는 배열을 만들고 출력하기
        double j = 1.2;
        double k = 2.2;
        double l = 3.3;

        double [] arrs = new double[]{ 1.2,2.2,3.3};
        for(int i = 0; i< arrs.length; i++){
            System.out.println(arrs[i]);
        }
        //a

        char [] cs = new char[]{'a','b','c'};

        for(int i = 0; i< arrs.length; i++){
            System.out.println(cs[i]);
        }

    }


}

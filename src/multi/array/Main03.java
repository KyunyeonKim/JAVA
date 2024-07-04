package multi.array;



public class Main03 {

    public static void main(String[] args) {

        int [] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for(int x:arr){
            System.out.println(x);
        }

        double[] ds = new double[5];


        for (int i = 0; i < ds.length; i++) {
            ds[i] = (i + 1) * 10.0; // i가 0부터 시작하므로 (i + 1) * 10.0을 사용하여 10, 20, 30, 40, 50 할당
        }
        for (int i = 0; i <ds.length ; i++) {
            System.out.println(ds[i]);
        }

        System.out.println("log1");





        // 결과 출력





        //ds:10.0,20.0,30.0


        for(double x:ds){
            System.out.println(x);
        }

        boolean[] bs = new boolean[5];
        for (int i = 0; i <bs.length ; i++) {
            System.out.println(bs[i]);
        }

        for(boolean x:bs){
            System.out.println(x);
        }

        for(int i = 0; i < bs.length; i++){
            if(i%2==0) bs[i] = true;
        }



        String[] strs = new String[5];
        for (int i = 0; i <strs.length ; i++) {
            System.out.println(strs[i]);
        }


        for (int i = 0; i < strs.length; i++) {
            strs[i] = "kim"+ (i+1);
        }

        for(String x:strs){
            System.out.println(x);
        }

    }

}

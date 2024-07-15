package multi.java17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main03 {
    public static void main(String[] args) {


        try{
            test01();
        }catch (Exception ex){
            System.out.println("catch...");
        }

        try {
            test02();
        }catch (Exception ex){
            System.out.println("catch...");
        }



    }

    private static void test01()throws ArithmeticException{

        System.out.println(Integer.parseInt("a001"));

    }

    private static void test02() throws ArithmeticException, IOException {

        BufferedReader br = null;
        InputStreamReader isr = null;
        InputStream ls = null;

        ls =System.in;
        isr = new InputStreamReader(ls);


        try {
            String name = br.readLine();

            System.out.println(Integer.parseInt("a001"));
        }catch (IOException e){
            System.out.println("catch...");
        }finally {
            try {
                br.close();
            }catch (IOException e){

            }

        }
    }
}

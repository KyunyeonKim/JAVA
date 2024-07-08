package multi.type;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main06_do_while {
    public static void main(String[] args)  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x= "y";
        while (x.equals("aaaa")){

            System.out.println("계속하실려면 아무키 입력... 종료시[x]입력");
        }while (x.equals("aaaa"));

    }//end main
}//end class

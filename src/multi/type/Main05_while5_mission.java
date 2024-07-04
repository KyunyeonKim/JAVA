package multi.type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_while5_mission {
    public static void main(String[] args) throws IOException {

        //BufferReader 객체 생성 및 초기화(i0~3단 콤보)
        //main 메소드에  add throws(예외전가)

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("종료시 x입력하세요");
            String x= br.readLine();
            if(x.equals("x"))break;

        }

        System.out.println("end");
    }


}

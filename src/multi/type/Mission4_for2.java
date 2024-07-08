package multi.type;

import java.io.IOException;

public class Mission4_for2 {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            // 각 줄에 0부터 9까지의 숫자를 출력하기 위한 내부 루프
            for (int j = 0; j < 10; j++) {
                System.out.print(j); // 숫자를 출력
            }
            System.out.println(); // 각 줄의 끝에 줄 바꿈을 추가
        }


        for (int i = 0; i < 3; i++) {
            // 각 줄에 0부터 9까지의 숫자를 출력하기 위한 내부 루프
            for (int j = 0; j < 10; j++) {
                System.out.print(j); // 숫자를 출력
            }
            System.out.println(); // 각 줄의 끝에 줄 바꿈을 추가
        }

        first:for(int i = 0; i<3; i++){
           second: for(int j= 0; j<3; j++){
                for(int k= 0; k<10; k++){
                    System.out.print(k+"");
                    if(k==5)break second;
                }
                System.out.println();

            }
            System.out.println();
        }



    }//end main
}//end class
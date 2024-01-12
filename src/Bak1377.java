import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Bak1377 {
    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //버퍼를 이용해 입력받음
        int N = Integer.parseInt(reader.readLine());// 정수 N개를 입력받아 숫자의 개수를 나타낸다

        mData[] A = new mData[N]; //mData 타입의 배열 A를 사용하여 입력받은 숫자들을 저장합니다.
        for(int i=0; i < N; i++){
            A[i] = new mData(Integer.parseInt(reader.readLine()),i);
        } ////각 숫자를 저장하는 mData 객체를 만들어 배열에 추가함

        Arrays.sort(A);
        int Max = 0;
        for(int i=0; i < N; i++){
            if(Max < A[i].index - i)
                Max = A[i].index - i;
        }
        System.out.println(Max + 1);
    }
}

class mData implements Comparable<mData>{
    int value;
    int index;

    public mData(int value , int index){
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o){
        return this.value = o.value;
    }
}

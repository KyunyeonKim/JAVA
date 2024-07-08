package multi.bak;

import java.util.Scanner;

public class Bak1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] A = new int[str.length()]; //입력받은 문자열 길이만큼의 정수 배열 A를 생성
        for(int i=0; i< str.length(); i++){
            A[i] = Integer.parseInt(str.substring(i,i+1)); //문자열의 각 문자를 하나씩 subString으로 정수로 변환하여 배열 A로 저장하합니다.
        }
        //선택 정렬 알고리즘
        for(int i=0; i < str.length(); i++){ //
            int Max = i; //가장 큰 값의 인덱스를 저장하는 변수입니다
            for(int j = i + 1; j < str.length(); j++){
                if (A[j] > A[Max])
                    Max = j;
            }
            if(A[i] < A[Max]){ //가장 큰값 현재 위치 (i)로 이동
                int temp = A[i]; //임시 변수에 현재 값 저장
                A[i] = A[Max]; // 현재 위치에 가장 큰 값 대입
                A[Max] = temp; //가장 큰 값이 있던 위치에 현재 값을 대입합니다.
            }
        }
        for(int i=0; i<str.length();i++){
            System.out.println(A[i]);
        }
    }
}

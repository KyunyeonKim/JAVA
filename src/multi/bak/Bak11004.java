package multi.bak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bak11004
{
    public static void main(String [] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //표준 입력 스트림으로부터 문자 데이털르 읽기 위한 BufferReader 객체 생성
        StringTokenizer st = new StringTokenizer(in.readLine()); //입력된 첫 번째 줄을 읽고, 공백으로 구분된 토큰으로 나누니 위한 StringTokenizer객체 생성
        int N = Integer.parseInt(st.nextToken()); //N:배열의 크기
        int K = Integer.parseInt(st.nextToken());//K:찾고자 하는 순서
        st = new StringTokenizer(in.readLine());//입력된 두 번째 줄을 읽어 배열 A에 저장하기 위한 StringTokenizer 객체 생성
        int[] A = new int[N];
        for(int i=0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken()); //배열A의 i번째 요소를 정수로 변환하여 저장
        }
        quickSort(A,0,N - 1, K - 1); //배열A에 대해 퀵소트 알고리즘 수행 K-1번쨰 요소를 찾는다.
        //찾은 K번쨰 요소 출력
        System.out.println(A[K-1]);
    }

    //배열 A로 퀵소트로 정렬하는 함수
    public static void quickSort(int[] A , int S , int E , int K){
        //시작 인덱스가 S가 종료 인덱스 E보다 작은 경우에만 정렬 수행
        if(S < E){
            //피벗을 기준으로 배열을 두 부분으로 나누고. 피벗의 위치를 반환
            int pivot = partition(A,S,E);
            //피벗위치가 K와 같으면 더 이상 정렬한 필요 없음
            if(pivot == K)
                return;
            //K가 피벗보다 작으면 왼쪽 부분 배열에 대해 퀵소트 수행
            else if(K < pivot)
                quickSort(A , S ,pivot - 1 , K);
            //K가 피벗보다 크면 오른쪽으로 부분 배열에 대해 퀵소트 수행
            else
                quickSort(A,pivot + 1 , E, K);
        }
    }

    //퀵소트의 파티션 함수
    public static int partition(int[] A, int S, int E){
        //시작 인덱스와 종료 인덱스가 1 차이나면 두 요소를 비교후 필요시 교환한다.
        if(S + 1 == E){
            if(A[S] > A[E])swap(A,S,E);
            return E;
        }

        //중앙값을 시작 인덷ㄱ스와 교환하여 피벗으로 설정
        int M =(S+E) / 2;
        swap(A,S,M);
        int pivot = A[S]; // 피벗 값 설정
        int i = S+1 , j=E;
        while (i <= j) {
            //피벗보다 작은 값을 왼쪽으로 큰 값으 오른쪽으로 이동
            while (pivot < A[j] && j > 0) {
                j--;
            }

            while (pivot > A[i] && i < A.length - 1) {
                i++;
            }
            // i와 j가 교차하지 않았으면 요소 교환
            if (i <= j) {
                swap(A, i++, j--);
            }
        }

        //피벗을 최종 위치로 이동하고 , 피벗의 위치 반환한다.
        A[S] = A[j];
        A[j] = pivot;
        return j;

    }

    //두 배열 요소의 위치를 교환하는 함수
    public static void swap(int[] A , int i , int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }




}

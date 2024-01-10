import java.util.Scanner;

public class Bak2750 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //입력받을 숫자의 개수를 나타내는 N을 입력받음
        int[] A = new int[N]; //N개의 숫자를 지정할 배열 A를 선언
        for(int i=0; i<N; i++){ //N번 반복하면서 배열A에 숫자들을 입력받음
            A[i]= sc.nextInt();
        }
        //버블 정렬(Bubble Sort)시작
        //N-1번 반복하면서
        for(int i=0; i<N - 1 ; i++){
            //각 번복마다 배열의 끝에서 시작하는 부분을 제외하고 비교 및 교환
            for(int j=0; j<N - 1 - i; j++){
                //현재 원소가 다으므 원소보다 크다면 원소들을 교환
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j]= A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(A[i]);
        }
    }
}

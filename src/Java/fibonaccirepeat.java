package Java;

public class fibonaccirepeat {

    public static int fibonacci(int num){
        int one = 1;
        int two = 1;
        int result = 1;

        if(num == 1){
            return one;
        }
        else if(num == 2){
            return two;
        }
        else {
            for(int i=2; i<num; i++){
                result = one + two;
                one = two;
                two = result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("피보나치 수열의 10번째 원소는" + fibonacci(10)+ "입니다");
    }
    int a;
}

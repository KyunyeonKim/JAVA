package Java;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y =0.0;
//        double z = x/y;
        double z = x%y;
        System.out.println(z+2);

        if(Double.isFinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z+2);
        }

    }
}

// 11라인의 if조건식 Double.isInfinite(z) || Double.isNaN(z)는 둘중하나가 true연산이며ㅕㄴ 전체 조건식이 true 즉
//변수가z가 infinity 이거나 nan이 돠면 if 조건식이 true가 되어 12라인을 실행하고 그렇지 않으면 14라인을 출력한다


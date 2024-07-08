package multi.test.com;

public class MemberDAO {
    void insert(){
        System.out.println("insert");
    }


    void update(int x){

        System.out.println("update"+x);
    }

    public MemberVO[] delete1(){

        MemberVO[] mdao = new MemberVO[3];

        for (int i = 0; i <mdao.length ; i++) {
            mdao[i] = new MemberVO(1,"2","3","4","5");
        }
        return  mdao;
    }






}

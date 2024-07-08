package multi.test.com;

public class BoardVO {


    int num;
    String title;
    String content;
    String writer;
    String wdate;

    public BoardVO() {
    }

    public BoardVO(int num,
                   String title,
                   String content,
                   String writer,
                   String wdate) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.wdate = wdate;

    }


    //데이터 베이스와 연동해서 입력,수정,삭제,검색 처리가능용


    //메서드 - 리턴타입을 반드시 명시,리턴값이 없다면 void명시
    //리턴값이 있다면 해당 리터럴의 타입을 명시해줘야함


    //1. 입력 - insert,create  인자없고 리턴없고
    void insert(){
        System.out.println("insert()...");
    }//리턴할값(리터럴)이 없다면 생략가능

    //2. 수정 - update 인자있고, 리턴없고
    void update(int x){
        System.out.println("update()...x:"+ x);

    }//리턴할값(리터럴)이 없다면 생략가능

    void update(int x,String y){
        System.out.println("udpate()...x...y"+x+y);

    }

    //3. 삭제 -delete,remove; ,, 인자 없고,리턴있고
    int delete(){
        return 1;
    }

    String delete2(){

        String x ="lee";
        return x;
    }


    int[] delete3(){

        int[] sus = new int[3];
        return sus;
    }


   public BoardVO delete5(int num, String title,
    String content,
    String writer,
    String wdate
){
       BoardVO bvo = new BoardVO();
       System.out.println("delete5"+num+title+content+wdate+wdate);
        return bvo ;
   } //에러없도록
    //bvo 필드값들 출력

    public BoardVO delete6(
    ){


        return new BoardVO(1,"안녕","안녕","안녕","안녕") ;
    }


    public BoardVO[] delete7(){
        System.out.println("delet06");

        BoardVO[] bvos = new BoardVO[3];
        for (int i = 0; i < bvos.length; i++) {
            bvos[i] = new BoardVO(10,"aaa","bbb","ccc","ddd");
        }

        return bvos;
    }




    //4. 검색 -search,read,select
    int select1(int x , int y){
        System.out.println("select1()...");
        return 1;
    }

    int select2(int x1 , int x2, int x3 , int x4){
        System.out.println("select1()...");
        return 1;
    }


    public BoardVO[] select4(BoardVO boardVO) {
        return null;
    }



}



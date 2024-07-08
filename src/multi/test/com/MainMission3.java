package multi.test.com;

public class MainMission3 {
    public static void main(String[] args) {

        //jvm이 인터프리터를 사용해서 순서대로 호출함


        Board bd = new Board();



        BoardVO dao = new BoardVO();
        dao.insert(); //리턴할값이 없다면 생략가능
        dao.update(99);
        dao.update(99,"solid");


        int result = dao.delete();
        System.out.println("result:"+result);
        String result2 = dao.delete2();
        System.out.println("result2:"+result2);


        // 게시글 정보 출력

        BoardVO bvo = dao.delete6(); //에러없도록
        System.out.println(bvo.content);
        System.out.println(bvo.num);
        System.out.println(bvo.title);
        System.out.println(bvo.writer);
        System.out.println(bvo.wdate);


        BoardVO[] bvos = dao.delete7();
        for (int i = 0; i <bvos.length ; i++) {
            System.out.print(bvos[i].num+"");
            System.out.print(bvos[i].title+"");
            System.out.print(bvos[i].content+"");
            System.out.print(bvos[i].writer+"");
            System.out.println(bvos[i].wdate+"");
        }

        System.out.println("========================");

        int re = dao.select1(11,22);
        System.out.println();

        BoardVO[] bvos3 = dao.select4(new BoardVO());






    }
}

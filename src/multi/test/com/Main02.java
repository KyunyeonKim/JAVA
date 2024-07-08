package multi.test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hi");

        MemberDAO dao = new MemberDAO();

        dao.insert();
        dao.update(1);

        MemberVO[] members = dao.delete1();

        // 배열의 각 요소를 출력하는 일반 for 루프
        for (int i = 0; i < members.length; i++) {
            MemberVO member = members[i];
            System.out.println("num: " + member.num);
            System.out.println("title: " + member.title);
            System.out.println("content: " + member.content);
            System.out.println("writer: " + member.writer);
            System.out.println("wdate: " + member.wdate);
            System.out.println();
        }

    }
}

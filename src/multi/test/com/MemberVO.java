package multi.test.com;

public class MemberVO {

    int num;
    String title;
    String content;
    String writer;
    String wdate;

    public MemberVO() {
    }

    public MemberVO(int num,
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
}

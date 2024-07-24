package multi.java21.comment;

public class CommentsVO {
    private int num;
    private String contents;
    private String writer;
    private int bnum; // 게시글 번호

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getBnum() {
        return bnum;
    }

    public void setBnum(int bnum) {
        this.bnum = bnum;
    }

    @Override
    public String toString() {
        return "CommentsVO{" +
                "num=" + num +
                ", contents='" + contents + '\'' +
                ", writer='" + writer + '\'' +
                ", bnum=" + bnum +
                '}';
    }

}
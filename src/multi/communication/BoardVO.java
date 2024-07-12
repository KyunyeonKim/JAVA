package multi.communication;

public class BoardVO {

    private int num;
    private String writer;
    private String content;

    public BoardVO(int num, String writer, String content) {
        this.num = num;
        this.writer = writer;
        this.content = content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "num=" + num +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

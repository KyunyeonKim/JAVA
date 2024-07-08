package multi.test.com;

public class Board {

    private int id;
    private String title;
    private String content;
    private String author;
    private String date;



    public Board(int id, String title, String content, String author, String date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
    }

    public Board() {

    }
}

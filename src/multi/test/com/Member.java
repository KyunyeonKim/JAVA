package multi.test.com;

public class Member {

    public int number;

    public String id;

    public String password;

    public String name;

    public String phnumber;

    public Member(int number,String id,String password,String name,String phnumber){
        this.number = number;
        this.id = id;
        this.password = password;
        this.name = name;
        this.phnumber = phnumber;


    }

    public Member() {
        number = 0;
        id= null;
        password = null;
        name = null;
        phnumber = null;
    }

}

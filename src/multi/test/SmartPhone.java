package multi.test;

public class SmartPhone {

    public String name ;

    public int price ;

    public int weight ;

    public int version ;




    public SmartPhone(String name, int price , int weight, int version) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.version = version;
    }


    public SmartPhone() {
        name="홍길동";
        price = 120000;
        weight = 10;
        version= 10;
    }
}

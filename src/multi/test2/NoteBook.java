package multi.test2;

public abstract class NoteBook {

    public int price;
    public double size;
    public String model;

    //생성자 - 클래스 병과 동일한 이름사용, 리턴타입명시 안함
    //생성자가 여러개 정의될 경우 매개변수의 타입,순서,개수가 다르게 생성해야한다.
    //생성자(메소드,함수) 오버로딩 이라고 합니다.
    //오버로딩 한메서드에 다른 매개변수 타입,순서 계수가 다르게 생성해야합니다.



    public NoteBook(){
        price = 100;
        size = 4.5;
        model = "SM";
    }

    public NoteBook(String model, int price, double size){
        this.price = price;
        this.size = size;
        this.model = model;
        System.out.println("NoteBook");
    }

    public abstract int insert(int x, int y);

    public abstract String update(String name);
}

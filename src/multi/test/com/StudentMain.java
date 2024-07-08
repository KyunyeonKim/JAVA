package multi.test.com;

public class StudentMain {
    public static void main(String[] args) {




        StudentDAO sdo= new StudentDAO();

        int insert = sdo.insert(new StudentVO(1, "Alice", 90, 85, 95));
        System.out.println("insert result:"+insert);

        int resultUpdate = sdo.update(new StudentVO(1, "Alice", 90, 85, 95));
        System.out.println("Update result: " + resultUpdate);

        int resultDelete = sdo.delete(new StudentVO(1, "Alice", 90, 85, 95));
        System.out.println("Delete result: " + resultDelete);



    }
}

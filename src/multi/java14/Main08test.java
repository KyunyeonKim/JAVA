package multi.java14;

import java.util.List;
import java.util.Scanner;

public class Main08test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonDAO personDAO = new PersonDaoImpl();

        while (true){
            System.out.println("옵션을 고르세요");
            System.out.println("1. insert person");
            System.out.println("2. insert person");
            System.out.println("3. insert person");
            System.out.println("4. insert person");
            System.out.println("5. insert person");
            System.out.println("6. insert person");
            System.out.println("7. exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("아이디 이름 나이를 입력하시오");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    int age = scanner.nextInt();
                    personDAO.insert(new PersonVO(id,name,age));
                    break;

                case 2:
                    System.out.println("업데이트할 아이디를 적으시오");
                    int updateId= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("새로운 나이 이름을 저장하세요");
                    String newName = scanner.nextLine();
                    int newAge = scanner.nextInt();
                    personDAO.update(new PersonVO(updateId,newName,newAge));
                case 3:
                    System.out.println("삭제할id를 적으세요");
                    int deleteId = scanner.nextInt();
                    personDAO.delete(deleteId);
                    break;

                case 4:
                    System.out.println("id로검색하기");
                    int selectId = scanner.nextInt();
                    PersonVO person = personDAO.select(selectId);
                    System.out.println("selected"+person);
                    break;

                case 5:
                    System.out.println("이름으로 검색학기");
                    String selectName = scanner.nextLine();
                    PersonVO personname=personDAO.select2(selectName);
                    System.out.println("Selected"+personname);
                    break;

                case 6:
                    List<PersonVO> allPersons = personDAO.selectAll();
                    for (PersonVO p : allPersons) {
                        System.out.println("Person: " + p);
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");


            }
        }
    }
}

package multi.java14;

import java.util.List;

public class Main04 {


    //PersonDAO:인터페이스 입력,수정,삭제,검색용 추상메서드(6개)
    //PersonDaoimpl persondao 상속받기
    //PersonDaoimpl : 전역변수ArrayList을 이용해서 메인이세 입력한값들로
    //입력,수정,삭제,검색 구현하기

    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDaoImpl();

        personDAO.insert(new PersonVO(1,"kim",30));
        personDAO.insert(new PersonVO(2,"Go",23));
        personDAO.insert(new PersonVO(3,"Hwang",23));

        personDAO.update(new PersonVO(2,"son",25));

        personDAO.delete(2);

        PersonVO person = personDAO.select(3);
        System.out.println("Selected"+ person);

        PersonVO person1 = personDAO.select2("kim");
        System.out.println("Selected:"+person1);

        List<PersonVO> allPersons = personDAO.selectAll();
        for (int i = 0; i <allPersons.size() ; i++) {
            System.out.println("Person" + allPersons.get(i));
        }

    }




}

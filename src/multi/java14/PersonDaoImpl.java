package multi.java14;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDAO{

    private List<PersonVO> personList = new ArrayList<>();
    @Override
    public void insert(PersonVO vo) {
        personList.add(vo);
        System.out.println("insert:"+vo);
    }

    @Override
    public void update(PersonVO vo) {
        for (int i = 0; i <personList.size() ; i++) {
            PersonVO person = personList.get(i);
            if(person.getNum() == vo.getNum()){
                person.setName(vo.getName());
                person.setAge(vo.getAge());
                System.out.println("update: "+ vo);
                return;
            }
        }

    }

    @Override
    public void delete(int num) {
        for (int i = 0; i <personList.size() ; i++) {
           if(personList.get(i).getNum() == num){
               personList.remove(i);
               System.out.println("deleted person id"+ num);
               return;
           }
        }
    }


    @Override
    public PersonVO select(int num) {
        for (int i = 0; i <personList.size() ; i++) {
            PersonVO person = personList.get(i);
            if(person.getNum() == num){
                return person;
            }
        }

        return null;
    }

    @Override
    public PersonVO select2(String name) {
        for (int i = 0; i <personList.size() ; i++) {
            PersonVO person = personList.get(i);
            if(person.getName() == name)
                return person;
        }
        return null;
    }

    @Override
    public List<PersonVO> selectAll() {
        return new ArrayList<>(personList);
    }
}

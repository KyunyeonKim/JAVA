package multi.java14;

import java.util.List;

public interface PersonDAO {
    public void insert(PersonVO vo);

    public void update(PersonVO vo);

    public void delete(int num);

    public PersonVO select(int num);

    public PersonVO select2(String name);

    List<PersonVO> selectAll();
}

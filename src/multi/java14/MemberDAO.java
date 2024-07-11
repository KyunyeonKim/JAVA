package multi.java14;

import multi.javainter.MemberVO;

import java.util.List;

public interface MemberDAO {

    public  void insert(MemberVO vo);

    public  void update(MemberVO vo);

    public void  delete(int num);

    public MemberVO select(int num);

    List<PersonVO>selectall();

    List<PersonVO>searchKey(String search,String key);
}

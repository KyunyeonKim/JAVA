package multi.java14;

import multi.javainter.MemberVO;

import java.util.ArrayList;
import java.util.List;

public class MemberDaoImpl implements MemberDAO {
    private List<MemberVO> member = new ArrayList<>();
    @Override
    public void insert(MemberVO vo) {
        member.add(vo);
        System.out.println("insert"+vo);

    }

    @Override
    public void update(MemberVO vo) {
        for (int i = 0; i < member.size() ; i++) {
            MemberVO mv = member.get(i);
            if(mv.getNum() == vo.getNum()){
                mv.setId(vo.getId());
                mv.setPw(vo.getPw());
                mv.setName(vo.getName());
                mv.setTel(vo.getTel());
                System.out.println("update"+vo);
            }
            return;
        }

    }

    @Override
    public void delete(int num) {

        for (int i = 0; i <member.size() ; i++) {
            MemberVO mv = member.get(i);
            if(member.get(i).getNum() == num){
                 member.remove(i);
                System.out.println("delete"+i);
                return;
            }
        }

    }

    @Override
    public MemberVO select(int num) {
        for (int i = 0; i < member.size(); i++) {
            MemberVO mv = member.get(i);
            if(mv.getNum()== num ){
                return mv;
            }
        }

        return null;
    }

    @Override
    public List<PersonVO> selectall() {
        return new ArrayList<>();
    }

    @Override
    public List<PersonVO> searchKey(String searchkey, String word) {

        for (int i = 0; i <member.size() ; i++) {
            if(member.get(i).getName().contains(searchkey)){

            }
        }
        return List.of();
    }
}

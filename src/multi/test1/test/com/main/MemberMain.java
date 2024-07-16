package multi.test1.test.com.main;

import test.com.member.MemberVO;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args) {
        ArrayList<MemberVO> members = new ArrayList<>();
        members.add(new MemberVO(1, "admin1", "hi1111", "kim1", "010"));
        members.add(new MemberVO(2, "admin2", "hi1111", "kim2", "010"));
        members.add(new MemberVO(3, "admin3", "hi1111", "kim3", "010"));

        System.out.println("번호\t아이디\t비밀번호\t이름\t폰번");
        for (MemberVO member : members) {
            System.out.println(member.getId() + "\t" + member.getUsername() + "\t" + member.getPassword() + "\t"
                    + member.getName() + "\t" + member.getPhoneNumber());
        }
    }
}
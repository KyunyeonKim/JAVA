package multi.java14;

import java.util.ArrayList;

public class Main07 {
    public static void main(String[] args) {
        ArrayList<MemberVO> memberList = new ArrayList<>();


        System.out.println("Before sorting:");
        for (MemberVO member : memberList) {
            System.out.println(member);
        }

        // 버블 정렬 사용하여 직접 정렬
        for (int i = 0; i < memberList.size() - 1; i++) {
            for (int j = 0; j < memberList.size() - 1 - i; j++) {
                MemberVO m1 = memberList.get(j);
                MemberVO m2 = memberList.get(j + 1);

                int nameCompare = m2.getName().compareTo(m1.getName()); // 이름 내림차순
                if (nameCompare < 0 || (nameCompare == 0 && m1.getTel().compareTo(m2.getTel()) > 0)) {
                    // 이름이 내림차순이 아니거나, 이름이 같고 폰번호가 오름차순이 아닌 경우
                    memberList.set(j, m2);
                    memberList.set(j + 1, m1);
                }
            }
        }

        System.out.println("\nAfter sorting:");
        for (MemberVO member : memberList) {
            System.out.println(member);
        }
    }
}

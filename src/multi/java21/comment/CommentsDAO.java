package multi.java21.comment;

import java.util.List;
    public interface CommentsDAO {
        int insert(CommentsVO vo);
        int update(CommentsVO vo);
        int delete(CommentsVO vo);
        CommentsVO selectOne(int num);
        List<CommentsVO> selectAll(int bnum); // 특정 게시글의 모든 댓글 조회
    }



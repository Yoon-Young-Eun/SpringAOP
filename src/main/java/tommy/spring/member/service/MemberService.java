package tommy.spring.member.service;

import tommy.spring.board.vo.MemberVO;
import tommy.spring.member.vo.UpdateInfo;

public interface MemberService { //회원관리 서비스를 제공할 인터페이스
	void regist(MemberVO member);
	boolean update(String memberId, UpdateInfo info);
}

package tommy.spring.member.service;

import tommy.spring.board.vo.MemberVO;
import tommy.spring.member.vo.UpdateInfo;

//MemberService 인터페이스를 구현한 클래스
public class MemberServiceImpl implements MemberService {

	@Override
	public void regist(MemberVO member) {
		System.out.println("MemberServiceImpl.regist() 메서드 실행");

	}

	@Override
	public boolean update(String memberId, UpdateInfo info) {
		System.out.println("MemberServiceImpl.update() 메서드 실행");
		return true;
	}

}

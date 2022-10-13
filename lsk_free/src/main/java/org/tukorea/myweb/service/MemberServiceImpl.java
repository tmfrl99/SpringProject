package org.tukorea.myweb.service;

import java.util.List;

import org.tukorea.myweb.domain.MemberVO;
import org.tukorea.myweb.persistence.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	public MemberVO readMember(String id) throws Exception {
		return memberDAO.read(id);
	}
	
	public List<MemberVO> readMemberList() throws Exception{
		return memberDAO.readList();
	}
	
	public void addMember(MemberVO member) throws Exception {
		memberDAO.add(member);
	}
	
	public void deleteMember(String id) throws Exception {
		memberDAO.delete(id);
	}
	
	public void updateMember(MemberVO member) throws Exception {
		memberDAO.update(member);
	}
	
	// 트랜잭션 
	public void updateMemberList(MemberVO member1, MemberVO member2) throws Exception
	{
		memberDAO.update(member2); // dongjin 정보 정상 수정
		memberDAO.update(member1); // hansol 정보 수정 예외 발생
	}

//	@Override
//	public MemberVO readAopMember(String id) throws Exception {
//		// TODO Auto-generated method stub
//		return memberDAO.readAop(id);
//
//	}
//
//	@Override
//	public void addAopMember(MemberVO member) throws Exception {
//		// TODO Auto-generated method stub
//		memberDAO.addAop(member);
//	}
}

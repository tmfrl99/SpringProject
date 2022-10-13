package org.tukorea.myweb.persistence;

import java.util.List;

import org.tukorea.myweb.domain.MemberVO;

public interface MemberDAO {

	public void add(MemberVO member) throws Exception;
	public List<MemberVO> readList() throws Exception;
	public MemberVO read(String id) throws Exception;
	public void delete(String id) throws Exception;
	public void update(MemberVO member) throws Exception;
//	public MemberVO readAop(String id) throws Exception;
//	public void addAop(MemberVO member) throws Exception;
}

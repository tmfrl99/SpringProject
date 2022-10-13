package org.tukorea.myweb.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.tukorea.myweb.domain.MemberVO;

@Component
//@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.tukorea.myweb.mapper.MemberMapper";
	
	//private Map<String, MemberVO> storage = new HashMap<String, MemberVO>();

	public MemberVO read(String id) throws Exception {
	
		MemberVO vo = sqlSession.selectOne(namespace+".selectByid", id);
		return vo;   
	}
 
//	public MemberVO readAop(String id) throws Exception {return storage.get(id); }

	
	public List<MemberVO> readList() throws Exception {
		List<MemberVO> memberlist = new ArrayList<MemberVO>();
		memberlist = sqlSession.selectList(namespace + ".selectAll");
		return memberlist;
	}
	
//	public void addAop(MemberVO member) throws Exception {
//		storage.put(member.getId(), member);
//	}
//	
	public void add(MemberVO vo) throws Exception {
		sqlSession.insert(namespace + ".insert", vo);
	}

	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", id);
	}

	public void update(MemberVO member) throws Exception {
		// TODO Auto-generated method stub
	    sqlSession.update(namespace + ".update", member);
	}
	

}

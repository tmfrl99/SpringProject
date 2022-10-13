package org.tukorea.myweb.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.tukorea.myweb.domain.ShoesVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShoesDAOImpl implements ShoesDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.tukorea.myweb.mapper.ShoesMapper";

	public ShoesVO read(String pid) throws Exception {
	
		ShoesVO vo = sqlSession.selectOne(namespace+".selectBypid", pid);
		return vo;   
	}
 
	public List<ShoesVO> readList() throws Exception {
		List<ShoesVO> shoeslist = new ArrayList<ShoesVO>();
		shoeslist = sqlSession.selectList(namespace + ".selectAll");
		return shoeslist;
	}
	
	public void add(ShoesVO vo) throws Exception {
		sqlSession.insert(namespace + ".insert", vo);
	}

	public void delete(String pid) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", pid);
	}

	public void update(ShoesVO shoes) throws Exception {
		// TODO Auto-generated method stub
	    sqlSession.update(namespace + ".update", shoes);
	}
	

}

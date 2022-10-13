package org.tukorea.myweb.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tukorea.myweb.domain.ShoesVO;
import org.tukorea.myweb.persistence.ShoesDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class ShoesDAOTest{
	
	@Autowired
	private ShoesDAO dao;
	private static Logger logger = LoggerFactory.getLogger(ShoesDAOTest.class);
	
	@Test
	public void testReadByid() throws Exception {
		ShoesVO vo;
		vo = dao.read("M9160");
		logger.info(vo.toString());
	}
	@Test
	public void testReadList() throws Exception {
		List<ShoesVO> voList;
		voList = dao.readList();
		for(ShoesVO svo : voList) {
			logger.info(svo.toString());
		}
	}
}
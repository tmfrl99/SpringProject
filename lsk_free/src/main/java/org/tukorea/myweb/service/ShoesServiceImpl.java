package org.tukorea.myweb.service;

import java.util.List;

import org.tukorea.myweb.domain.ShoesVO;
import org.tukorea.myweb.persistence.ShoesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoesServiceImpl implements ShoesService {
	
	@Autowired
	private ShoesDAO shoesDAO;

	public ShoesVO readShoes(String pid) throws Exception {
		return shoesDAO.read(pid);
	}
	
	public List<ShoesVO> readShoesList() throws Exception{
		return shoesDAO.readList();
	}
	
	public void addShoes(ShoesVO shoes) throws Exception {
		shoesDAO.add(shoes);
	}
	
	public void deleteShoes(String pid) throws Exception {
		shoesDAO.delete(pid);
	}
	
	public void updateShoes(ShoesVO shoes) throws Exception {
		shoesDAO.update(shoes);
	}

}

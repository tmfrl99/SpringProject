package org.tukorea.myweb.service;

import java.util.List;

import org.tukorea.myweb.domain.ShoesVO;

public interface ShoesService {
	
	public ShoesVO readShoes(String pid) throws Exception;
	public List<ShoesVO> readShoesList() throws Exception;
	public void addShoes(ShoesVO shoes) throws Exception;
	public void deleteShoes(String pid) throws Exception; 
	public void updateShoes(ShoesVO shoes) throws Exception;
		
}

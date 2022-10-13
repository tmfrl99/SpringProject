package org.tukorea.myweb.persistence;

import java.util.List;

import org.tukorea.myweb.domain.ShoesVO;

public interface ShoesDAO {

	public void add(ShoesVO shoes) throws Exception;
	public List<ShoesVO> readList() throws Exception;
	public ShoesVO read(String pid) throws Exception;
	public void delete(String pid) throws Exception;
	public void update(ShoesVO shoes) throws Exception;

}

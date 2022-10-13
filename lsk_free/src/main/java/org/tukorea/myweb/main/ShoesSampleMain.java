package org.tukorea.myweb.main;

import org.tukorea.myweb.domain.ShoesVO;
import org.tukorea.myweb.service.ShoesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShoesSampleMain {
	
	private static ApplicationContext ctx = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요  AOP-ANNOTATION");
		ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		ShoesService shoesService = ctx.getBean(ShoesService.class);
		
		ShoesVO vo = new ShoesVO(); vo.setPid("kanadara");
		shoesService.addShoes(vo); 
		ShoesVO shoes = shoesService.readShoes("kanadara");

		System.out.println(shoes);
	
	}

}

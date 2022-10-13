package org.tukorea.myweb.main;

import org.tukorea.myweb.domain.MemberVO;
import org.tukorea.myweb.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberSampleMain {
	
	private static ApplicationContext ctx = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요  AOP-ANNOTATION");
		
		//ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		MemberService memberService = ctx.getBean(MemberService.class);
		
//		MemberVO vo = new MemberVO(); vo.setId("kanadara");
//		memberService.addAopMember(vo); 
//		
//		MemberVO member = memberService.readAopMember("kanadara");
//		System.out.println(member);
	
	}

}

package org.tukorea.myweb.main;

import org.tukorea.myweb.domain.MemberVO;
import org.tukorea.myweb.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionSampleMain {
	
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요 TRANSACTION-MYBATIS");
	
		ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		ctx = new ClassPathXmlApplicationContext("classpath:applicationContext_annotation.xml");
		
		MemberService memberService = ctx.getBean(MemberService.class);  // by Class name
		
		String strID1 = "hansol12";
		MemberVO vo1 = new MemberVO(); 
		vo1.setId(strID1); vo1.setPasswd(strID1);  vo1.setNum(strID1);
		vo1.setName("가나다라마바사자차카타파하가나다라마바사자차카타파하"); vo1.setAddress(strID1);
		
		String strID2 = "dongjin12";
		MemberVO vo2 = new MemberVO();
		vo2.setId(strID2); vo2.setPasswd(strID2);  vo2.setNum(strID2);
		vo2.setName(strID2); vo2.setAddress(strID2);
		
		try {
			memberService.updateMemberList(vo1, vo2);
			System.out.println("TRANSACTION 처리 완료");
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
}

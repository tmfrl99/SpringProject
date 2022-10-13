package org.tukorea.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.tukorea.myweb.domain.MemberVO;

@Aspect
@Component
public class MemberAspect {
	
	   @Before("execution(* add(String))")
	   public void beforeMethod(JoinPoint jp) {
	        System.out.println("[BeforeMethod] : 메소드 호출 전");
	        Signature sig = jp.getSignature();
	        System.out.println(" 메소드 이름:" + sig.getName());
	        Object[] obj = jp.getArgs();
	        System.out.println(" 인수 값:" + obj[0]);
	        System.out.println("추가하시겠습니까?");
	   }
	    @After("execution(* delete(String))")
	    public void AfterMethod(JoinPoint jp) {
	        System.out.println("정말 삭제하시겠습니까?");
	    }
	    @AfterReturning(value = "execution(* read(String))", returning = "member")
	    public void afterReturningMethod(JoinPoint jp, MemberVO member) {
	    	System.out.println("[afterReturningMethod] : 메소드 호출 후");
	        Signature sig = jp.getSignature();
	        System.out.println(" 메소드 이름:" + sig.getName());
	        Object[] obj = jp.getArgs();
	        System.out.println(" 인수 값:" + obj[0]);
	    }
	    
	    @AfterReturning(value = "execution(* readMember(String))", returning = "member")
	    public void afterReturningMethod(JoinPoint jp) {
	       System.out.println("[afterReturningMethod] : 메소드 호출 후");
	       Signature sig = jp.getSignature();
	       System.out.println("메소드 이름:" + sig.getName());
	       Object[] obj = jp.getArgs();
	       System.out.println("인수 값:" + obj[0]);
	       System.out.println(jp);

	    }
	    
//
//	    @Around("execution(* readAop(String))")
////    	@Around("within(org.kpu.di.service.MemberServiceImpl)")
//	    public MemberVO aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
//	        System.out.println("[AroundMethod Before] : 메소드 호출 전");
//	        Signature sig = pjp.getSignature();
//	        System.out.println(" 메소드 이름:" + sig.getName());
//	        MemberVO member = (MemberVO) pjp.proceed();
//	        System.out.println("[AroundMethod after] : 메소드 호출 후");
//	        System.out.println(" 메소드 이름:" + sig.getName());
//	        return member;
//	    }
//	    @AfterThrowing(value = "execution(* readAop(String))", throwing = "ex")
//	    public void afterThrowingMethod(Throwable ex) {
//	        // 메소드 호출이 예외를 내보냈을 때 호출되는 Advice
//	        System.out.println("[AfterThrowingMethod] : 예외 발생 후");
//	        System.out.println("exception value = " + ex.toString());
//	    }
}

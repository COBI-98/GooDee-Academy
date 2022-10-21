package com.esh.home.aop.test;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.esh.home.board.qna.QnaVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class QnaAdvice {

	@Before("execution(* com.esh.home.board.qna.QnaService.get*(..))")
	public void beforeTest(JoinPoint joinpoint) {
		log.info("----------before---------");
		log.info("Args : {}", joinpoint.getArgs());
		log.info("Kind :  {}", joinpoint.getKind());
	}
	
	@Around("execution(* com.esh.home.board.qna.QnaService.set*(..))")
	public Object aroundTest(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("----------------- before --------------");
		log.info("Target : {}", joinPoint.getTarget());
		log.info("This : {}", joinPoint.getThis());
		// point-cut 으로 전달되는 매개변수의 인자값
		log.info("Args : {}", joinPoint.getArgs());
		Object [] objs = joinPoint.getArgs();
		
		QnaVO qnaVO = (QnaVO)objs[0]; // 다형성
		
		
		
		// set으로 진행되는 (setAddBoard) 함수의 리턴값
		Object obj = joinPoint.proceed();
		
		log.info("----------------- after --------------");
		log.info("Obj : {}", obj);
		
		return obj;
	}
}

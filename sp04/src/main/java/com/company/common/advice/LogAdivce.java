package com.company.common.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component // 빈으로 등록
@Aspect // advice 모여있는 클래스 
public class LogAdivce {
	 
	 @Pointcut("execution(* com.company..*Impl.*(..))")
	 public void allpointcut() { // 메서드명 == 포인트컷 이름
		 
	 }
		 //Advice메서드 명
		 @Before("allpointcut()")
		 public void logprint(JoinPoint jp) {
			 String methodName = jp.getSignature().getName();
			 log.info("[before]서비스 호출:" + methodName);
			 
			 Object[] args = jp.getArgs();
			 if(args != null && args.length>0) {
				 log.info("파라미터 :" + args[0].toString());
			 }
		 }
		 
		 @AfterReturning("allpointcut()")
		 public void afterprint() {
			 log.info("[after] 서비스 호출");
		 }
		 
		 @Around("execution(* org.zerock.service.SampleService*.*(..))")
		 public Object logTime( ProceedingJoinPoint pjp) {
			 long start = System.currentTimeMillis();
			 log.info("Target: " + pjp.getTarget());
			 log.info("Param: " + Arrays.toString(pjp.getArgs()));
			 //invoke method
			 Object result = null;
			 
			 try {
				 result = pjp.proceed();
			 }catch (Throwable e) {
				 e.printStackTrace();
			 }
			 long end = System.currentTimeMillis();
			 log.info("TIMEL " + (end - start));
			 return result;
		 }
		 
}

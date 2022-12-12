package com.senthil.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	
	public static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Pointcut("execution(* com.senthil.controllers.*.*(..))")
	public void printLogs() {
		
	}
	
	@Before("printLogs()")
	public void logJoinPoint(JoinPoint jp) {
		logger.info("The class name is : " + jp.getClass() + 
				" and the method name is " + jp.getSignature());
	}

}

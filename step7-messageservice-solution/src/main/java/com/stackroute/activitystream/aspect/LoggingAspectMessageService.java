package com.stackroute.activitystream.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspectMessageService {
	
	/*Write loggers for each of the methods of MessageServiceImpl, 
    any particular method will have all the four aspectJ annotation
    (@Before, @After, @AfterReturning, @AfterThrowing).
    */
}
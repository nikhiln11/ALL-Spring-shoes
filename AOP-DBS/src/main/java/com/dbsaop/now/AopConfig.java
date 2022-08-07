package com.dbsaop.now;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopConfig {
    
    
    @Before(value = "execution(* com.dbsaop.now.*.*(..))")
    public void firstAspect(JoinPoint joinPoint) {
        System.out.println("Before DBS Batch6 got Executed!!!!!!!!!!!!");
    }
    
    @After(value = "execution(* com.dbsaop.now.*.*(..))")
    public void secondAspect(JoinPoint joinPoint) {
        System.out.println("After############ DBS Batch6 got Executed#############");
    }
    
    @Around(value = "execution(* com.dbsaop.now.*.*(..))")
    public Object aroundDBSAspect(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        Object obj;
        try {
            System.out.println("From Aroung Notation$$$$$$$$$$$$$$$$Method started!!!!!!!!!!!!");
            obj = joinPoint.proceed();
            long timeTaken=System.currentTimeMillis()-start;
            System.out.println("Time taken------->"+timeTaken);
            return obj;
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}

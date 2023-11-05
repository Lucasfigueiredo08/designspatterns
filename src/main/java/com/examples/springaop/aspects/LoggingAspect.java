package com.examples.springaop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.examples.springaop.Calculator.*(..))")
    public void beforeMethodExecution() {
        System.out.println("Before executing method");
    }

    @After("execution(* com.examples.springaop.Calculator.*(..))")
    public void afterMethodExecution() {
        System.out.println("After executing method");
    }
}

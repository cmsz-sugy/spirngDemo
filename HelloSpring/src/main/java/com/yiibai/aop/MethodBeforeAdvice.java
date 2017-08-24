package com.yiibai.aop;
import java.lang.reflect.Method;

public interface MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target);

}

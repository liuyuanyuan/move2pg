package ru.barsopen.plsqlconverter.util;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.barsopen.plsqlconverter.Main;

public class ReflectionUtil {
	private static Logger logger = LoggerFactory.getLogger(ReflectionUtil.class);
	
	public static Object callMethod(Object obj, String methodName) {
		logger.debug("Enter: obj=" + obj +", methodName=" + methodName);
		try {
			Object result = obj.getClass().getMethod(methodName).invoke(obj);
			logger.debug("Return: " + result.toString());
			return result;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static Object callStaticMethod(Class<?> klass, String methodName, Object... args) {
		try {
			Method[] methods = klass.getMethods();
			Method requestedMethod = null;
			for (Method method: methods) {
				if (method.getName().equals(methodName)) {
					requestedMethod = method;
				}
			}
			Object result = requestedMethod.invoke(null, args);
			return result;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static Object getField(Object obj, String fieldName) {
		try {
			Object result = obj.getClass().getField(fieldName).get(obj);
			return result;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}

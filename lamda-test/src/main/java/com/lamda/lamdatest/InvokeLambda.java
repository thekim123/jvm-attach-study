package com.lamda.lamdatest;

import java.lang.reflect.Method;
import java.util.function.BiFunction;

public class InvokeLambda {
    public static void main(String[] args) throws Exception {
        // 1. Spring Boot 애플리케이션 클래스 로드
        Class<?> controllerClass = Class.forName("com.lamda.lamdatest.CalculatorController");

        // 2. 인스턴스 생성 (Spring Boot 컨트롤러가 실제 객체 생성했다고 가정)
        Object controllerInstance = controllerClass.getDeclaredConstructor().newInstance();

        // 3. 람다식 메서드(getAddFunction) 호출
        Method getAddFunctionMethod = controllerClass.getMethod("getAddFunction");
        BiFunction<Integer, Integer, Integer> addFunction =
                (BiFunction<Integer, Integer, Integer>) getAddFunctionMethod.invoke(controllerInstance);

        // 4. 람다식 호출
        int result = addFunction.apply(10, 20);
        System.out.println("Result from lambda: " + result); // 30
    }

}

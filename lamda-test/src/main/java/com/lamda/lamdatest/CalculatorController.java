package com.lamda.lamdatest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.BiFunction;

@RestController
@Slf4j
public class CalculatorController {
    // 람다식 메서드
    private final BiFunction<Integer, Integer, Integer> add = (a, b) -> {
        log.info(String.valueOf(a+b));
       return a + b;
    };

    @GetMapping("/add")
    public Integer addNumbers(@RequestParam Integer a, @RequestParam Integer b) {
        return add.apply(a, b);
    }

    // Getter for the BiFunction (for reflection usage)
    public BiFunction<Integer, Integer, Integer> getAddFunction() {
        return add;
    }
}

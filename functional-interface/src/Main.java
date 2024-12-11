import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.function.BiFunction;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
//        LambdaMetafactory
        BiFunction<Integer, Integer, Integer> add = Main::add;
        System.out.println(add.apply(1, 2));
        BiFunction<Integer, Integer, Integer> multi = (a, b) -> a * b;
        System.out.println(multi.apply(1, 2));
    }

    public static void performOperation(int a, int b, BiFunction<Integer, Integer, Integer> operation){
        System.out.println(operation.apply(a, b));
    }

}
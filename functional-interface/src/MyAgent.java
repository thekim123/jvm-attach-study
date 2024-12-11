import java.lang.instrument.Instrumentation;

public class MyAgent {
    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("Agent attached to JVM!");
        System.out.println("Received arguments: " + agentArgs);
    }
}

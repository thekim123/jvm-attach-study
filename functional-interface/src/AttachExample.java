import com.sun.tools.attach.VirtualMachine;

public class AttachExample {

    public static void main(String[] args) throws Exception {
        // 실행 중인 Spring Boot 애플리케이션의 PID (jps 명령어로 확인)
        String pid = "7384"; // 여기에 실제 PID를 입력

        // JVM에 attach
        VirtualMachine vm = VirtualMachine.attach(pid);

        // 에이전트 주입 (agent.jar 경로 지정)
        //vm.loadAgent("../agent.jar", "Hello from Attach!");
        vm.loadAgent("c:/workspace/functional-interface/agent.jar", "Hello from Attach!");

        // detach
        vm.detach();
    }

}

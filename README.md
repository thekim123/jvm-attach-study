# 사용법

## 1. 스프링 부트 가동
- lamda-test에 있는 스프링부트 엔진 가동
```
localhost:8080/add?a=3&b=2
```
- 위 주소로 요청하여 잘 떳는지 확인


## 2. invokeLambda 실행
- `InvokeLambda`를 실행하여 더하기가 잘 되는지 확인
- `InvokeLambda`에는 더하는 로직이 없기 때문에, 더하기가 잘 된다는 것은
- `add` 메서드를 jvm 메모리에 있는 메서드를 호출했음을 의미한다.

## 3. MyAgent 실행
```bash
jps
```
- jps 명령어를 사용하여 현재 실행중인 스프링부트의 pid를 찾는다.
- `AttachExample`에 해당 pid를 입력한다.
```bash
# MyAgent를 컴파일하고,
javac -d ./build src/MyAgent.java
# agent.jar로 만들기
jar cfm agent.jar META-INF/MANIFEST.MF -C build .
```
- `AttachExample`의 메인을 실행하면 스프링부트에 접근하여 메세지를 출력하고 있음을 확인할 수 있다.

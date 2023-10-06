package ex03;

public class Repository {
    void save(){
        System.out.println("4. 레포지토리 호출됨");
        throw new RuntimeException("레포지토리 오류 발생");
    }
}

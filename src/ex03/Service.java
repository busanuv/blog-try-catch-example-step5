package ex03;

public class Service {
    void 회원가입(){
        System.out.println("3. 서비스 호출됨");
        new Repository().save();
    }
}

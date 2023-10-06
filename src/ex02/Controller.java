package ex02;

public class Controller {
    void join(){
        System.out.println("2. 컨트롤러 호출됨");
        new Repository().save();
    }
}

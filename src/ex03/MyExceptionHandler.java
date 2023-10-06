package ex03;

public class MyExceptionHandler {
    
    void handleError(RuntimeException e){
        System.out.println("에러 내용 : "+e.getMessage());
        System.out.println("에러 처리 완료");
    }
}

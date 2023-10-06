package ex03;

public class DispatcherServlet {
    void find(){
        System.out.println("1. 디스패처 서블릿 호출됨");

        //new Controller().join();

        // 깊숙한 메서드에서 발생한 예외를 낚아챌 수 있다.
        try {
            new Controller().join();
        }catch (RuntimeException e){
            new MyExceptionHandler().handleError(e);
        }
    }
}

package basicGrammar.object_class.abstract_class;

public class HttpServletExample {
    public static void main(String[] args) {
        // method를 통해 실체 클래스의 메소드 실행하기
        method(new LoginServlet());
        method(new FileDownloadServlet());

        // 객체 선언을 통해 메소드 실행하기
        HttpServlet sample1 = new LoginServlet();
        HttpServlet sample2 = new FileDownloadServlet();
        sample1.service();
        sample2.service();

        // 객체만 불러와 메소드 실행하기
        (new LoginServlet()).service();
        (new FileDownloadServlet()).service();

        // 만약 HttpServlet이 Static으로 선언되어 있다면?
        // LoginServlet.service()의 형식으로도 가능.
    }

    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}

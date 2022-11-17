package src.basicGrammar.object_class.abstract_class;

public class LoginServlet extends HttpServlet {
    @Override
    public void service(){
        System.out.println("로그인 합니다.");
    }
}

package sessionsCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/input-language")
public class UserLanguageInputServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServlet request, HttpServletResponse response) throws ServletException, IOException{

        String dataTest = request.getParameter("lang-pref");

        System.out.println("DataTest = " + dataTest);

        HttpSession currentSession = request.getSession();

    }

}

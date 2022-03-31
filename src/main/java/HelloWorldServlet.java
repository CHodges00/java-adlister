import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    int count = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        if(name == null){
            response.getWriter().printf("<h1>Hello, World</h1>%n");
            response.getWriter().printf("Page visits =  %s%n", count);
        }else {
            response.getWriter().printf("<h1>Hello, %s</h1>%n", name);
            response.getWriter().printf("Page visits =  %s%n", count);

        }
        count ++;
    }
}

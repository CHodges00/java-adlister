import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowAdminDashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // redirect if the user is not an admin
        // cast to a boolean data type to properly compare
        if ((boolean)request.getSession().getAttribute("isAdmin") == false) {
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/secret-admin-page.jsp").forward(request, response);
    }

}

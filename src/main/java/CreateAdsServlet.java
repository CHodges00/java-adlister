import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads/create")
public class CreateAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/ads/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads AdsDao = DaoFactory.getAdsDao();

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        double price = Double.parseDouble(request.getParameter("price"));
        String location = request.getParameter("location");

        Ad Ad = new Ad(title, content, price, location);

        AdsDao.insert(Ad);
        response.sendRedirect("/ads");
    }
}
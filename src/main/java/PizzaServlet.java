import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pizzaorder")
public class PizzaServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizzaorder.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(request.getParameter("size"));
        System.out.println(request.getParameter("sauces"));
        System.out.println(request.getParameter("crusts"));
        String[] toppings = request.getParameterValues("toppings");
        for(String topping : toppings){
            System.out.print(topping);
        }
        System.out.println(request.getParameter("address"));
    }
}
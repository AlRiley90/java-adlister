import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PizzaOrder", urlPatterns = "/pizza-order")
public class PizzaOrder extends HttpServlet{


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("crust"));
        String[] toppings = req.getParameterValues("toppings");
        for(String topping : toppings){
            System.out.println(topping);
        }
        System.out.println("Deliver to: " + req.getParameter("customerAddress"));
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);

    }
}

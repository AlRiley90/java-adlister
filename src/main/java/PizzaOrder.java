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
        String crust = req.getParameter("crust");
        req.setAttribute("crust", crust);
        System.out.println(crust);
        String[] toppings = req.getParameterValues("toppings");
        for(String topping : toppings){
            System.out.println(topping);
        }
        String address = req.getParameter("customerAddress");
        System.out.println("Deliver to: " + address);
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);


    }
}

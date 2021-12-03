import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession currentSession = request.getSession();


        if((boolean) currentSession.getAttribute("isAdmin")){
            System.out.println(currentSession.getAttribute("isAdmin"));
            request.setAttribute("adminView", (boolean) true);

        }
        request.setAttribute("adminView", (boolean) false);
        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }
}

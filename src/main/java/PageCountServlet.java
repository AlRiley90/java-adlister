import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCount", urlPatterns = "/counter")
public class PageCountServlet extends HttpServlet {
        int currentPage = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        currentPage++;
        res.getWriter().println("Current number of times you have viewed the page: " + currentPage);
    }
}

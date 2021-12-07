import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Ad ad = new Ad();
                String title = request.getParameter("title");
                String description = request.getParameter("description");
                ad.setTitle(title);
                ad.setDescription(description);
                ad.setUserId(1L);
                long savedId = 0;

        try {
            savedId = DaoFactory.getAdsDao().insert(ad);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ad.setId(savedId);

        response.sendRedirect("/ads");
    }
}

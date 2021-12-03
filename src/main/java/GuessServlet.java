import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userGuess = req.getParameter("user-selection");
        String theNumber = "2";

        if(Objects.equals(userGuess, theNumber)){
            req.setAttribute("right-guess", userGuess);
            System.out.println(userGuess);
            resp.sendRedirect("/CorrectGuessServlet" + userGuess);
        } else {
            req.setAttribute("wrong-guess", userGuess);
            System.out.println(userGuess);
            resp.sendRedirect("/IncorrectGuessServlet" + userGuess);
        }

    }
}

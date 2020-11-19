import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.stream.Collectors;


@WebServlet(urlPatterns={"/patients"},loadOnStartup = 1)
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<H1>Hey Emmy</H1>");
        req.getServletPath();
        //resp.getWriter().write(req.getServletPath());
    }

}


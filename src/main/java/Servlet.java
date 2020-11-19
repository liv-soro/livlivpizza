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
        resp.getWriter().write("<HTML>\n" +
                "\n" +
                "<HEAD>\n" +
                "\n" +
                "<TITLE> Pizzapizzaliv </TITLE>\n" +
                "\n" +
                "</HEAD> \n" +
                "\n" +
                "<BODY> \n" +
                "<H1>Hey Emmy</H1> \n" +
                "here's some website you'll like <a href=\"https://www.bbcgoodfood.com/recipes/collection/pasta-recipes\"> (click here!)</a>\n" +
                "<br> <b>hope</b> you <i>like</i> it!" +
                "\n" +
                "</BODY>\n"
                "</HTML>"
        );
        req.getServletPath();
        //resp.getWriter().write(req.getServletPath());
    }

}


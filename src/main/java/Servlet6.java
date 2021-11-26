import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet6", value = "/Servlet6")
public class Servlet6 extends HttpServlet {
    private String pass;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("1");
        String pass = request.getParameter("2");
        PrintWriter p = response.getWriter();
        if ("admin".equals(name) && "admin".equals(pass)) {
            p.println("<h1>Welcome " + name);
        } else {
            p.println("<h1>Login Error</h1>");
        }

        p.println("</html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet5", value = "/Servlet5")
public class Servlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int a  = Integer.parseInt(request.getParameter("a"));
        int b  = Integer.parseInt(request.getParameter("b"));
        int c  = Integer.parseInt(request.getParameter("c"));
        int d  = Integer.parseInt(request.getParameter("d"));
        int e  = Integer.parseInt(request.getParameter("e"));
        PrintWriter p  = response.getWriter();
        p.println(a + b+c+d+e);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

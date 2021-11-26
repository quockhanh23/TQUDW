import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet4", value = "/Servlet4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String description = request.getParameter("1");
int price  = Integer.parseInt(request.getParameter("2"));
double discountPercent = Double.parseDouble(request.getParameter("3"));
double total = price * discountPercent * 0.01;
        PrintWriter printWriter = response.getWriter();
        printWriter.println(" " + total);
        printWriter.println(" " + description);
    }
}

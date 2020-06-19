import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Product", urlPatterns = "/caculotor")
public class Product extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sp = request.getParameter("sp");
        float price =  Float.parseFloat(request.getParameter("price"));
        float chietkhau = Float.parseFloat(request.getParameter("chietkhau"));
        float DiscountAmount = (float) (price * chietkhau * 0.01);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>mo ta san pham :" + sp + "</h1>");
        writer.println("<h1>gia cua san pham: " + price+ "</h1>");
        writer.println("<h1>phan cham chiet khau: " + chietkhau+ "</h1>");
        writer.println("<h1>sau khi tinh chiet khau: " + DiscountAmount+ "</h1>");
        writer.println("</html>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

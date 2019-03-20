import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand =Float.parseFloat(request.getParameter("firstOperand"));
        float secondOperand=Float.parseFloat(request.getParameter("secondOperand"));
        char operator = request.getParameter("operator").charAt(0);

        PrintWriter printWriter=response.getWriter();

        printWriter.println("<html>");
        printWriter.println("<h1>Result:</h1>");

        try {
            float result=Calculator.calculate(firstOperand, secondOperand, operator);
            printWriter.println(firstOperand+" "+operator+" "+secondOperand+" ="+result);
        } catch (Exception ex) {
            printWriter.println("Error: "+ex.getMessage());
        }
        printWriter.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

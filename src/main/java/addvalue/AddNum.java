package addvalue;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddNum extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public AddNum() {
      
    }

	
	public void destroy() {
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("x"));
		int num2 = Integer.parseInt(request.getParameter("y"));
		
		int add = num1 + num2;
		System.out.println("Inside add servlet");
		request.setAttribute("sum", add);
		RequestDispatcher reqd = request.getRequestDispatcher("avg");
		reqd.forward(request, response);
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("x"));
		int num2 = Integer.parseInt(request.getParameter("y"));
		
		int add = num1 + num2;
		System.out.println("Inside add servlet");
		request.setAttribute("sum", add);
		RequestDispatcher reqd = request.getRequestDispatcher("avg");
		reqd.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

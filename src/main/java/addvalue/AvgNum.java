package addvalue;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class AvgNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AvgNum() {
        super();
      
    }


	public void destroy() {
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int sum = (int) request.getAttribute("sum");
		float avg = (float) (sum/2.0);
		PrintWriter out = response.getWriter();
		System.out.println("Inside avg servlet");
		out.println("Sum is : " + sum);
		out.println("Average is : " + avg);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = (int) request.getAttribute("sum");
		float avg = (float) (sum/2.0);
		PrintWriter out = response.getWriter();
		out.println("Sum is : " + sum);
		out.println("Average is : " + avg);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

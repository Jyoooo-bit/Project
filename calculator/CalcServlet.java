package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class CalcServlet extends GenericServlet{
	
	CalculatorOperation co = new CalculatorOperation();	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Double n1 = Double.parseDouble(req.getParameter("n1")) ;
		Double n2 = Double.parseDouble(req.getParameter("n2")) ;		
		String[] operations = req.getParameterValues("operation");		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		
		pw.println("<h1>Result : <h1>");
		
		for(String o : operations) {
			
			if(o.equalsIgnoreCase("add")) {
				pw.println("<h2>Addition  :" + co.add(n1, n2) + "</h2>");
			}
			if(o.equalsIgnoreCase("subtract")) {
				pw.println("<h2>Subtraction :" + co.sub(n1, n2) + "</h2>");
			}
			if(o.equalsIgnoreCase("multiply")) {
				pw.println("<h2>Multiplication :" + co.mult(n1, n2) + "</h2>");
			}
			if(o.equalsIgnoreCase("divide")) {
				pw.println("<h2>Division :" + co.div(n1, n2) + "</h2>");
			}
			
		}
		
		
		
		
	}

}

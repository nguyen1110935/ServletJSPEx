package nguyen1110935.LoginSample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
//@WebServlet(description = "This is a demo", urlPatterns = { "/Hello" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
	 * private static String username =""; private static String password ="";
	 */
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String username = req.getParameter("username"); 
		String password = req.getParameter("password"); 
		PrintWriter out = res.getWriter();
		out.println("username "+ username +"password "+ password+"by Post HelloWorld"); 
		req.setAttribute("username", username);
		req.setAttribute("pass", password); 
		RequestDispatcher rd = req.getRequestDispatcher("re"); 
		rd.forward(req, res);
		 
    }
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
    	String username = req.getParameter("username"); String password =
    	req.getParameter("password"); 
    	PrintWriter out = res.getWriter();
    	out.println("username "+ username +"password "+ password + "by Get");
		 
    }

}

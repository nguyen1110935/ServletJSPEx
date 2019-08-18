package nguyen1110935.LoginSample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SdServlet
 */
@WebServlet("/SdServlet")
public class SdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String username = (String) request.getAttribute("username"); 
		String pass = (String) request.getAttribute("pass"); 
		//out.println("Hello Man "+ username + "Pass " + pass + "by second servlet");
		HttpSession session = request.getSession();
		String oldpass = session.getAttribute("pa") == null? "pass123" : (String) session.getAttribute("pa");
		System.out.println("Lodpass is "+oldpass + " "+ (String) session.getAttribute("pa"));
		
		if (username.equals("nguyen1110935")&& pass.equals(oldpass)){
			session.setAttribute("send", "You logged in successfully");
			session.setAttribute("tojsp", pass);
			getServletContext().setAttribute("sendapp", "Have a great working day.");
			
			//choice 1: getServletContext().getRequestDispatcher("/ServletToJSP.jsp").forward(request, response);
			getServletContext().getRequestDispatcher("/loadjsp").forward(request, response);
		}
		else {
			response.sendRedirect("/SampleLogin/logfail.html");
		} 
	}
}
